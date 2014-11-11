<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Model e View con Validazione</title>
</head>
<body>


	<form:form
		action="/EsempioSpringMVC/inserisciLibroActionConValidazione"
		method="post" modelAttribute="libroConValidator">
		<form:errors path="*" element="div" />
		<label>Titolo:</label>
		<form:input path="titolo" />
		<label>Anno:</label>
		<form:input path="anno" />
		<input type="submit" value="Inserisci Libro con Validazione" />
	</form:form>
</body>
</html>