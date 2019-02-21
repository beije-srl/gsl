import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.beije.gsl.dao.model.Authorities;
import it.beije.gsl.dao.model.User;

public class AuthoritiesTest {
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext("spring-servlet-test.xml");
	}
	
	@Test
	public void testConnessione() {

		SessionFactory sf = context.getBean(SessionFactory.class);
		Session session = sf.openSession();
		Authorities auth = (Authorities) session.createCriteria(Authorities.class).add(Restrictions.eq("id_authorities", 1))
				.uniqueResult();
		
		
		System.out.println(auth.toString());
	}
}
