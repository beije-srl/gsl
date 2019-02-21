package it.beije.gsl.dao.model;

public class Presentazione {
	private Integer idDipendente;
	private Integer idAzienda;
	private String nomeAzienda;
	private String nomeDipendente;
	
	
	public Integer getIdDipendente() {
		return idDipendente;
	}
	public void setIdDipendente(Integer idDipendente) {
		this.idDipendente = idDipendente;
	}
	public Integer getIdAzienda() {
		return idAzienda;
	}
	public void setIdAzienda(Integer idAzienda) {
		this.idAzienda = idAzienda;
	}
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public String getNomeDipendente() {
		return nomeDipendente;
	}
	public void setNomeDipendente(String nomeDipendente) {
		this.nomeDipendente = nomeDipendente;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAzienda == null) ? 0 : idAzienda.hashCode());
		result = prime * result + ((idDipendente == null) ? 0 : idDipendente.hashCode());
		result = prime * result + ((nomeAzienda == null) ? 0 : nomeAzienda.hashCode());
		result = prime * result + ((nomeDipendente == null) ? 0 : nomeDipendente.hashCode());
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
		Presentazione other = (Presentazione) obj;
		if (idAzienda == null) {
			if (other.idAzienda != null)
				return false;
		} else if (!idAzienda.equals(other.idAzienda))
			return false;
		if (idDipendente == null) {
			if (other.idDipendente != null)
				return false;
		} else if (!idDipendente.equals(other.idDipendente))
			return false;
		if (nomeAzienda == null) {
			if (other.nomeAzienda != null)
				return false;
		} else if (!nomeAzienda.equals(other.nomeAzienda))
			return false;
		if (nomeDipendente == null) {
			if (other.nomeDipendente != null)
				return false;
		} else if (!nomeDipendente.equals(other.nomeDipendente))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Presentazione [idDipendente=" + idDipendente + ", idAzienda=" + idAzienda + ", nomeAzienda="
				+ nomeAzienda + ", nomeDipendente=" + nomeDipendente + "]";
	}
	
	
	
	
	
}
