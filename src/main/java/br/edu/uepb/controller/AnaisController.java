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

import br.edu.uepb.model.Anais;
import br.edu.uepb.services.Services;

@Controller
public class AnaisController{
	
	@Autowired
	private Services<Anais> anaiServices;
	
	@RequestMapping("/anais")
	public ModelAndView anais(Anais a) {
		ModelAndView m = new ModelAndView();
		m.setViewName("anais");
		return m;
	}
	
	@RequestMapping(value = "/addAnais", method = RequestMethod.POST)
	public String addAnais(@ModelAttribute("anais")
	Anais a, BindingResult result) {
		anaiServices.adiciona(a);
		return "redirect:/anais";
	}
	
	@RequestMapping(value = "/deletaAnais", method = RequestMethod.POST)
	public String deleteAnais(@RequestParam("anaisID")
	Integer anaisID) {
		anaiServices.deleta(anaisID);
		return "redirect:/anais";
	}
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         sdf.setLenient(true);
         binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

}
