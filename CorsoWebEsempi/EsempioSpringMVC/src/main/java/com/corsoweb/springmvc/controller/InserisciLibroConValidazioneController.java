package com.corsoweb.springmvc.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.corsoweb.springmvc.model.Libro;
import com.corsoweb.springmvc.model.LibroConValidator;

@Controller
public class InserisciLibroConValidazioneController {

	// visualizza la pagina di inserimento di un nuovo libro (senza
	// prevalorizzazione)
	@RequestMapping(value = "/inserisciLibroConValidazione")
	public String viewFormInserimentoLibro(
			@ModelAttribute LibroConValidator libroConValidator, Model model) {
		model.addAttribute("libroConValidator", libroConValidator);
		return "InserisciLibroConValidazione";
	}

	// scrive il Libro sul DB
	@RequestMapping(value = "/inserisciLibroActionConValidazione", method = RequestMethod.POST)
	public String inserisciLibro(
			@Valid @ModelAttribute("libroConValidator") LibroConValidator libroConValidator,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("libroConValidator", libroConValidator);
			return "InserisciLibroConValidazione";
		} else {
			System.out.println("Inserendo libro con titolo: "
					+ libroConValidator.getTitolo() + " e anno "
					+ libroConValidator.getAnno());

			return "InserisciLibroConValidazione";
		}
	}

	@ExceptionHandler(NullPointerException.class)
	public String gestoreEccezioni(NullPointerException ex) {
		return "PaginaDiErrore";
	}

	// fa andare l'applicazione in nullpointer
	@RequestMapping(value = "/inserisciLibroActionNullPointer", method = RequestMethod.GET)
	public String inserisciLibroNullPointer(
			@ModelAttribute("libroConValidator") LibroConValidator libroConValidator) {

		String s = null;
		return s.toString();
	}
}
