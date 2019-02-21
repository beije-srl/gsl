package it.beije.gsl.dao.model;

import java.io.Serializable;
import java.sql.Date;

public class Opportunita implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String titolo;
	private Integer numeroRisorse;
	private String tipoContratto;
	private Integer figuraProfessionale;
	private Integer tipoConsulente;
	private Integer tecnologie;
	private String descrizione;
	private String citta;
	private Integer durata;
	private Date dataRichiesta;
	private Integer costoMassimo;
	private String clienteFinale;
	private String gestoreAzienda;
	private Integer statoAttivita;
	private Integer priorita;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getNumeroRisorse() {
		return numeroRisorse;
	}

	public void setNumeroRisorse(Integer numeroRisorse) {
		this.numeroRisorse = numeroRisorse;
	}

	public String getTipoContratto() {
		return tipoContratto;
	}

	public void setTipoContratto(String tipoContratto) {
		this.tipoContratto = tipoContratto;
	}

	public Integer getFiguraProfessionale() {
		return figuraProfessionale;
	}

	public void setFiguraProfessionale(Integer figuraProfessionale) {
		this.figuraProfessionale = figuraProfessionale;
	}

	public Integer getTipoConsulente() {
		return tipoConsulente;
	}

	public void setTipoConsulente(Integer tipoConsulente) {
		this.tipoConsulente = tipoConsulente;
	}

	public Integer getTecnologie() {
		return tecnologie;
	}

	public void setTecnologie(Integer tecnologie) {
		this.tecnologie = tecnologie;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		this.durata = durata;
	}

	public Date getDataRichiesta() {
		return dataRichiesta;
	}

	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}

	public Integer getCostoMassimo() {
		return costoMassimo;
	}

	public void setCostoMassimo(Integer costoMassimo) {
		this.costoMassimo = costoMassimo;
	}

	public String getClienteFinale() {
		return clienteFinale;
	}

	public void setClienteFinale(String clienteFinale) {
		this.clienteFinale = clienteFinale;
	}

	public String getGestoreAzienda() {
		return gestoreAzienda;
	}

	public void setGestoreAzienda(String gestoreAzienda) {
		this.gestoreAzienda = gestoreAzienda;
	}

	public Integer getStatoAttivita() {
		return statoAttivita;
	}

	public void setStatoAttivita(Integer statoAttivita) {
		this.statoAttivita = statoAttivita;
	}

	public Integer getPriorita() {
		return priorita;
	}

	public void setPriorita(Integer priorita) {
		this.priorita = priorita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((citta == null) ? 0 : citta.hashCode());
		result = prime * result + ((clienteFinale == null) ? 0 : clienteFinale.hashCode());
		result = prime * result + ((costoMassimo == null) ? 0 : costoMassimo.hashCode());
		result = prime * result + ((dataRichiesta == null) ? 0 : dataRichiesta.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((durata == null) ? 0 : durata.hashCode());
		result = prime * result + ((figuraProfessionale == null) ? 0 : figuraProfessionale.hashCode());
		result = prime * result + ((gestoreAzienda == null) ? 0 : gestoreAzienda.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroRisorse == null) ? 0 : numeroRisorse.hashCode());
		result = prime * result + ((priorita == null) ? 0 : priorita.hashCode());
		result = prime * result + ((statoAttivita == null) ? 0 : statoAttivita.hashCode());
		result = prime * result + ((tecnologie == null) ? 0 : tecnologie.hashCode());
		result = prime * result + ((tipoConsulente == null) ? 0 : tipoConsulente.hashCode());
		result = prime * result + ((tipoContratto == null) ? 0 : tipoContratto.hashCode());
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
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
		Opportunita other = (Opportunita) obj;
		if (citta == null) {
			if (other.citta != null)
				return false;
		} else if (!citta.equals(other.citta))
			return false;
		if (clienteFinale == null) {
			if (other.clienteFinale != null)
				return false;
		} else if (!clienteFinale.equals(other.clienteFinale))
			return false;
		if (costoMassimo == null) {
			if (other.costoMassimo != null)
				return false;
		} else if (!costoMassimo.equals(other.costoMassimo))
			return false;
		if (dataRichiesta == null) {
			if (other.dataRichiesta != null)
				return false;
		} else if (!dataRichiesta.equals(other.dataRichiesta))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (durata == null) {
			if (other.durata != null)
				return false;
		} else if (!durata.equals(other.durata))
			return false;
		if (figuraProfessionale == null) {
			if (other.figuraProfessionale != null)
				return false;
		} else if (!figuraProfessionale.equals(other.figuraProfessionale))
			return false;
		if (gestoreAzienda == null) {
			if (other.gestoreAzienda != null)
				return false;
		} else if (!gestoreAzienda.equals(other.gestoreAzienda))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroRisorse == null) {
			if (other.numeroRisorse != null)
				return false;
		} else if (!numeroRisorse.equals(other.numeroRisorse))
			return false;
		if (priorita == null) {
			if (other.priorita != null)
				return false;
		} else if (!priorita.equals(other.priorita))
			return false;
		if (statoAttivita == null) {
			if (other.statoAttivita != null)
				return false;
		} else if (!statoAttivita.equals(other.statoAttivita))
			return false;
		if (tecnologie == null) {
			if (other.tecnologie != null)
				return false;
		} else if (!tecnologie.equals(other.tecnologie))
			return false;
		if (tipoConsulente == null) {
			if (other.tipoConsulente != null)
				return false;
		} else if (!tipoConsulente.equals(other.tipoConsulente))
			return false;
		if (tipoContratto == null) {
			if (other.tipoContratto != null)
				return false;
		} else if (!tipoContratto.equals(other.tipoContratto))
			return false;
		if (titolo == null) {
			if (other.titolo != null)
				return false;
		} else if (!titolo.equals(other.titolo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Opportunita [id=" + id + ", titolo=" + titolo + ", numeroRisorse=" + numeroRisorse + ", tipoContratto="
				+ tipoContratto + ", figuraProfessionale=" + figuraProfessionale + ", tipoConsulente=" + tipoConsulente
				+ ", tecnologie=" + tecnologie + ", descrizione=" + descrizione + ", citta=" + citta + ", durata="
				+ durata + ", dataRichiesta=" + dataRichiesta + ", costoMassimo=" + costoMassimo + ", clienteFinale="
				+ clienteFinale + ", gestoreAzienda=" + gestoreAzienda + ", statoAttivita=" + statoAttivita
				+ ", priorita=" + priorita + "]";
	}

}
