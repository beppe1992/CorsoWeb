<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form</title>
</head>
<body>

	<h2>Libro</h2>
	<form:form method="POST"
		action="/EsempioSpringMVC/inserisciLibroSpring" modelAttribute="libro">
		<table>
			<tr>
				<td><label>Titolo</label></td>
				<td><form:input path="titolo" /></td>
			</tr>
			<tr>
				<td><label>Anno</label></td>
				<td><form:input path="anno" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>