package it.beije.gsl.dao;

import java.util.List;

import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.FiltroDipendenti;

public interface DipendenteDao {
	
	public Dipendente getDipendenteById(int id);
	
	public List<Dipendente> getDipendentiDisponibili();
	
	public boolean updateDipendente(Dipendente dipendente);
	
	public boolean insertDipendente(Dipendente dipendente);
	
	/**
	 * Logical delete of the record.
	 * 
	 * @param dipendente
	 *            the employee to delete
	 * @return the outcome of the operation
	 */
	public boolean deleteDipendente(Dipendente dipendente);
	
	public Dipendente getDipendente(Dipendente dipendente);
	
	public List<Dipendente> getListaDipendenti(FiltroDipendenti filtro, int pagina, String orderBy);
	
}