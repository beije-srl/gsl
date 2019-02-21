package it.beije.gsl.dao.model;

import java.io.Serializable;

public class Authorities implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idAuthorities;
	private String nome;
	
	
	public Integer getIdAuthorities() {
		return idAuthorities;
	}
	public void setIdAuthorities(Integer idAuthorities) {
		this.idAuthorities = idAuthorities;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAuthorities == null) ? 0 : idAuthorities.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Authorities other = (Authorities) obj;
		if (idAuthorities == null) {
			if (other.idAuthorities != null)
				return false;
		} else if (!idAuthorities.equals(other.idAuthorities))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Authorities [idAuthorities=" + idAuthorities + ", nome=" + nome + "]";
	}
	
	
}
