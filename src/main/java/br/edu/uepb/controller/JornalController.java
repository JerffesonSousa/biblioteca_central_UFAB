package br.edu.uepb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.uepb.model.Jornal;
import br.edu.uepb.services.Services;

@Controller
public class JornalController {
	
	@Autowired
	private Services<Jornal> jornalServices;
	
	@RequestMapping("/jornal")
	public ModelAndView jornal(Jornal j) {
		ModelAndView m = new ModelAndView();
		m.setViewName("jornal");
		return m;
	}
	
	@RequestMapping(value="/addJornal", method = RequestMethod.POST)
	public String addJornal(@ModelAttribute("jornal") Jornal j, BindingResult result) {
		jornalServices.adiciona(j);
		return "redirect:/jornal";
	}
	
	@RequestMapping(value="/deletaJornal", method = RequestMethod.POST)
	public String addJornal(@RequestParam("jornalID") Integer jornalID) {
		jornalServices.deleta(jornalID);
		return "redirect:/jornal";
	}
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         sdf.setLenient(true);
         binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

}
