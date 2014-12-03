<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Model e View</title>
</head>
<body>

	<table>
		<form action="/EsempioSpringMVC/inserisciLibroAction" method="POST">
			<tr>
				<td><b>Anno</b>
				<td><input type="text" name="anno">
				<td>
			</tr>
			<tr>
				<td><b>Titolo</b></td>
				<td><input type="text" name="titolo"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Invia"></td>
			</tr>
		</form>
	</table>
</body>
</html>