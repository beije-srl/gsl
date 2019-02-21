package it.beije.gsl.dao;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDao {
	
	public UserDetails getUserByEmail(String email);

}
