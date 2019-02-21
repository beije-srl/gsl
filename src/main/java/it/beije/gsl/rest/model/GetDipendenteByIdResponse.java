package it.beije.gsl.rest.model;

import it.beije.gsl.dao.model.Dipendente;

public class GetDipendenteByIdResponse extends BaseGslServletRestResponse{

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	private Dipendente dipendente;

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

	@Override
	public String toString() {
		return "GetDipendenteByIdResponse [dipendente=" + dipendente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dipendente == null) ? 0 : dipendente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetDipendenteByIdResponse other = (GetDipendenteByIdResponse) obj;
		if (dipendente == null) {
			if (other.dipendente != null)
				return false;
		} else if (!dipendente.equals(other.dipendente))
			return false;
		return true;
	}
	
	
}
