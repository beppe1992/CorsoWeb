package com.corsoweb.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.corsoweb.springmvc.model.Libro;
import com.corsoweb.springmvc.model.LibroConValidator;

@Controller
public class InserisciLibroController {

	// visualizza la pagina di inserimento di un nuovo libro (senza
	// prevalorizzazione)
	@RequestMapping(value = "/inserisciLibro")
	public String viewFormInserimentoLibro(@ModelAttribute Libro libro,
			Model model) {
		model.addAttribute("libro", libro);
		return "InserisciLibro";
	}

	// visualizza la pagina di inserimento di un nuovo libro (con
	// prevalorizzazione)
	@RequestMapping(value = "/inserisciLibroPrevalorizzato")
	public String viewFormInserimentoLibroPrevalorizzato(
			@ModelAttribute Libro libro, Model model) {
		libro.setAnno("Inserire un anno");
		libro.setTitolo("Inserire un titolo");
		model.addAttribute("libro", libro);
		return "InserisciLibro";
	}

	// scrive il Libro sul DB
	@RequestMapping(value = "/inserisciLibroAction")
	public String inserisciLibro(@ModelAttribute Libro libro) {

		System.out.println("Inserendo libro con titolo: " + libro.getTitolo()
				+ " e anno " + libro.getAnno());

		return "InserisciLibro";
	}
}
