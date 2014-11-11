package com.corsoweb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// fa solo un forward
	@RequestMapping(value = "/home")
	public String forward() {
		return "forward:welcome";
	}

	// visualizza la pagina di Welcome
	@RequestMapping(value = "/welcome")
	public String viewWelcome() {
		return "Welcome";
	}

	// esempio di chiamata ad un metodo
	@RequestMapping(value = "/sysout")
	public String chiamaUnMetodo() {
		System.out.println("Ciao, sono entrato in questo metodo");
		return "Welcome";
	}

	// esempio di chiamata ad un metodo con parametro
	@RequestMapping(value = "/sysout/{parametro}")
	public String chiamaUnMetodoConParametro(@PathVariable String parametro) {
		System.out
				.println("Ciao, sono entrato in questo metodo con il parametro: "
						+ parametro);
		return "Welcome";
	}

	// esempio di chiamata ad un metodo ma che restituisce una pagina
	// inesistente
	@RequestMapping(value = "/paginaNonEsistente")
	public String viewPaginaInesistente() {
		return "PaginaInesistente";
	}

}
