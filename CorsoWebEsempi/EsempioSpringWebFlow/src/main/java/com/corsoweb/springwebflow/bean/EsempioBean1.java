package com.corsoweb.springwebflow.bean;

import java.io.Serializable;

public class EsempioBean1 implements Serializable {

	private String nome;

	public void submit() {
		System.out.println(nome + " Hai fatto submit");
	}

	public void initEsempio() {
		nome = "Giuseppe Giordano";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
