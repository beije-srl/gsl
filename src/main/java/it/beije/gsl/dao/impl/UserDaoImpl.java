package it.beije.gsl.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.beije.gsl.dao.UserDao;
import it.beije.gsl.dao.model.User;

@Repository
public class UserDaoImpl extends BaseGslDao implements UserDao, UserDetailsService {
	
	@Override
	public UserDetails getUserByEmail(String email) {
		Session session = currentOrOpenSession();
		User user = (User) session.createCriteria(User.class).add(Restrictions.eq("email", email)).uniqueResult();
		 
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
		return getUserByEmail(user);
	}

}
