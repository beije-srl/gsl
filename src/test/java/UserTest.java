import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.beije.gsl.dao.model.User;

public class UserTest {
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setup() {
		context = new ClassPathXmlApplicationContext("spring-servlet-test.xml");
	}
	
	@Test
	public void testConnessione(){
		SessionFactory sf = context.getBean(SessionFactory.class);
		Session session = sf.openSession();
		User us = (User) session.createCriteria(User.class).add(Restrictions.eq("name", "Donato"))
				.uniqueResult();
		
		String email = us.getEmail();
		System.out.println(us.toString());
	}
}
