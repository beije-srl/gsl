package it.beije.gsl.service;

import java.util.List;

import it.beije.gsl.dao.model.Azienda;

public interface AziendaService {

	/**
	 * Returns a list of companies.
	 * 
	 * @return a list of companies
	 */
	public List<Azienda> getListaAziende(int pagina, String orderBy);

	public boolean eliminaAzienda();

	public boolean aggiungiAzienda(Azienda azienda);

	public boolean updateAzienda(Azienda azienda);
	
	public Azienda getAziendaById();

}