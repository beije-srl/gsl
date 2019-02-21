package it.beije.gsl.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.beije.gsl.dao.DipendenteDao;
import it.beije.gsl.dao.model.Contratto;
import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.Presentazione;
import it.beije.gsl.dao.model.StatConsulenti;
import it.beije.gsl.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {

	private final static Logger LOG = LoggerFactory.getLogger(DipendenteServiceImpl.class);
	
	@Autowired
	private DipendenteDao dipendenteDao;

	@Override
	public StatConsulenti getStatConsulenti() {
		LOG.trace("DipendentiService.getStatConsulenti()");
		// TODO Auto-generated method stub
		StatConsulenti stat1 = new StatConsulenti();
		stat1.setTotale(50);
		stat1.setNumJava(30);
		stat1.setNumDotNet(15);
		stat1.setNumAltro(5);
		stat1.setNumBackEnd(40);
		stat1.setNumFrontEnd(10);
		return stat1;
	}

	@Override
	public List<Contratto> getListaContrattiInScadenza() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see it.beije.gsl.service.DashboardService#getListaConsulentiDisponibili()
	 */
	@Override
	@Transactional
	public List<Dipendente> getListaConsulentiDisponibili() {
		LOG.trace("DashboardService.getListaConsulentiDisponibili()");
		return dipendenteDao.getDipendentiDisponibili();
	}

	@Override
	public Presentazione getListaPresentazioniInCorso() {
		LOG.trace("DashboardService.getPresentazioniInCorso()");
		// TODO Auto-generated method stub
		Presentazione pres = new Presentazione();
		pres.setIdAzienda(50);
		pres.setIdDipendente(30);
		pres.setNomeDipendente("Donato");
		pres.setNomeAzienda("Beije");
		
		return pres;
	}

}
