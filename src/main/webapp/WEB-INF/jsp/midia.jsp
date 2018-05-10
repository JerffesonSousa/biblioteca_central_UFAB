<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
	<h2>Cadastro de Midias Eletronicas</h2>

	<form:form method="post" action="addMidia.html" commandName="midiaEletronica">
		<table>
			<tr>
				<td><form:label path="titulo">Titulo</form:label></td>
				<td><form:input path="titulo"/></td>
			</tr>
			<tr>
			<td><form:label path="tipo">Tipo</form:label></td>
				<td><form:radiobutton path="tipo" value="CD"/>CD</td>
				<td><form:radiobutton path="tipo" value="DVD"/>DVD</td>
			</tr>
			<tr>
				<td><form:label path="dataGravacao">Data da Gravação</form:label></td>
				<td><form:input path="dataGravacao" type="date"/></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="Cadastrar">
				</td>
			</tr>

		</table>

	</form:form>
	
	<form:form method="post" action="deletaMidia.html">

	<table>
	
	<tr>
		<td><label>Mida ID</label></td>
		<td><input name="midiaID" type="number"/></td>
	</tr>

	<tr>
		<td colspan="2">
			<input type="submit" value="Deletar"/>
		</td>
	</tr>
</table>	
</form:form>
</body>
</html>