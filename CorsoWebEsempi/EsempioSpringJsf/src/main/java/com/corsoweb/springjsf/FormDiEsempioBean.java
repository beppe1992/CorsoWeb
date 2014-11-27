package com.corsoweb.springjsf;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class FormDiEsempioBean {

	private String nome;
	private String cognome;
	private int eta;

	public void registrati() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}
