package it.beije.gsl.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.beije.gsl.dao.DipendenteDao;
import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.FiltroDipendenti;

@Repository
public class DipendenteDaoImpl extends BaseGslDao implements DipendenteDao {

    // LOGGER
    public static int NUM_DIPENDENTI_MOSTRATI = 5;

    @Override
    public Dipendente getDipendenteById(int id) {
        Session session = currentOrOpenSession();
        Dipendente dip = (Dipendente) session.createCriteria(Dipendente.class).add(Restrictions.eq("idDipendente", id))
                .uniqueResult();

        return dip;
    }

    @Override
    public boolean updateDipendente(Dipendente dipendente) {
        Session session = currentOrOpenSession();
        session.beginTransaction();
        session.update(dipendente);
        session.getTransaction().commit();

        return true;
    }

    @Override
    public boolean insertDipendente(Dipendente dipendente) {
        Session session = currentOrOpenSession();
        session.beginTransaction();
        session.save(dipendente);
        session.getTransaction().commit();

        return true;

    }

    @Override
    public boolean deleteDipendente(Dipendente dipendente) {
        Session session = currentOrOpenSession();
        session.beginTransaction();
        session.delete(dipendente);
        session.getTransaction().commit();

        return true;
    }

    @Override
    public Dipendente getDipendente(Dipendente dipendente) {
        Session session = currentOrOpenSession();
        Dipendente dip = (Dipendente) session.createCriteria(Dipendente.class)
                .add(Restrictions.eq("idDipendente", dipendente.getIdDipendente())).uniqueResult();

        return dip;
    }

    // Metodo che ritorna i dipendenti che hanno STATO ATTUALE = 0 che dovrebbe
    // rappresentare lo stato libero.

    @Override
    public List<Dipendente> getDipendentiDisponibili() {
        Session session = currentOrOpenSession();
        List<Dipendente> listaDip = session.createCriteria(Dipendente.class).add(Restrictions.eq("statoAttuale", 0))
                .list();

        return listaDip;
    }

    @Override
    public List<Dipendente> getListaDipendenti(FiltroDipendenti filtro, int pagina, String orderBy) {
        Session session = currentOrOpenSession();
        Criteria criteria = session.createCriteria(Dipendente.class, "outer");
        if (filtro.getTecnologie() != null && !filtro.getTecnologie().isEmpty() && !(filtro.getTecnologie().size() == 1 && filtro.getTecnologie().get(0).equals(""))) {
            DipendenteDaoImpl.filtroTecnologie(filtro, criteria);
        }

        int primoElemento = (pagina * NUM_DIPENDENTI_MOSTRATI - NUM_DIPENDENTI_MOSTRATI);

        criteria.setFirstResult(primoElemento);
        criteria.setMaxResults(NUM_DIPENDENTI_MOSTRATI);

        List<Dipendente> listaDip = criteria.list();

        return listaDip;
    }

    /**
     * Metodo che prende un FiltroDipendenti e un Criteria e restituisce lo
     * stesso criteria in modo che filtri i dipendenti in base alle tecnologie.
     * I dipendenti che verranno restituiti dal criteria saranno tutti quelli
     * che conoscono tutte le tecnologie presenti nel FiltroDipendenti.
     *
     * @param filtro
     * @param criteria
     * @return Criteria
     */
    private static Criteria filtroTecnologie(FiltroDipendenti filtro, Criteria criteria) {

        DetachedCriteria innerQuery = DetachedCriteria.forClass(Dipendente.class, "inner");
        innerQuery.setProjection(Projections.rowCount());
        innerQuery.add(Restrictions.eqProperty("idDipendente", "outer.idDipendente"));
        innerQuery.createCriteria("tecnologie", "tech").add(Restrictions.in("tech.nome", filtro.getTecnologie()));

        criteria.add(Subqueries.eq(Long.valueOf(filtro.getTecnologie().size()), innerQuery));
        return criteria;
    }

}
