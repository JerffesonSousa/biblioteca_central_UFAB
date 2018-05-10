package br.edu.uepb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.uepb.model.Revista;
import br.edu.uepb.services.Services;

@Controller
public class RevistaController {
	
	@Autowired
	private Services<Revista> revistaServices;
	
	@RequestMapping("/revista")
	public ModelAndView revista(Revista r) {
		ModelAndView m = new ModelAndView();
		m.setViewName("revista");
		return m;
	}
	
	@RequestMapping(value="/addRevista", method=RequestMethod.POST)
	public String addrevista(@ModelAttribute("revista")Revista r, BindingResult result) {
		revistaServices.adiciona(r);
		return "redirect:/revista";
	}
	
	@RequestMapping(value="/deletaRevista", method=RequestMethod.POST)
	public String deletaRevista(@RequestParam("revistaID")Integer revistaId) {
		revistaServices.deleta(revistaId);
		return "redirect:/revista";
	}

}
