package it.beije.gsl.rest.model;

import java.util.List;

import it.beije.gsl.dao.model.Dipendente;

public class GetListaConsulentiDisponibiliRestResponse extends BaseGslServletRestResponse{

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Employees list.
	 */
	private List<Dipendente> consulentiDisponibili;

	public List<Dipendente> getConsulentiDisponibili() {
		return consulentiDisponibili;
	}

	public void setConsulentiDisponibili(List<Dipendente> consulentiDisponibili) {
		this.consulentiDisponibili = consulentiDisponibili;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((consulentiDisponibili == null) ? 0 : consulentiDisponibili.hashCode());
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
		GetListaConsulentiDisponibiliRestResponse other = (GetListaConsulentiDisponibiliRestResponse) obj;
		if (consulentiDisponibili == null) {
			if (other.consulentiDisponibili != null)
				return false;
		} else if (!consulentiDisponibili.equals(other.consulentiDisponibili))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GetListaConsulentiDisponibiliRestResponse [consulentiDisponibili=" + consulentiDisponibili + "]";
	}
	
	
}
