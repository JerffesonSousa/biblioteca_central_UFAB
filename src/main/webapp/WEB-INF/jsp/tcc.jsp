<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	
</head>
<body>

<h2>Cadastro de Tcc</h2>

<form:form method="post" action="addTcc.html" commandName="tcc">

	<table>
	<tr>
		<td><form:label path="titulo">Titulo</form:label></td>
		<td><form:input path="titulo" /></td>
	</tr>
	<tr>
		<td><form:label path="autor">Autor</form:label></td>
		<td><form:input path="autor" /></td>
	</tr>
	<tr>
		<td><form:label path="orientador">Orientador</form:label></td>
		<td><form:input path="orientador" /></td>
	</tr>
	<tr>
		<td><form:label path="tipo">Tipo</form:label></td>
		<td><form:radiobutton path="tipo" value="MONOGRAFIA"/>MONOGRAFIA</td> 
		<td><form:radiobutton path="tipo" value="TESE"/>TESE</td> 
		<td><form:radiobutton path="tipo" value="DISSERTAÇÃO"/>DISSERTAÇÃO</td> 
		
	</tr>
	<tr>
		<td><form:label path="dataDefesa">Data da Defesa</form:label></td>
		<td><form:input path="dataDefesa"  type="date" /></td>
	</tr>
	<tr>
		<td><form:label path="local">Local</form:label></td>
		<td><form:input path="local" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Cadastrar"/>
		</td>
	</tr>
</table>	
</form:form>

<form:form method="post" action="deletaAnais.html">

	<table>
	
	<tr>
		<td><label>Tcc ID</label></td>
		<td><input name="tccID" type="number"/></td>
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
