package it.beije.gsl.dao.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

public class Dipendente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idDipendente;
	private String nome;
	private String cognome;
	private Date dataContratto;
	private Date dataColloquio;
	private String figuraProfessionale;
	private Integer seniority;
	private String opportunita;
	private Integer clienteAttuale;
	private String area;
	private String citta;
	private String titoloStudio;
	private String note;
	private String notePresentazione;
	private Date dataNascita;
	private String noteDisponibilita;
	private String noteRetribuzione;
	private Integer tipoCollaborazione;
	private String notaCosto;
	private Integer costo;
	private String telefono;
	private String mail;
	private String skype;
	private Integer statoAttuale;
	private String fonte;
	private String noteFonte;
	private String valutazioneHr;
	private String valutazioneTecnica;
	private String intervistatore;
	private String sedeColloquio;
	private Integer files;
	private Integer tags;
	private Set<Tecnologia> tecnologie;
	
	public Integer getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(Integer idDipendente) {
		this.idDipendente = idDipendente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataContratto() {
		return dataContratto;
	}

	public void setDataContratto(Date dataContratto) {
		this.dataContratto = dataContratto;
	}

	public Date getDataColloquio() {
		return dataColloquio;
	}

	public void setDataColloquio(Date dataColloquio) {
		this.dataColloquio = dataColloquio;
	}

	public String getFiguraProfessionale() {
		return figuraProfessionale;
	}

	public void setFiguraProfessionale(String figuraProfessionale) {
		this.figuraProfessionale = figuraProfessionale;
	}

	public Set<Tecnologia> getTecnologie() {
		return tecnologie;
	}

	public void setTecnologie(Set<Tecnologia> tecnologie) {
		this.tecnologie = tecnologie;
	}

	public Integer getSeniority() {
		return seniority;
	}

	public void setSeniority(Integer seniority) {
		this.seniority = seniority;
	}

	public String getOpportunita() {
		return opportunita;
	}

	public void setOpportunita(String opportunita) {
		this.opportunita = opportunita;
	}

	public Integer getClienteAttuale() {
		return clienteAttuale;
	}

	public void setClienteAttuale(Integer clienteAttuale) {
		this.clienteAttuale = clienteAttuale;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getTitoloStudio() {
		return titoloStudio;
	}

	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNotePresentazione() {
		return notePresentazione;
	}

	public void setNotePresentazione(String notePresentazione) {
		this.notePresentazione = notePresentazione;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getNoteDisponibilita() {
		return noteDisponibilita;
	}

	public void setNoteDisponibilita(String noteDisponibilita) {
		this.noteDisponibilita = noteDisponibilita;
	}

	public String getNoteRetribuzione() {
		return noteRetribuzione;
	}

	public void setNoteRetribuzione(String noteRetribuzione) {
		this.noteRetribuzione = noteRetribuzione;
	}

	public Integer getTipoCollaborazione() {
		return tipoCollaborazione;
	}

	public void setTipoCollaborazione(Integer tipoCollaborazione) {
		this.tipoCollaborazione = tipoCollaborazione;
	}

	public String getNotaCosto() {
		return notaCosto;
	}

	public void setNotaCosto(String notaCosto) {
		this.notaCosto = notaCosto;
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public Integer getStatoAttuale() {
		return statoAttuale;
	}

	public void setStatoAttuale(Integer statoAttuale) {
		this.statoAttuale = statoAttuale;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public String getNoteFonte() {
		return noteFonte;
	}

	public void setNoteFonte(String noteFonte) {
		this.noteFonte = noteFonte;
	}

	public String getValutazioneHr() {
		return valutazioneHr;
	}

	public void setValutazioneHr(String valutazioneHr) {
		this.valutazioneHr = valutazioneHr;
	}

	public String getValutazioneTecnica() {
		return valutazioneTecnica;
	}

	public void setValutazioneTecnica(String valutazioneTecnica) {
		this.valutazioneTecnica = valutazioneTecnica;
	}

	public String getIntervistatore() {
		return intervistatore;
	}

	public void setIntervistatore(String intervistatore) {
		this.intervistatore = intervistatore;
	}

	public String getSedeColloquio() {
		return sedeColloquio;
	}

	public void setSedeColloquio(String sedeColloquio) {
		this.sedeColloquio = sedeColloquio;
	}

	public Integer getFiles() {
		return files;
	}

	public void setFiles(Integer files) {
		this.files = files;
	}

	public Integer getTags() {
		return tags;
	}

	public void setTags(Integer tags) {
		this.tags = tags;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((citta == null) ? 0 : citta.hashCode());
		result = prime * result + ((clienteAttuale == null) ? 0 : clienteAttuale.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((costo == null) ? 0 : costo.hashCode());
		result = prime * result + ((dataColloquio == null) ? 0 : dataColloquio.hashCode());
		result = prime * result + ((dataContratto == null) ? 0 : dataContratto.hashCode());
		result = prime * result + ((dataNascita == null) ? 0 : dataNascita.hashCode());
		result = prime * result + ((figuraProfessionale == null) ? 0 : figuraProfessionale.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((fonte == null) ? 0 : fonte.hashCode());
		result = prime * result + ((idDipendente == null) ? 0 : idDipendente.hashCode());
		result = prime * result + ((intervistatore == null) ? 0 : intervistatore.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((notaCosto == null) ? 0 : notaCosto.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((noteDisponibilita == null) ? 0 : noteDisponibilita.hashCode());
		result = prime * result + ((noteFonte == null) ? 0 : noteFonte.hashCode());
		result = prime * result + ((notePresentazione == null) ? 0 : notePresentazione.hashCode());
		result = prime * result + ((noteRetribuzione == null) ? 0 : noteRetribuzione.hashCode());
		result = prime * result + ((opportunita == null) ? 0 : opportunita.hashCode());
		result = prime * result + ((sedeColloquio == null) ? 0 : sedeColloquio.hashCode());
		result = prime * result + ((seniority == null) ? 0 : seniority.hashCode());
		result = prime * result + ((skype == null) ? 0 : skype.hashCode());
		result = prime * result + ((statoAttuale == null) ? 0 : statoAttuale.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((tecnologie == null) ? 0 : tecnologie.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((tipoCollaborazione == null) ? 0 : tipoCollaborazione.hashCode());
		result = prime * result + ((titoloStudio == null) ? 0 : titoloStudio.hashCode());
		result = prime * result + ((valutazioneHr == null) ? 0 : valutazioneHr.hashCode());
		result = prime * result + ((valutazioneTecnica == null) ? 0 : valutazioneTecnica.hashCode());
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
		Dipendente other = (Dipendente) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (citta == null) {
			if (other.citta != null)
				return false;
		} else if (!citta.equals(other.citta))
			return false;
		if (clienteAttuale == null) {
			if (other.clienteAttuale != null)
				return false;
		} else if (!clienteAttuale.equals(other.clienteAttuale))
			return false;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (costo == null) {
			if (other.costo != null)
				return false;
		} else if (!costo.equals(other.costo))
			return false;
		if (dataColloquio == null) {
			if (other.dataColloquio != null)
				return false;
		} else if (!dataColloquio.equals(other.dataColloquio))
			return false;
		if (dataContratto == null) {
			if (other.dataContratto != null)
				return false;
		} else if (!dataContratto.equals(other.dataContratto))
			return false;
		if (dataNascita == null) {
			if (other.dataNascita != null)
				return false;
		} else if (!dataNascita.equals(other.dataNascita))
			return false;
		if (figuraProfessionale == null) {
			if (other.figuraProfessionale != null)
				return false;
		} else if (!figuraProfessionale.equals(other.figuraProfessionale))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (fonte == null) {
			if (other.fonte != null)
				return false;
		} else if (!fonte.equals(other.fonte))
			return false;
		if (idDipendente == null) {
			if (other.idDipendente != null)
				return false;
		} else if (!idDipendente.equals(other.idDipendente))
			return false;
		if (intervistatore == null) {
			if (other.intervistatore != null)
				return false;
		} else if (!intervistatore.equals(other.intervistatore))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (notaCosto == null) {
			if (other.notaCosto != null)
				return false;
		} else if (!notaCosto.equals(other.notaCosto))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (noteDisponibilita == null) {
			if (other.noteDisponibilita != null)
				return false;
		} else if (!noteDisponibilita.equals(other.noteDisponibilita))
			return false;
		if (noteFonte == null) {
			if (other.noteFonte != null)
				return false;
		} else if (!noteFonte.equals(other.noteFonte))
			return false;
		if (notePresentazione == null) {
			if (other.notePresentazione != null)
				return false;
		} else if (!notePresentazione.equals(other.notePresentazione))
			return false;
		if (noteRetribuzione == null) {
			if (other.noteRetribuzione != null)
				return false;
		} else if (!noteRetribuzione.equals(other.noteRetribuzione))
			return false;
		if (opportunita == null) {
			if (other.opportunita != null)
				return false;
		} else if (!opportunita.equals(other.opportunita))
			return false;
		if (sedeColloquio == null) {
			if (other.sedeColloquio != null)
				return false;
		} else if (!sedeColloquio.equals(other.sedeColloquio))
			return false;
		if (seniority == null) {
			if (other.seniority != null)
				return false;
		} else if (!seniority.equals(other.seniority))
			return false;
		if (skype == null) {
			if (other.skype != null)
				return false;
		} else if (!skype.equals(other.skype))
			return false;
		if (statoAttuale == null) {
			if (other.statoAttuale != null)
				return false;
		} else if (!statoAttuale.equals(other.statoAttuale))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (tecnologie == null) {
			if (other.tecnologie != null)
				return false;
		} else if (!tecnologie.equals(other.tecnologie))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoCollaborazione == null) {
			if (other.tipoCollaborazione != null)
				return false;
		} else if (!tipoCollaborazione.equals(other.tipoCollaborazione))
			return false;
		if (titoloStudio == null) {
			if (other.titoloStudio != null)
				return false;
		} else if (!titoloStudio.equals(other.titoloStudio))
			return false;
		if (valutazioneHr == null) {
			if (other.valutazioneHr != null)
				return false;
		} else if (!valutazioneHr.equals(other.valutazioneHr))
			return false;
		if (valutazioneTecnica == null) {
			if (other.valutazioneTecnica != null)
				return false;
		} else if (!valutazioneTecnica.equals(other.valutazioneTecnica))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dipendente [idDipendente=" + idDipendente + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataContratto=" + dataContratto + ", dataColloquio=" + dataColloquio + ", figuraProfessionale="
				+ figuraProfessionale + ", seniority=" + seniority + ", opportunita=" + opportunita
				+ ", clienteAttuale=" + clienteAttuale + ", area=" + area + ", citta=" + citta + ", titoloStudio="
				+ titoloStudio + ", note=" + note + ", notePresentazione=" + notePresentazione + ", dataNascita="
				+ dataNascita + ", noteDisponibilita=" + noteDisponibilita + ", noteRetribuzione=" + noteRetribuzione
				+ ", tipoCollaborazione=" + tipoCollaborazione + ", notaCosto=" + notaCosto + ", costo=" + costo
				+ ", telefono=" + telefono + ", mail=" + mail + ", skype=" + skype + ", statoAttuale=" + statoAttuale
				+ ", fonte=" + fonte + ", noteFonte=" + noteFonte + ", valutazioneHr=" + valutazioneHr
				+ ", valutazioneTecnica=" + valutazioneTecnica + ", intervistatore=" + intervistatore
				+ ", sedeColloquio=" + sedeColloquio + ", files=" + files + ", tags=" + tags + ", tecnologie="
				+ tecnologie + "]";
	}

}
