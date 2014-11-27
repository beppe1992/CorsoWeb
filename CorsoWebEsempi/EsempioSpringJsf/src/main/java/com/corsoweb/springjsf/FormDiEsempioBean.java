package com.corsoweb.springjsf;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class FormDiEsempioBean implements Serializable {

	private String nome;
	private String cognome;
	private int eta;

	private String messaggioConferma;

	public void registrati() {

		messaggioConferma = "REGISTRAZIONE UTENTE: " + nome + " " + cognome
				+ " CORRETTAMENTE AVVENUTA";

		this.resetCampi();
	}

	public String registratiConNavigazione() {

		messaggioConferma = "REGISTRAZIONE UTENTE: " + nome + " " + cognome
				+ " CORRETTAMENTE AVVENUTA";

		this.resetCampi();
		return "registrazioneOk";
	}

	private void resetCampi() {
		nome = "";
		cognome = "";
		eta = 0;
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

	public String getMessaggioConferma() {
		return messaggioConferma;
	}

	public void setMessaggioConferma(String messaggioConferma) {
		this.messaggioConferma = messaggioConferma;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEta() {
		return eta;
	}

}
