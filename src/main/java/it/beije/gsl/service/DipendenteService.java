package it.beije.gsl.service;

import java.util.List;

import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.FiltroDipendenti;

public interface DipendenteService {

	/**
	 * Returns a list of employees.
	 * 
	 * @return a list of employees
	 */
	public List<Dipendente> getListaDipendenti(FiltroDipendenti dipendenti, int pagina, String orderBy);

	public boolean eliminaDipendente();

	public boolean aggiungiDipendente(Dipendente dipendente);

	public boolean updateDipendente(Dipendente dipendente);

	public Dipendente getDipendenteById(int id);

	boolean eliminaDipendente(Dipendente dipendente);

}