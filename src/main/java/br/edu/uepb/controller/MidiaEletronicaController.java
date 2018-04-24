package br.edu.uepb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.uepb.model.MidiaEletronica;
import br.edu.uepb.services.DAOServices;

@Controller
public class MidiaEletronicaController {
	
	@Autowired
	private DAOServices<MidiaEletronica> midiaServices;
	
	@RequestMapping("/midia")
	public ModelAndView midia(MidiaEletronica midia) {
		ModelAndView m = new ModelAndView();
		m.setViewName("midia");
		return m;
	}
	
	@RequestMapping(value="/addMidia", method=RequestMethod.POST)
	public String addMidia(@ModelAttribute("midiaEletronica")MidiaEletronica m, BindingResult result) {
		midiaServices.adiciona(m);
		return "redirect:/midia";
	}
	
	@RequestMapping(value="/deletaMidia", method=RequestMethod.POST)
	public String deletaMidia(@RequestParam("midiaID")Integer midiaID) {
		midiaServices.deleta(midiaID);
		return "redirect:/midia";
	}
}
