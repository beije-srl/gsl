package it.beije.gsl.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseGslDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session currentOrOpenSession() {
		try {
			return sessionFactory.openSession();
		} catch (Exception e) {
			return sessionFactory.getCurrentSession();
		}
	}

}
