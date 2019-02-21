package it.beije.gsl.rest.model;

import java.util.List;

import it.beije.gsl.dao.model.Dipendente;

/**
 * Response class for
 * {@link it.beije.gsl.rest.controller.DipendentiController#getListaDipendenti()}.
 * 
 * @author Donato Rimenti
 */
public class GetListaDipendentiRestResponse extends BaseGslServletRestResponse {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Employees list.
	 */
	private List<Dipendente> dipendenti;

	/**
	 * Gets the {@link #dipendenti}.
	 *
	 * @return the {@link #dipendenti}.
	 */
	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	/**
	 * Sets the {@link #dipendenti}.
	 *
	 * @param dipendenti
	 *            the new {@link #dipendenti}.
	 */
	public void setDipendenti(List<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.gsl.rest.model.BaseGslServletRestResponse#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dipendenti == null) ? 0 : dipendenti.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.gsl.rest.model.BaseGslServletRestResponse#equals(java.lang.
	 * Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetListaDipendentiRestResponse other = (GetListaDipendentiRestResponse) obj;
		if (dipendenti == null) {
			if (other.dipendenti != null)
				return false;
		} else if (!dipendenti.equals(other.dipendenti))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.gsl.rest.model.BaseGslServletRestResponse#toString()
	 */
	@Override
	public String toString() {
		return "GetListaDipendentiRestResponse [dipendenti=" + dipendenti + "]";
	}

}