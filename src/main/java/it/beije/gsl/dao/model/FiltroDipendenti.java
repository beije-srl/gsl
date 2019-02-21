package it.beije.gsl.dao.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FiltroDipendenti {
	
	private List<String> tecnologie;
	
	private FiltroTemporale dataCreazione;
	
	private FiltroTemporale dataUltimaModifica;
	
	private List<String> tags;
	
	private FiltroTemporale dataUltimoContatto;
	
	private FiltroTemporale dataColloquio;
	
	private List<String> figureProfessionali;
	
	private List<String> seniority;
	
	private String area;
	
	private FiltroTemporale dataNascita;
	
	private String tipoCollaborazione;
	
	private String statoAttuale;
	
	private String fonte;
	
	private Integer votoColloquio;
	
	private Integer disponibilita;

	private HashMap<String, List<String>> pilaQuery;

	public List<String> getTecnologie() {
		return tecnologie;
	}

	public void setTecnologie(List<String> tecnologie) {
		this.tecnologie = tecnologie;
	}

	public FiltroTemporale getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(FiltroTemporale dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public FiltroTemporale getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(FiltroTemporale dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public FiltroTemporale getDataUltimoContatto() {
		return dataUltimoContatto;
	}

	public void setDataUltimoContatto(FiltroTemporale dataUltimoContatto) {
		this.dataUltimoContatto = dataUltimoContatto;
	}

	public FiltroTemporale getDataColloquio() {
		return dataColloquio;
	}

	public void setDataColloquio(FiltroTemporale dataColloquio) {
		this.dataColloquio = dataColloquio;
	}

	public List<String> getFigureProfessionali() {
		return figureProfessionali;
	}

	public void setFigureProfessionali(List<String> figureProfessionali) {
		this.figureProfessionali = figureProfessionali;
	}

	public List<String> getSeniority() {
		return seniority;
	}

	public void setSeniority(List<String> seniority) {
		this.seniority = seniority;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public FiltroTemporale getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(FiltroTemporale dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getTipoCollaborazione() {
		return tipoCollaborazione;
	}

	public void setTipoCollaborazione(String tipoCollaborazione) {
		this.tipoCollaborazione = tipoCollaborazione;
	}

	public String getStatoAttuale() {
		return statoAttuale;
	}

	public void setStatoAttuale(String statoAttuale) {
		this.statoAttuale = statoAttuale;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public Integer getVotoColloquio() {
		return votoColloquio;
	}

	public void setVotoColloquio(Integer votoColloquio) {
		this.votoColloquio = votoColloquio;
	}

	public Integer getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(Integer disponibilita) {
		this.disponibilita = disponibilita;
	}


	public HashMap<String, List<String>> getPilaQuery() {
		return pilaQuery;
	}

	public void setPilaQuery() {
		pilaQuery = new HashMap<>();
		if(this.getTags()!=null && !this.getTags().isEmpty()) {
			pilaQuery.put("tags", this.getTags());
		}
		if(this.getFigureProfessionali()!=null && !this.getFigureProfessionali().isEmpty()) {
			pilaQuery.put("figuraProfessionale", this.getFigureProfessionali());
		}
		if(this.getSeniority()!=null && !this.getSeniority().isEmpty()) {
			pilaQuery.put("seniority", this.getSeniority());
		}
		if(this.getArea()!=null && !this.getArea().isEmpty()) {
			pilaQuery.put("area", Collections.singletonList(this.getArea()));
		}
		if(this.getTipoCollaborazione()!=null && !this.getTipoCollaborazione().isEmpty()) {
			pilaQuery.put("tipoCollaborazione", new ArrayList<>(Collections.singleton(this.getTipoCollaborazione())));
		}
		if(this.getStatoAttuale()!=null && !this.getStatoAttuale().isEmpty()) {
			pilaQuery.put("statoAttuale", new ArrayList<>(Collections.singleton(this.getStatoAttuale())));
		}
		if(this.getFonte()!=null && !this.getFonte().isEmpty()) {
			pilaQuery.put("fonte", new ArrayList<>(Collections.singleton(this.getFonte())));
		}
		if(this.getVotoColloquio()!=null) {
			pilaQuery.put("votoColloquio", new ArrayList<String>(Collections.singleton(Integer.toString(this.getVotoColloquio()))));
		}

	}
}
