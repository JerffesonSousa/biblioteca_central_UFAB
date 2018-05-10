package br.edu.uepb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.uepb.model.Livro;
import br.edu.uepb.services.Services;

@Controller
public class LivroController {
	
	@Autowired
	private Services<Livro> livroServices;
	
	@RequestMapping("/livro")
	public ModelAndView livro(Livro l) {
		ModelAndView m = new ModelAndView();
		m.setViewName("livro");
		return m;
	}
	
	@RequestMapping(value="/addLivro", method=RequestMethod.POST)
	public String addLivro(@ModelAttribute("livro")Livro l, BindingResult result) {
		livroServices.adiciona(l);
		return "redirect:/livro";
	}
	
	@RequestMapping(value="/deletaLivro", method = RequestMethod.POST)
	public String deletaLivro(@RequestParam("livroID")Integer livroID) {
		livroServices.deleta(livroID);
		return"redirect:/livro";
	}

}
