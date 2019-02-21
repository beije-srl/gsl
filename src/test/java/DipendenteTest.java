import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.beije.gsl.dao.impl.DipendenteDaoImpl;
import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.FiltroDipendenti;
import it.beije.gsl.dao.model.Tecnologia;

public class DipendenteTest {

	private ClassPathXmlApplicationContext context;

	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext("spring-servlet-test.xml");
	}

	@Test
	@Ignore
	public void testConnessione() {

		SessionFactory sf = context.getBean(SessionFactory.class);

		// Assert.assertNotNull(bean);

		Session session = sf.openSession();

		Dipendente dip = (Dipendente) session.createCriteria(Dipendente.class).add(Restrictions.eq("idDipendente", 5))
				.uniqueResult();
		// System.out.println(azienda.getNome());

		java.util.Set<Tecnologia> opp = dip.getTecnologie();
		System.out.println(dip.toString());

		for (Tecnologia obj : opp) {
			System.out.println(obj.getNome().toString());

		}

	}

	@Test
	@Ignore
	public void getListaDipendentiDisponibiliTest() {
		DipendenteDaoImpl dip = context.getBean(DipendenteDaoImpl.class);

		System.out.println(dip.getDipendentiDisponibili());
	}

	@Test
	@Ignore
	public void filtroTecnologieTest() {
		DipendenteDaoImpl dip = context.getBean(DipendenteDaoImpl.class);
		FiltroDipendenti fd = new FiltroDipendenti();
		List<String> lista = new ArrayList<>();
		lista.add("MongoDB");
		lista.add("angular");
//		lista.add("java");
		fd.setTecnologie(lista);

		System.out.println(dip.getListaDipendenti(fd, 1, null).size());

	}
	
	@Test
	public void getDipendenteByIdTest(){
		DipendenteDaoImpl dip = context.getBean(DipendenteDaoImpl.class);
		Dipendente dipendente = dip.getDipendenteById(2);
		System.out.println(dipendente.getDataNascita());
	}

}
