package it.beije.gsl.dao.model;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class Offerta implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer numero;
	private String Oggetto;
	private Azienda azienda;
	private Date dataOfferta;
	private Dipendente consulente;
	private Double tariffaGiorno;
	private Date inizioProgetto;
	private Date fineProgetto;
	private Pagamento pagamento;
	private Integer numOrdine;
	private StatoOfferta statoOfferta;
	private Date dataOrdine;
	private Integer giornateTotaliEffettive;
	private Double budgetMensile;
	private Double importoTotale;
	private Files files;
	private Tags tags;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getOggetto() {
		return Oggetto;
	}
	public void setOggetto(String oggetto) {
		Oggetto = oggetto;
	}
	public Azienda getAzienda() {
		return azienda;
	}
	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}
	public Date getDataOfferta() {
		return dataOfferta;
	}
	public void setDataOfferta(Date dataOfferta) {
		this.dataOfferta = dataOfferta;
	}
	public Dipendente getConsulente() {
		return consulente;
	}
	public void setConsulente(Dipendente consulente) {
		this.consulente = consulente;
	}
	public Double getTariffaGiorno() {
		return tariffaGiorno;
	}
	public void setTariffaGiorno(Double tariffaGiorno) {
		this.tariffaGiorno = tariffaGiorno;
	}
	public Date getInizioProgetto() {
		return inizioProgetto;
	}
	public void setInizioProgetto(Date inizioProgetto) {
		this.inizioProgetto = inizioProgetto;
	}
	public Date getFineProgetto() {
		return fineProgetto;
	}
	public void setFineProgetto(Date fineProgetto) {
		this.fineProgetto = fineProgetto;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public Integer getNumOrdine() {
		return numOrdine;
	}
	public void setNumOrdine(Integer numOrdine) {
		this.numOrdine = numOrdine;
	}
	public StatoOfferta getStatoOfferta() {
		return statoOfferta;
	}
	public void setStatoOfferta(StatoOfferta statoOfferta) {
		this.statoOfferta = statoOfferta;
	}
	public Date getDataOrdine() {
		return dataOrdine;
	}
	public void setDataOrdine(Date dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	public Integer getGiornateTotaliEffettive() {
		return giornateTotaliEffettive;
	}
	public void setGiornateTotaliEffettive(Integer giornateTotaliEffettive) {
		this.giornateTotaliEffettive = giornateTotaliEffettive;
	}
	public Double getBudgetMensile() {
		return budgetMensile;
	}
	public void setBudgetMensile(Double budgetMensile) {
		this.budgetMensile = budgetMensile;
	}
	public Double getImportoTotale() {
		return importoTotale;
	}
	public void setImportoTotale(Double importoTotale) {
		this.importoTotale = importoTotale;
	}
	public Files getFiles() {
		return files;
	}
	public void setFiles(Files files) {
		this.files = files;
	}
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Oggetto == null) ? 0 : Oggetto.hashCode());
		result = prime * result + ((azienda == null) ? 0 : azienda.hashCode());
		result = prime * result + ((budgetMensile == null) ? 0 : budgetMensile.hashCode());
		result = prime * result + ((consulente == null) ? 0 : consulente.hashCode());
		result = prime * result + ((dataOfferta == null) ? 0 : dataOfferta.hashCode());
		result = prime * result + ((dataOrdine == null) ? 0 : dataOrdine.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((fineProgetto == null) ? 0 : fineProgetto.hashCode());
		result = prime * result + ((giornateTotaliEffettive == null) ? 0 : giornateTotaliEffettive.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((importoTotale == null) ? 0 : importoTotale.hashCode());
		result = prime * result + ((inizioProgetto == null) ? 0 : inizioProgetto.hashCode());
		result = prime * result + ((numOrdine == null) ? 0 : numOrdine.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((pagamento == null) ? 0 : pagamento.hashCode());
		result = prime * result + ((statoOfferta == null) ? 0 : statoOfferta.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((tariffaGiorno == null) ? 0 : tariffaGiorno.hashCode());
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
		Offerta other = (Offerta) obj;
		if (Oggetto == null) {
			if (other.Oggetto != null)
				return false;
		} else if (!Oggetto.equals(other.Oggetto))
			return false;
		if (azienda == null) {
			if (other.azienda != null)
				return false;
		} else if (!azienda.equals(other.azienda))
			return false;
		if (budgetMensile == null) {
			if (other.budgetMensile != null)
				return false;
		} else if (!budgetMensile.equals(other.budgetMensile))
			return false;
		if (consulente == null) {
			if (other.consulente != null)
				return false;
		} else if (!consulente.equals(other.consulente))
			return false;
		if (dataOfferta == null) {
			if (other.dataOfferta != null)
				return false;
		} else if (!dataOfferta.equals(other.dataOfferta))
			return false;
		if (dataOrdine == null) {
			if (other.dataOrdine != null)
				return false;
		} else if (!dataOrdine.equals(other.dataOrdine))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (fineProgetto == null) {
			if (other.fineProgetto != null)
				return false;
		} else if (!fineProgetto.equals(other.fineProgetto))
			return false;
		if (giornateTotaliEffettive == null) {
			if (other.giornateTotaliEffettive != null)
				return false;
		} else if (!giornateTotaliEffettive.equals(other.giornateTotaliEffettive))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (importoTotale == null) {
			if (other.importoTotale != null)
				return false;
		} else if (!importoTotale.equals(other.importoTotale))
			return false;
		if (inizioProgetto == null) {
			if (other.inizioProgetto != null)
				return false;
		} else if (!inizioProgetto.equals(other.inizioProgetto))
			return false;
		if (numOrdine == null) {
			if (other.numOrdine != null)
				return false;
		} else if (!numOrdine.equals(other.numOrdine))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (pagamento == null) {
			if (other.pagamento != null)
				return false;
		} else if (!pagamento.equals(other.pagamento))
			return false;
		if (statoOfferta == null) {
			if (other.statoOfferta != null)
				return false;
		} else if (!statoOfferta.equals(other.statoOfferta))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (tariffaGiorno == null) {
			if (other.tariffaGiorno != null)
				return false;
		} else if (!tariffaGiorno.equals(other.tariffaGiorno))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Offerta [id=" + id + ", numero=" + numero + ", Oggetto=" + Oggetto + ", azienda=" + azienda
				+ ", dataOfferta=" + dataOfferta + ", consulente=" + consulente + ", tariffaGiorno=" + tariffaGiorno
				+ ", inizioProgetto=" + inizioProgetto + ", fineProgetto=" + fineProgetto + ", pagamento=" + pagamento
				+ ", numOrdine=" + numOrdine + ", statoOfferta=" + statoOfferta + ", dataOrdine=" + dataOrdine
				+ ", giornateTotaliEffettive=" + giornateTotaliEffettive + ", budgetMensile=" + budgetMensile
				+ ", importoTotale=" + importoTotale + ", files=" + files + ", tags=" + tags + "]";
	}
}
