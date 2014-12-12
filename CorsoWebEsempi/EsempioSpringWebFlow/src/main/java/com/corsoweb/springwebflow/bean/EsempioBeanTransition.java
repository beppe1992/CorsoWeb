package com.corsoweb.springwebflow.bean;

import java.io.Serializable;

public class EsempioBeanTransition implements Serializable {

	public String getLibroInOfferta() {
		System.out.println("Ciao");
		return "Libro In Offerta";
	}

}
