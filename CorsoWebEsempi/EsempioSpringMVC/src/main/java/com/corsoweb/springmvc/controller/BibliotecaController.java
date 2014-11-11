package com.corsoweb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.corsoweb.springmvc.model.Libro;

@Controller
public class BibliotecaController {

	// fa solo un forward
	@RequestMapping(value = "/home")
	public String forward() {
		return "forward:welcome";
	}

	// rimanda alla pagina dei libri
	@RequestMapping(value = "/welcome")
	public String goToListaLibri() {
		return "Welcome";
	}

	// rimanda alla pagina dei libri
	@RequestMapping(value = "/getLibroSingolo")
	public String getLibroSingolo(Model model) {
		model.addAttribute("titolo", "Libro 1");
		model.addAttribute("anno", "2014");

		return "LibroSingoloView";
	}

	// rimanda alla pagina dei libri
	@RequestMapping(value = "/getLibroSingoloModel")
	public String getLibroSingoloModel(@ModelAttribute Libro libro, Model model) {
		model.addAttribute("libroForm", libro);
		return "LibroSingoloModelView";
	}

	// restituisce una lista di libri filtrati per anno (passando la
	// variabile
	// anno nell'url)
	@RequestMapping(value = "/getLibroSingolo/{nome}", method = RequestMethod.GET)
	public String getListaLibriPathVariable(@PathVariable("nome") String nome,
			Model model) {
		model.addAttribute("titolo", nome);
		model.addAttribute("anno", "2014");
		return "LibroSingoloView";
	}

	// restituisce una lista di libri filtrati per anno (passando la
	// variabile
	// anno nella richiesta http come request)
	@RequestMapping(value = "/getLibroSingoloRequest/{nome}", method = RequestMethod.GET)
	public String getListaLibriRequestParm(@RequestParam("nome") String nome,
			Model model) {
		model.addAttribute("titolo", nome);
		model.addAttribute("anno", "2014");
		return "LibroSingoloView";
	}
}
