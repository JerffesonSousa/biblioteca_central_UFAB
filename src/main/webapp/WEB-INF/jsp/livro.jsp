<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<h2>Cadastro de Livro</h2>

	<form:form method="post" action="addLivro.html" commandName="livro">
		<table>
			<tr>
				<td><form:label path="isbn">ISBN</form:label>
				<td>
				<td><form:input path="isbn" />
				<td>
			</tr>
			<tr>
				<td><form:label path="titulo">Titulo</form:label>
				<td>
				<td><form:input path="titulo" />
				<td>
			</tr>
			<tr>
				<td><form:label path="autores">Autores</form:label>
				<td>
				<td><form:input path="autores" />
				<td>
			</tr>
			<tr>
				<td><form:label path="editora">Editora</form:label>
				<td>
				<td><form:input path="editora" />
				<td>
			</tr>
			<tr>
				<td><form:label path="dataPublicacao">Data de Publicação</form:label>
				<td>
				<td><form:input path="dataPublicacao" type="date" />
				<td>
			</tr>
			<tr>
				<td><form:label path="edicao">Edição</form:label>
				<td>
				<td><form:input path="edicao" />
				<td>
			</tr>
			<tr>
				<td><form:label path="paginas">Nº de paginas</form:label>
				<td>
				<td><form:input path="paginas" type="number" />
				<td>
			</tr>
			<tr>
				<td><form:label path="area">Area</form:label>
				<td>
				<td><form:input path="area" />
				<td>
			</tr>
			<tr>
				<td><form:label path="subArea">SubArea</form:label>
				<td>
				<td><form:input path="subArea" />
				<td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Cadastrar" /></td>
			</tr>

		</table>

	</form:form>

	<form:form method="post" action="deletaLivro.html">

		<table>

			<tr>
				<td><label>Livro ID</label></td>
				<td><input name="livroID" type="number" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Deletar" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>