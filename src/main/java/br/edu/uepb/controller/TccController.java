package br.edu.uepb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.uepb.model.Tcc;
import br.edu.uepb.services.DAOServices;

@Controller
public class TccController {
	
	@Autowired
	private DAOServices<Tcc> tccServices;
	
	@RequestMapping("/tcc")
	public ModelAndView tcc(Tcc tcc) {
		ModelAndView m = new ModelAndView();
		m.setViewName("tcc");
		return m;
	}
	
	@RequestMapping(value="/addTcc", method=RequestMethod.POST)
	public String addTcc(@ModelAttribute("tcc")Tcc tcc, BindingResult result) {
		tccServices.adiciona(tcc);
		return "redirect:/tcc";
	}
	
	@RequestMapping(value="/deletaTcc", method = RequestMethod.POST)
	public String deletaTcc(@RequestParam("tccID")Integer tccID) {
		tccServices.deleta(tccID);
		return"redirect:/tcc";
	}
}
