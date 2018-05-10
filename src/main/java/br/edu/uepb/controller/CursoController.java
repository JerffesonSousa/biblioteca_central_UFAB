package br.edu.uepb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.uepb.model.Curso;
import br.edu.uepb.services.Services;

@Controller
public class CursoController {
	
	@Autowired
	private Services<Curso> cursoServices;
	
	@RequestMapping("/curso")
	public ModelAndView anais(Curso c) {
		ModelAndView m = new ModelAndView();
		m.setViewName("curso");
		return m;
	}
	
	@RequestMapping(value = "/addCurso", method = RequestMethod.POST)
	public String addAnais(@ModelAttribute("curso")
	Curso c, BindingResult result) {
		cursoServices.adiciona(c);
		return "redirect:/curso";
	}
	
	@RequestMapping(value = "/deletaCurso", method = RequestMethod.POST)
	public String deleteAnais(@RequestParam("cursoID")
	Integer cursoID) {
		cursoServices.deleta(cursoID);
		return "redirect:/curso";
	}

}
