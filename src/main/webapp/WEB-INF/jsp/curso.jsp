<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	
</head>
<body>

<h2>Cadastro de Curso</h2>

<form:form method="post" action="addCurso.html" commandName="curso">

	<table>
	
	<tr>
		<td><form:label path="nome">Nome</form:label></td>
		<td><form:input path="nome" /></td>
	</tr>
	<tr>
		<td><form:label path="area">Area</form:label></td>
		<td><form:input path="area" /></td>
	</tr>
	<tr>
		<td><form:label path="tipo">Tipo</form:label></td>
		<td><form:radiobutton path="tipo" value="PÓS_GRADUAÇÃO"/>PÓS_GRADUAÇÃO</td> 
		<td><form:radiobutton path="tipo" value="GRADUAÇÃO"/>GRADUAÇÃO</td> 
		
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="submit" value="Cadastrar"/>
		</td>
	</tr>
</table>	
</form:form>

<form:form method="post" action="deletaCurso.html">

	<table>
	
	<tr>
		<td><label>Curso ID</label></td>
		<td><input name="cursoID" type="number"/></td>
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
