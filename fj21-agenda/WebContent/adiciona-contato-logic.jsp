<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<html>
	<head>
		<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	</head>
	<body>
		<c:import url="cabecalho.jsp"/>
		<form action="mvc">
			Nome: <input type="text" name="nome" /><br />
			E-mail: <input type="text" name="email" /><br />
			Endereço: <input type="text" name="endereco" /><br />
			Data Nascimento: <caelum:campoData id="dataNascimento"/><br />
			<input type="hidden" name="logica" value="AlteraContatoLogic"/>
			<input type="submit" value="Gravar" />
		</form>
		<c:import url="rodape.jsp"/>
	</body>
</html>