package com.corsoweb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.corsoweb.springmvc.model.Libro;

@Controller
public class InserisciLibroControllerFormSpring {

	// visualizza la pagina di un form spring
	@RequestMapping(value = "/formSpring", method = RequestMethod.GET)
	public ModelAndView viewFormSpring() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("libro", new Libro());
		mv.setViewName("FormSpring");

		return mv;
	}

	// scrive il Libro sul DB
	@RequestMapping(value = "/inserisciLibroSpring" )
	public String inserisciLibro(@ModelAttribute("libro") Libro libro) {

		System.out.println("Inserendo libro con titolo: " + libro.getTitolo()
				+ " e anno " + libro.getAnno());

		return "FormSpring";
	}

}
