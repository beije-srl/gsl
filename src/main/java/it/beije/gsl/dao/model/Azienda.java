package it.beije.gsl.dao.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Azienda implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idAzienda;
	private String nome;
	private String indirizzo;
	private String citta;
	private String regione;
	private String partitaIva;
	private List<Azienda> partners;
	private Boolean propositivo;
	private Boolean subfornitura;
	private Boolean consulentiPartita;
	private Integer tecnologie;
	private String nomeReferente;
	private String mailReferente;
	private Integer status;
	private Integer terminiPagamenti;
	private String utenteInserimento;
	private String utenteUltimaModifica;
	private Set<TipoAzienda> tipoAzienda;
	private String note;
	private Integer files;
	private Integer tag;
	private Set<Opportunita> opportunita;

	public Integer getIdAzienda() {
		return idAzienda;
	}

	public void setIdAzienda(Integer idAzienda) {
		this.idAzienda = idAzienda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public List<Azienda> getPartners() {
		return partners;
	}

	public void setPartners(List<Azienda> partners) {
		this.partners = partners;
	}

	public Boolean getPropositivo() {
		return propositivo;
	}

	public void setPropositivo(Boolean propositivo) {
		this.propositivo = propositivo;
	}

	public Boolean getSubfornitura() {
		return subfornitura;
	}

	public void setSubfornitura(Boolean subfornitura) {
		this.subfornitura = subfornitura;
	}

	public Boolean getConsulentiPartita() {
		return consulentiPartita;
	}

	public void setConsulentiPartita(Boolean consulentiPartita) {
		this.consulentiPartita = consulentiPartita;
	}

	public Integer getTecnologie() {
		return tecnologie;
	}

	public void setTecnologie(Integer tecnologie) {
		this.tecnologie = tecnologie;
	}

	public String getNomeReferente() {
		return nomeReferente;
	}

	public void setNomeReferente(String nomeReferente) {
		this.nomeReferente = nomeReferente;
	}

	public String getMailReferente() {
		return mailReferente;
	}

	public void setMailReferente(String mailReferente) {
		this.mailReferente = mailReferente;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTerminiPagamenti() {
		return terminiPagamenti;
	}

	public void setTerminiPagamenti(Integer terminiPagamenti) {
		this.terminiPagamenti = terminiPagamenti;
	}

	public String getUtenteInserimento() {
		return utenteInserimento;
	}

	public void setUtenteInserimento(String utenteInserimento) {
		this.utenteInserimento = utenteInserimento;
	}

	public String getUtenteUltimaModifica() {
		return utenteUltimaModifica;
	}

	public void setUtenteUltimaModifica(String utenteUltimaModifica) {
		this.utenteUltimaModifica = utenteUltimaModifica;
	}

	public Set<TipoAzienda> getTipoAzienda() {
		return tipoAzienda;
	}

	public void setTipoAzienda(Set<TipoAzienda> tipoAzienda) {
		this.tipoAzienda = tipoAzienda;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getFiles() {
		return files;
	}

	public void setFiles(Integer files) {
		this.files = files;
	}

	public Integer getTag() {
		return tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
	}

	public Set<Opportunita> getOpportunita() {
		return opportunita;
	}

	public void setOpportunita(Set<Opportunita> opportunita) {
		this.opportunita = opportunita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((citta == null) ? 0 : citta.hashCode());
		result = prime * result + ((consulentiPartita == null) ? 0 : consulentiPartita.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((idAzienda == null) ? 0 : idAzienda.hashCode());
		result = prime * result + ((indirizzo == null) ? 0 : indirizzo.hashCode());
		result = prime * result + ((mailReferente == null) ? 0 : mailReferente.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeReferente == null) ? 0 : nomeReferente.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((opportunita == null) ? 0 : opportunita.hashCode());
		result = prime * result + ((partitaIva == null) ? 0 : partitaIva.hashCode());
		result = prime * result + ((partners == null) ? 0 : partners.hashCode());
		result = prime * result + ((propositivo == null) ? 0 : propositivo.hashCode());
		result = prime * result + ((regione == null) ? 0 : regione.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((subfornitura == null) ? 0 : subfornitura.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result + ((tecnologie == null) ? 0 : tecnologie.hashCode());
		result = prime * result + ((terminiPagamenti == null) ? 0 : terminiPagamenti.hashCode());
		result = prime * result + ((tipoAzienda == null) ? 0 : tipoAzienda.hashCode());
		result = prime * result + ((utenteInserimento == null) ? 0 : utenteInserimento.hashCode());
		result = prime * result + ((utenteUltimaModifica == null) ? 0 : utenteUltimaModifica.hashCode());
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
		Azienda other = (Azienda) obj;
		if (citta == null) {
			if (other.citta != null)
				return false;
		} else if (!citta.equals(other.citta))
			return false;
		if (consulentiPartita == null) {
			if (other.consulentiPartita != null)
				return false;
		} else if (!consulentiPartita.equals(other.consulentiPartita))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (idAzienda == null) {
			if (other.idAzienda != null)
				return false;
		} else if (!idAzienda.equals(other.idAzienda))
			return false;
		if (indirizzo == null) {
			if (other.indirizzo != null)
				return false;
		} else if (!indirizzo.equals(other.indirizzo))
			return false;
		if (mailReferente == null) {
			if (other.mailReferente != null)
				return false;
		} else if (!mailReferente.equals(other.mailReferente))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeReferente == null) {
			if (other.nomeReferente != null)
				return false;
		} else if (!nomeReferente.equals(other.nomeReferente))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (opportunita == null) {
			if (other.opportunita != null)
				return false;
		} else if (!opportunita.equals(other.opportunita))
			return false;
		if (partitaIva == null) {
			if (other.partitaIva != null)
				return false;
		} else if (!partitaIva.equals(other.partitaIva))
			return false;
		if (partners == null) {
			if (other.partners != null)
				return false;
		} else if (!partners.equals(other.partners))
			return false;
		if (propositivo == null) {
			if (other.propositivo != null)
				return false;
		} else if (!propositivo.equals(other.propositivo))
			return false;
		if (regione == null) {
			if (other.regione != null)
				return false;
		} else if (!regione.equals(other.regione))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (subfornitura == null) {
			if (other.subfornitura != null)
				return false;
		} else if (!subfornitura.equals(other.subfornitura))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (tecnologie == null) {
			if (other.tecnologie != null)
				return false;
		} else if (!tecnologie.equals(other.tecnologie))
			return false;
		if (terminiPagamenti == null) {
			if (other.terminiPagamenti != null)
				return false;
		} else if (!terminiPagamenti.equals(other.terminiPagamenti))
			return false;
		if (tipoAzienda == null) {
			if (other.tipoAzienda != null)
				return false;
		} else if (!tipoAzienda.equals(other.tipoAzienda))
			return false;
		if (utenteInserimento == null) {
			if (other.utenteInserimento != null)
				return false;
		} else if (!utenteInserimento.equals(other.utenteInserimento))
			return false;
		if (utenteUltimaModifica == null) {
			if (other.utenteUltimaModifica != null)
				return false;
		} else if (!utenteUltimaModifica.equals(other.utenteUltimaModifica))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Azienda [idAzienda=" + idAzienda + ", nome=" + nome + ", indirizzo=" + indirizzo + ", citta=" + citta
				+ ", regione=" + regione + ", partitaIva=" + partitaIva + ", partners=" + partners + ", propositivo="
				+ propositivo + ", subfornitura=" + subfornitura + ", consulentiPartita=" + consulentiPartita
				+ ", tecnologie=" + tecnologie + ", nomeReferente=" + nomeReferente + ", mailReferente=" + mailReferente
				+ ", status=" + status + ", terminiPagamenti=" + terminiPagamenti + ", utenteInserimento="
				+ utenteInserimento + ", utenteUltimaModifica=" + utenteUltimaModifica + ", tipoAzienda=" + tipoAzienda
				+ ", note=" + note + ", files=" + files + ", tag=" + tag + ", opportunita=" + opportunita + "]";
	}

}
