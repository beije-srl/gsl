package it.beije.gsl.rest.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.beije.gsl.dao.model.Dipendente;
import it.beije.gsl.dao.model.FiltroDipendenti;
import it.beije.gsl.rest.model.GetDipendenteByIdResponse;
import it.beije.gsl.rest.model.GetListaDipendentiRestResponse;
import it.beije.gsl.service.DipendenteService;

/**
 * REST Services for handling employees.
 * 
 * @author Donato Rimenti
 *
 */
@Controller
@RequestMapping("/dipendenti")
public class DipendentiController {

	/**
	 * Logger.
	 */
	private final static Logger LOG = LoggerFactory.getLogger(DipendentiController.class);

	/**
	 * Service for this class.
	 */
	@Autowired
	private DipendenteService service;

	/**
	 * Returns a generic list of employees.
	 * 
	 * @return a list of employees
	 * @throws InterruptedException 
	 */
	@RequestMapping(value = "/getListaDipendenti", method = RequestMethod.POST)
	public @ResponseBody GetListaDipendentiRestResponse getListaDipendenti(@RequestBody String filtroJson) {
		LOG.info("DipendentiController.getListaDipendenti()");
		ObjectMapper mapper = new ObjectMapper();
		FiltroDipendenti filtro=null;
		try {
			filtro = mapper.readValue(filtroJson, FiltroDipendenti.class);
		} catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		List<Dipendente> listaDipendenti = service.getListaDipendenti(filtro, 1, null);
		GetListaDipendentiRestResponse response = new GetListaDipendentiRestResponse();
		response.setDipendenti(listaDipendenti);

		return response;
	}
	
	@RequestMapping(value = "/getDipendenteById", method = RequestMethod.GET)
	public @ResponseBody GetDipendenteByIdResponse getDipendenteById(@RequestParam int id){
		
		GetDipendenteByIdResponse response = new GetDipendenteByIdResponse();
		
		Dipendente dipendente = service.getDipendenteById(id);
		
		response.setDipendente(dipendente);
		
		return response;
	}
	
	/**
	 * Deletes one employee.
	 * 
	 * @return a boolean to confirm the operation
	 */
	
//	@RequestMapping(value = "/eliminaDipendente", method = RequestMethod.GET)
//	public @ResponseBody GetListaDipendentiRestResponse getListaDipendenti() {
//		LOG.info("DipendentiController.getListaDipendenti()");
//
//		List<Dipendente> listaDipendenti = service.getListaDipendenti(0, null);
//
//		GetListaDipendentiRestResponse response = new GetListaDipendentiRestResponse();
//		response.setDipendenti(listaDipendenti);
//
//		return response;
//	}

}
