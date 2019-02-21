import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import it.beije.gsl.dao.AziendaDao;
import it.beije.gsl.dao.impl.AziendaDaoImpl;
import it.beije.gsl.dao.model.Azienda;
import it.beije.gsl.dao.model.Opportunita;
import it.beije.gsl.dao.model.TipoAzienda;


public class AziendaTest {

	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext("spring-servlet-test.xml");
	}
	
	@Test
	public void testConnessione() {
		
		SessionFactory sf = context.getBean(SessionFactory.class);
		
//		Assert.assertNotNull(bean);
		
		 Session session = sf.openSession();
		 Azienda azienda = (Azienda) session.createCriteria(Azienda.class).add(Restrictions.eq("idAzienda", 1)).uniqueResult();
		 //System.out.println(azienda.getNome());
		 
		 java.util.Set<Opportunita> opp = azienda.getOpportunita();
		 
		 for (Opportunita obj : opp) {
			 System.out.println(obj.toString());
			
		}
		 
		 java.util.Set<TipoAzienda> tip = azienda.getTipoAzienda();
		 
		 for (TipoAzienda obj : tip) {
			 System.out.println("Nome :" + obj.getNome());
			 System.out.println(obj.toString());
			
		}
//		 System.out.println(azienda.getOpportunita());
//		 System.out.println(azienda.getTipoAzienda());
		 
	}
	
	@Test
	public void getAziendaByIdTest(){
		AziendaDaoImpl azienda = context.getBean(AziendaDaoImpl.class);
		
		Azienda az = azienda.getAziendaById(1);
	}
	
	@Test
	@Ignore
	public void insertAziendaTest(){
		AziendaDaoImpl azienda = context.getBean(AziendaDaoImpl.class);
		Azienda az = new Azienda();
		az.setIdAzienda(2);
		az.setNome("test");
		az.setIndirizzo("test");
		az.setCitta("test");
		az.setRegione("test");
		az.setPartitaIva("test");
//		az.setPartners(1);
		az.setPropositivo(false);
		az.setSubfornitura(false);
		az.setConsulentiPartita(false);
		az.setTecnologie(1);
		az.setNomeReferente("test");
		az.setMailReferente("test");
		az.setStatus(1);
		az.setTerminiPagamenti(1);
		
		azienda.insertAzienda(az);
	}
	
	@Test
	@Ignore
	public void updateAziendaTest(){
		AziendaDaoImpl azienda = context.getBean(AziendaDaoImpl.class);
		Azienda az = new Azienda();
		az.setIdAzienda(2);
		az.setNome("test2");
		az.setIndirizzo("test2");
		az.setCitta("test2");
		az.setRegione("test2");
		az.setPartitaIva("test");
//		az.setPartners(1);
		az.setPropositivo(false);
		az.setSubfornitura(false);
		az.setConsulentiPartita(false);
		az.setTecnologie(1);
		az.setNomeReferente("test");
		az.setMailReferente("test");
		az.setStatus(1);
		az.setTerminiPagamenti(1);
		
		azienda.updateAzienda(az);
	}
	
	@Test
	@Ignore
	public void deleteAziendaTest(){
		AziendaDaoImpl azienda = context.getBean(AziendaDaoImpl.class);
		Azienda az = new Azienda();
		az.setIdAzienda(2);
		az.setNome("test2");
		az.setIndirizzo("test2");
		az.setCitta("test2");
		az.setRegione("test2");
		az.setPartitaIva("test");
//		az.setPartners(1);
		az.setPropositivo(false);
		az.setSubfornitura(false);
		az.setConsulentiPartita(false);
		az.setTecnologie(1);
		az.setNomeReferente("test");
		az.setMailReferente("test");
		az.setStatus(1);
		az.setTerminiPagamenti(1);
		
		azienda.deleteAzienda(az);
	}
	
	@Test
	public void getAziendaTest(){
		AziendaDaoImpl azienda = context.getBean(AziendaDaoImpl.class);
		Azienda az = new Azienda();
		az.setIdAzienda(2);
		az.setNome("test");
		az.setIndirizzo("test");
		az.setCitta("test");
		az.setRegione("test");
		az.setPartitaIva("test");
//		az.setPartners(1);
		az.setPropositivo(false);
		az.setSubfornitura(false);
		az.setConsulentiPartita(false);
		az.setTecnologie(1);
		az.setNomeReferente("test");
		az.setMailReferente("test");
		az.setStatus(1);
		az.setTerminiPagamenti(1);
		
		azienda.getAzienda(az);
	}
	
	@Test
	public void mappingManyToMany(){
		AziendaDaoImpl azienda = context.getBean(AziendaDaoImpl.class);
		
		Azienda az = azienda.getAziendaById(2);
		System.out.println(az.getPartners().get(0).getNome());
	}

}
