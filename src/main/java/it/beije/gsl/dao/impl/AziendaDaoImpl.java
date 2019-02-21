package it.beije.gsl.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.beije.gsl.dao.AziendaDao;
import it.beije.gsl.dao.model.Azienda;

@Repository
public class AziendaDaoImpl extends BaseGslDao implements AziendaDao {

	@Override
	public Azienda getAziendaById(int id) {
		Session session = currentOrOpenSession();
		Azienda azienda = (Azienda) session.createCriteria(Azienda.class).add(Restrictions.eq("idAzienda", id)).uniqueResult();
		return azienda;
	}

	@Override
	public boolean updateAzienda(Azienda azienda) {
		Session session = currentOrOpenSession();
		session.beginTransaction();
		session.update(azienda);
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean insertAzienda(Azienda azienda) {
		Session session = currentOrOpenSession();
		session.beginTransaction();
		session.save(azienda);
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteAzienda(Azienda azienda) {
		Session session = currentOrOpenSession();
		session.beginTransaction();
		session.delete(azienda);
		session.getTransaction().commit();
		return true;
	}

	@Override
	public Azienda getAzienda(Azienda azienda) {
		Session session = currentOrOpenSession();
		Azienda az = (Azienda) session.createCriteria(Azienda.class)
				.add(Restrictions.eq("idAzienda", azienda.getIdAzienda())).uniqueResult();
		return az;
	}

}
