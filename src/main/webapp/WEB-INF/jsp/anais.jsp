<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	
</head>
<body>

<h2>Cadastro de Anais</h2>

<form:form method="post" action="addAnais.html" commandName="anais">

	<table>
	<tr>
		<td><form:label path="tipo">Tipo</form:label></td>
		<td><form:radiobutton path="tipo" value="ARTIGO"/>ARTIGO</td> 
		<td><form:radiobutton path="tipo" value="PÔSTER"/>PÔSTER</td> 
		<td><form:radiobutton path="tipo" value="RESUMO"/>RESUMO</td> 
		
	</tr>
	<tr>
		<td><form:label path="titulo">Titulo</form:label></td>
		<td><form:input path="titulo" /></td>
	</tr>
	<tr>
		<td><form:label path="autores">Autores</form:label></td>
		<td><form:input path="autores" /></td>
	</tr>
	<tr>
		<td><form:label path="congresso">Congresso</form:label></td>
		<td><form:input path="congresso" /></td>
	</tr>
	<tr>
		<td><form:label path="anoDePublicacao">Ano de Publicação</form:label></td>
		<td><form:input path="anoDePublicacao"  type="date"/></td>
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
		<td><label>Anais ID</label></td>
		<td><input name="anaisID" type="number"/></td>
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
