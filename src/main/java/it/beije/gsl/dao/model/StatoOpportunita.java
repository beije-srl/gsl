package it.beije.gsl.dao.model;

import java.io.Serializable;

public class StatoOpportunita implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String stato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((stato == null) ? 0 : stato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatoOpportunita other = (StatoOpportunita) obj;
		if (id != other.id)
			return false;
		if (stato == null) {
			if (other.stato != null)
				return false;
		} else if (!stato.equals(other.stato))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StatoOpportunita [id=" + id + ", stato=" + stato + "]";
	}

}
