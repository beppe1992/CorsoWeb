package com.corsoweb.springmvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.jmx.export.annotation.ManagedOperationParameter;

public class LibroConValidator {

	@NotNull
	@Max(50)
	private String titolo;

	@NotNull
	@Max(4)
	@Min(1)
	private String anno;

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

}
