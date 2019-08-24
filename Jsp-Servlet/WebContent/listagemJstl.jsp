<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Meus Livros</title>
</head>
<body>
	<table>
		<c:forEach items="${requestScope.listaLivrosNoAtributo}"
			var="livro">
			<tr>
				<td><c:out value="${livro.titulo}"></c:out></td>
				<td><c:out value="${livro.autor}"></c:out></td>
				<td><c:out value="${livro.descricao}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>