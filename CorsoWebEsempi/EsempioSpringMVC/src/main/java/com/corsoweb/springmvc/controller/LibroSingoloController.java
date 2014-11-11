package com.corsoweb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.corsoweb.springmvc.model.Libro;

@Controller
public class LibroSingoloController {

	// rimanda alla pagina del libro singolo e gli setta Titolo = Libro 1 e anno
	// = 2014
	@RequestMapping(value = "/getLibroSingolo")
	public String getLibroSingolo(Model model) {
		model.addAttribute("titolo", "Libro 1");
		model.addAttribute("anno", "2014");

		return "LibroSingolo";
	}

	// rimanda alla pagina del libro singolo e gli setta Titolo = Libro 1 e anno
	// = 2014 (restituendo pero' un ModelAndView)
	@RequestMapping(value = "/getLibroSingoloMV")
	public ModelAndView getLibroSingolo() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("titolo", "Libro 1");
		modelAndView.addObject("anno", "2014");
		modelAndView.setViewName("LibroSingolo");

		return modelAndView;
	}

	// restituisce un'oggeto JSON
	@RequestMapping(value = "/getLibroObj")
	@ResponseBody
	public ModelAndView getLibroObj() {

		Libro libro = new Libro();
		libro.setAnno("2014");
		libro.setTitolo("Libro 1");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("libro", libro);
		modelAndView.setViewName("LibroSingolo");

		return modelAndView;
	}

	// rimanda alla pagina del libro singolo e gli setta Titolo = nome passato
	// nel path e anno
	// = 2014
	@RequestMapping(value = "/getLibroSingolo/{nome}", method = RequestMethod.GET)
	public String getListaLibriPathVariable(@PathVariable("nome") String nome,
			Model model) {
		model.addAttribute("titolo", nome);
		model.addAttribute("anno", "2014");
		return "LibroSingolo";
	}

}
