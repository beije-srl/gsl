package it.beije.gsl.dao;

import it.beije.gsl.dao.model.Azienda;

public interface AziendaDao {

	public Azienda getAziendaById(int id);

	public boolean updateAzienda(Azienda azienda);

	public boolean insertAzienda(Azienda azienda);

	/**
	 * Logical delete of the record.
	 * 
	 * @param azienda
	 *            the company to delete
	 * @return the outcome of the operation
	 */
	public boolean deleteAzienda(Azienda azienda);

	public Azienda getAzienda(Azienda azienda);

}