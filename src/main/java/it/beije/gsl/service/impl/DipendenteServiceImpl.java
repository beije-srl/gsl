package it.beije.gsl.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.beije.gsl.dao.DipendenteDao;
import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.FiltroDipendenti;
import it.beije.gsl.dao.model.Tecnologia;
import it.beije.gsl.service.DipendenteService;

/**
 * Service for handling employees.
 * 
 * @author Donato Rimenti
 *
 */
@Service
public class DipendenteServiceImpl implements DipendenteService {

	/**
	 * Logger.
	 */
	private final static Logger LOG = LoggerFactory.getLogger(DipendenteServiceImpl.class);

	@Autowired
	private DipendenteDao dipendenteDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.gsl.service.DipendenteService#getListaDipendenti(int,
	 * java.lang.String)
	 */
	@Override
	@Transactional
	public List<Dipendente> getListaDipendenti(FiltroDipendenti filtro, int pagina, String orderBy) {
		LOG.trace("DipendentiService.getListaDipendenti()");
		return dipendenteDao.getListaDipendenti(filtro, 1, null);
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.gsl.service.DipendenteService#eliminaDipendente()
	 */
	@Override
	@Transactional
	public boolean eliminaDipendente(Dipendente dipendente) {
		return dipendenteDao.deleteDipendente(dipendente);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.beije.gsl.service.DipendenteService#aggiungiDipendente(it.beije.gsl.
	 * dao.model.Dipendente)
	 */
	@Override
	@Transactional
	public boolean aggiungiDipendente(Dipendente dipendente) {
		return dipendenteDao.insertDipendente(dipendente);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.beije.gsl.service.DipendenteService#updateDipendente(it.beije.gsl.dao.
	 * model.Dipendente)
	 */
	@Override
	@Transactional
	public boolean updateDipendente(Dipendente dipendente) {
		return dipendenteDao.updateDipendente(dipendente);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.gsl.service.DipendenteService#getDipendenteById(int)
	 */
	@Override
	@Transactional
	public Dipendente getDipendenteById(int id) {
		return dipendenteDao.getDipendenteById(id);
	}

	@Override
	public boolean eliminaDipendente() {
		// TODO Auto-generated method stub
		return false;
	}

}
