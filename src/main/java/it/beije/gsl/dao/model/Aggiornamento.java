package it.beije.gsl.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Aggiornamento implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String contenuto;
	private Date data;
	private TipoAggiornamento tipoAggiornamento;
	private Dipendente dipendente;
	private Azienda colloquioSuAzienda;
	private Tags tag;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TipoAggiornamento getTipoAggiornamento() {
		return tipoAggiornamento;
	}
	public void setTipoAggiornamento(TipoAggiornamento tipoAggiornamento) {
		this.tipoAggiornamento = tipoAggiornamento;
	}
	public Dipendente getDipendente() {
		return dipendente;
	}
	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	public Azienda getColloquioSuAzienda() {
		return colloquioSuAzienda;
	}
	public void setColloquioSuAzienda(Azienda colloquioSuAzienda) {
		this.colloquioSuAzienda = colloquioSuAzienda;
	}
	public Tags getTag() {
		return tag;
	}
	public void setTag(Tags tag) {
		this.tag = tag;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colloquioSuAzienda == null) ? 0 : colloquioSuAzienda.hashCode());
		result = prime * result + ((contenuto == null) ? 0 : contenuto.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((dipendente == null) ? 0 : dipendente.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result + ((tipoAggiornamento == null) ? 0 : tipoAggiornamento.hashCode());
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
		Aggiornamento other = (Aggiornamento) obj;
		if (colloquioSuAzienda == null) {
			if (other.colloquioSuAzienda != null)
				return false;
		} else if (!colloquioSuAzienda.equals(other.colloquioSuAzienda))
			return false;
		if (contenuto == null) {
			if (other.contenuto != null)
				return false;
		} else if (!contenuto.equals(other.contenuto))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (dipendente == null) {
			if (other.dipendente != null)
				return false;
		} else if (!dipendente.equals(other.dipendente))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (tipoAggiornamento == null) {
			if (other.tipoAggiornamento != null)
				return false;
		} else if (!tipoAggiornamento.equals(other.tipoAggiornamento))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aggiornamento [id=" + id + ", contenuto=" + contenuto + ", data=" + data + ", tipoAggiornamento="
				+ tipoAggiornamento + ", dipendente=" + dipendente + ", colloquioSuAzienda=" + colloquioSuAzienda
				+ ", tag=" + tag + "]";
	}

}
