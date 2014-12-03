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
		<br> <b> Esempio 2 - Stampa a console un messaggio standard</b><br>
		<a href="/EsempioSpringMVC/sysout">Link che chiama il metodo</a>
	</div>

	<div>
		<br> <b> Esempio 3 - Stampa a console il messaggio passato
			nell'URLS</b><br> <a href="/EsempioSpringMVC/sysout/ciaoBello">Link
			che chiama il metodo con parametro </a>
	</div>

	<div>
		<br> <b> Esempio 4 - visualizza in una pagina nuova un libro
			standard</b><br> <a href="/EsempioSpringMVC/getLibroSingolo">Link
			che chiama il metodo con parametro Model</a>
	</div>

	<div>
		<br> <b> Esempio 5 - visualizza in una pagina nuova un con il
			titolo passato nell'url</b><br> <a
			href="/EsempioSpringMVC/getLibroSingolo/LibroACaso">Link </a>
	</div>

	<div>
		<br> <b> Esempio 6 - visualizza in una pagina nuova un libro
			standard ModelAndView </b><br> <a
			href="/EsempioSpringMVC/getLibroSingoloMV">Link che chiama il
			metodo con tipo ritorno ModelAndView</a>
	</div>

	<div>
		<br> <b> Esempio 7 - visualizza in una pagina nuova un libro
			standard </b><br> <a href="/EsempioSpringMVC/getLibroSingoloMV">Link
			che chiama il metodo con tipo ritorno ModelAndView</a>
	</div>

	<div>
		<br> <b> Esempio 8 - visualizza in una pagina nuova un libro
			standard restituendo un oggetto</b><br> <a
			href="/EsempioSpringMVC/getLibroSingoloMVObj">Link che chiama il
			metodo con tipo ritorno ModelAndView contenente un oggetto custom</a>
	</div>

	<div>
		<br> <b> Esempio 9 - Visualizza Form </b><br> <a
			href="/EsempioSpringMVC/inserisciLibro">Primo Form</a>
	</div>

	<div>
		<br> <b> Esempio 10 - Applicazione in errore</b><br> <a
			href="/EsempioSpringMVC/inserisciLibroActionNullPointer">Applicazione
			in errore</a>
	</div>


	<div>
		<br> <b> Esempio 11 - Visualizza Form Spring</b><br> <a
			href="/EsempioSpringMVC/formSpring">Primo Form Spring</a>
	</div>


</body>
</html>