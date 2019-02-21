package it.beije.gsl.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.Presentazione;
import it.beije.gsl.dao.model.StatConsulenti;
import it.beije.gsl.rest.model.GetListaConsulentiDisponibiliRestResponse;
import it.beije.gsl.rest.model.GetListaDipendentiRestResponse;
import it.beije.gsl.rest.model.GetListaPresentazioniRestResponse;
import it.beije.gsl.rest.model.GetStatConsulentiRestResponse;
import it.beije.gsl.service.DashboardService;
import it.beije.gsl.service.DipendenteService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	/**
	 * Logger.
	 */
	private final static Logger LOG = LoggerFactory.getLogger(DashboardController.class);

	/**
	 * Service for this class.
	 */
	@Autowired
	private DashboardService service;

	/**
	 * Returns a list of available employees.
	 * 
	 * @return a list of employees
	 */
	@RequestMapping(value = "/getListaConsulentiDisponibili", method = RequestMethod.GET)
	public @ResponseBody GetListaConsulentiDisponibiliRestResponse getListaConsulentiDisponibili() {
		LOG.info("DashboardController.getListaConsulentiDisponibili");

		List<Dipendente> listaConsulentiDisponibili = service.getListaConsulentiDisponibili();

		GetListaConsulentiDisponibiliRestResponse response = new GetListaConsulentiDisponibiliRestResponse();
		response.setConsulentiDisponibili(listaConsulentiDisponibili);

		return response;
	}

	@RequestMapping(value = "/getStatConsulenti", method = RequestMethod.GET)
	public @ResponseBody GetStatConsulentiRestResponse getStatConsulenti() {
		LOG.info("DashboardController.getStatConsulenti");

		StatConsulenti statConsulenti = service.getStatConsulenti();

		GetStatConsulentiRestResponse response = new GetStatConsulentiRestResponse();
		response.setStatConsulenti(statConsulenti);

		return response;
	}

	@RequestMapping(value = "/getListaPresentazioniInCorso", method = RequestMethod.GET)
	public @ResponseBody GetListaPresentazioniRestResponse getListaPresentazioniInCorso() {
		LOG.info("DashboardController.getListaPresentazioniInCorso");

		Presentazione presentazione = service.getListaPresentazioniInCorso();

		GetListaPresentazioniRestResponse response = new GetListaPresentazioniRestResponse();
		response.setPresentazione(presentazione);
		return response;
	}
}
