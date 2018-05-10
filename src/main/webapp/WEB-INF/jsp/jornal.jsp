<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
</head>
<body>
	<h2>Cadastro Jornal</h2>
	<form:form method="post" action="addJornal.html" commandName="jornal">
		<table>
			<tr>
				<td><form:label path="titulo">Titulo</form:label></td>
				<td><form:input path="titulo" /></td>
			</tr>
			<tr>
				<td><form:label path="dataPublicacao">Data de Publicação</form:label></td>
				<td><form:input path="dataPublicacao" type="date" /></td>
			</tr>
			<tr>
				<td><form:label path="edicao">Edição</form:label></td>
				<td><form:input path="edicao" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Cadastrar">
				</td>
			</tr>

		</table>
	</form:form>

	<form:form method="post" action="deletaJornal.html">

		<table>

			<tr>
				<td><label>Jornal ID</label></td>
				<td><input name="jornalID" type="number"/></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Deletar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>