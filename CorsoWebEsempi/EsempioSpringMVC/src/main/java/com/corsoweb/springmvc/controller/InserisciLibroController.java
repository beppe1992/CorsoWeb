package com.corsoweb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.corsoweb.springmvc.model.Libro;

@Controller
public class InserisciLibroController {

	// visualizza la pagina di inserimento di un nuovo libro (senza
	// prevalorizzazione)
	@RequestMapping(value = "/inserisciLibro")
	public String viewFormInserimentoLibro() {
		return "InserisciLibro";
	}

	// scrive il Libro sul DB
	@RequestMapping(value = "/inserisciLibroAction")
	public String inserisciLibro(@RequestParam("anno") String anno,
			@RequestParam("titolo") String titolo) {

		System.out.println("Inserendo libro con titolo: " + titolo + " e anno "
				+ anno);

		return "InserisciLibro";
	}

	@ExceptionHandler(NullPointerException.class)
	public String gestoreEccezioni(NullPointerException ex) {
		return "PaginaDiErrore";
	}

	// fa andare l'applicazione in nullpointer
	@RequestMapping(value = "/inserisciLibroActionNullPointer", method = RequestMethod.GET)
	public String inserisciLibroNullPointer() {

		String s = null;
		return s.toString();
	}
}
