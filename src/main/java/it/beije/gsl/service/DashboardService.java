package it.beije.gsl.service;

import java.util.List;

import it.beije.gsl.dao.model.Contratto;
import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.Presentazione;
import it.beije.gsl.dao.model.StatConsulenti;

public interface DashboardService {
	
	public StatConsulenti getStatConsulenti();
	
	public List<Contratto> getListaContrattiInScadenza();
	
	/**
	 * Returns a list of free employees.
	 * 
	 * @return a list of employees
	 */
	
	public List<Dipendente> getListaConsulentiDisponibili();
	
	public Presentazione getListaPresentazioniInCorso();
}
