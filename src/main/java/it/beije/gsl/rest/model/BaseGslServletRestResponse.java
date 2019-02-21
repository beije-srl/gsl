package it.beije.gsl.rest.model;

import java.io.Serializable;

/**
 * Base response for the REST services of this application.
 * 
 * @author Donato Rimenti
 */
public class BaseGslServletRestResponse implements Serializable {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The outcome of the operation.
	 */
	protected boolean outcome;

	/**
	 * The error message.
	 */
	protected String message;

	/**
	 * Gets the {@link #message}.
	 *
	 * @return the {@link #message}.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the {@link #message}.
	 *
	 * @param message
	 *            the new {@link #message}.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Instantiates a new BaseGslServletRestResponse.
	 */
	public BaseGslServletRestResponse() {
		this.outcome = true;
	}

	/**
	 * Instantiates a new BaseGslServletRestResponse.
	 *
	 * @param outcome
	 *            the {@link #outcome}.
	 */
	public BaseGslServletRestResponse(boolean outcome) {
		this.outcome = outcome;
	}

	/**
	 * Instantiates a new BaseGslServletRestResponse.
	 *
	 * @param errorMessage
	 *            the {@link #message}.
	 */
	public BaseGslServletRestResponse(String errorMessage) {
		this.outcome = false;
		this.message = errorMessage;
	}

	/**
	 * Instantiates a new BaseGslServletRestResponse.
	 *
	 * @param outcome
	 *            the {@link #outcome}.
	 * @param message
	 *            the {@link #message}.
	 */
	public BaseGslServletRestResponse(boolean outcome, String message) {
		this.outcome = outcome;
		this.message = message;
	}

	/**
	 * Checks if is outcome.
	 *
	 * @return true, if is outcome
	 */
	public boolean isOutcome() {
		return outcome;
	}

	/**
	 * Sets the {@link #outcome}.
	 *
	 * @param outcome
	 *            the new {@link #outcome}.
	 */
	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + (outcome ? 1231 : 1237);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseGslServletRestResponse other = (BaseGslServletRestResponse) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (outcome != other.outcome)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseGslServletRestResponse [outcome=" + outcome + ", message=" + message + "]";
	}

}
