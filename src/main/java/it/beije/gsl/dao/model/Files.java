package it.beije.gsl.dao.model;

import java.io.Serializable;

public class Files implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String percorso;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPercorso() {
		return percorso;
	}

	public void setPercorso(String percorso) {
		this.percorso = percorso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((percorso == null) ? 0 : percorso.hashCode());
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
		Files other = (Files) obj;
		if (id != other.id)
			return false;
		if (percorso == null) {
			if (other.percorso != null)
				return false;
		} else if (!percorso.equals(other.percorso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Files [id=" + id + ", percorso=" + percorso + "]";
	}

}
