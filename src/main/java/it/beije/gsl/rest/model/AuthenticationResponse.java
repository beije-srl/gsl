package it.beije.gsl.rest.model;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * Response for the authentication service.
 * 
 * @author Donato Rimenti
 */
public class AuthenticationResponse extends BaseGslServletRestResponse {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The authenticated user.
	 */
	private UserDetails user;

	/**
	 * Instantiates a new AuthenticationResponse.
	 */
	public AuthenticationResponse() {
	}

	/**
	 * Instantiates a new AuthenticationResponse.
	 *
	 * @param errorMessage
	 *            the {@link BaseGslServletRestResponse#message}.
	 */
	public AuthenticationResponse(String errorMessage) {
		super(errorMessage);
	}

	/**
	 * Instantiates a new AuthenticationResponse.
	 *
	 * @param outcome
	 *            the {@link BaseGslServletRestResponse#outcome}.
	 * @param user
	 *            the {@link #user}.
	 */
	public AuthenticationResponse(boolean outcome, UserDetails user) {
		super(outcome);
		this.user = user;
	}

	/**
	 * Gets the {@link #user}.
	 *
	 * @return the {@link #user}.
	 */
	public UserDetails getUser() {
		return user;
	}

	/**
	 * Sets the {@link #user}.
	 *
	 * @param user
	 *            the new {@link #user}.
	 */
	public void setUser(UserDetails user) {
		this.user = user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.interview.server.rest.model.
	 * BaseInterviewServletRestResponse#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.interview.server.rest.model.
	 * BaseInterviewServletRestResponse#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthenticationResponse other = (AuthenticationResponse) obj;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.interview.server.rest.model.
	 * BaseInterviewServletRestResponse#toString()
	 */
	@Override
	public String toString() {
		return "AuthenticationResponse [user=" + user + "]";
	}

}
