<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<p>Esempi Utili alla spiegazione</p>

	<div>
		<br> <b> Esempio 1 - Forward </b><br> I link
		http://localhost:8080/EsempioSpringMVC/welcome e
		http://localhost:8080/EsempioSpringMVC/home indirizzano alla stessa
		pagina
	</div>

	<div>
		<br> <b> Esempio 2 - Chiama Metodo senza parametri</b><br> <a
			href="/EsempioSpringMVC/sysout">Link che chiama il metodo</a>
	</div>

	<div>
		<br> <b> Esempio 3 - Chiama Metodo con parametro</b><br> <a
			href="/EsempioSpringMVC/sysout/ciaoBello">Link che chiama il
			metodo con parametro </a>
	</div>

	<div>
		<br> <b> Esempio 4 - Chiama Metodo con parametro Model</b><br>
		<a href="/EsempioSpringMVC/getLibroSingolo">Link che chiama il
			metodo con parametro Model</a>
	</div>

	<div>
		<br> <b> Esempio 5 - Chiama Metodo con tipo di ritorno String</b><br>
		<a href="/EsempioSpringMVC/getLibroSingolo">Link che chiama il
			metodo con tipo ritorno String</a>
	</div>

	<div>
		<br> <b> Esempio 6 - Chiama Metodo con tipo di ritorno String
			e passaggio di parametri</b><br> <a
			href="/EsempioSpringMVC/getLibroSingolo/LibroACaso">Link che
			chiama il metodo con tipo ritorno String</a>
	</div>

	<div>
		<br> <b> Esempio 7 - Chiama Metodo con tipo di ritorno
			ModelAndView </b><br> <a href="/EsempioSpringMVC/getLibroSingoloMV">Link
			che chiama il metodo con tipo ritorno ModelAndView</a>
	</div>

	<div>
		<br> <b> Esempio 8 - Chiama Metodo con tipo di ritorno
			Oggetto (JSON) </b><br> <a href="/EsempioSpringMVC/getLibroObj">Link
			che chiama il metodo con tipo ritorno Oggetto (JSON) </a> UTILIZZARE CON
		JSON
	</div>

	<div>
		<br> <b> Esempio 9 - Visualizza Form </b><br> <a
			href="/EsempioSpringMVC/inserisciLibro">Primo Form</a>
	</div>

	<div>
		<br> <b> Esempio 10 - Visualizza Form Prevalorizzato</b><br>
		<a href="/EsempioSpringMVC/inserisciLibroPrevalorizzato">Primo
			Form</a>
	</div>

	<div>
		<br> <b> Esempio 11 - Visualizza Form Con Validazione</b><br>
		<a href="/EsempioSpringMVC/inserisciLibroConValidazione">Form Con
			Validazione</a>
	</div>

	<div>
		<br> <b> Esempio 12 - Applicazione in errore</b><br> <a
			href="/EsempioSpringMVC/inserisciLibroActionNullPointer">Applicazione
			in errore</a>
	</div>

</body>
</html>