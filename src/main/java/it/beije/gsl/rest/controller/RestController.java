package it.beije.gsl.rest.controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.beije.gsl.dao.model.StatConsulenti;
import it.beije.gsl.service.DashboardService;

@Controller
@RequestMapping("/service")
public class RestController{
	DashboardService dashboardservice;

	@RequestMapping("/welcome")
	public String home(Model model) {
		return "home";
		
	}
	
	/* It will return an object of StatConsulenti*/  
   /* @RequestMapping(value = "/viewjson", method = RequestMethod.GET)  
    public StatConsulenti viewjson(){  
    	  dashboardservice.getStatConsulenti();
    }  */
}