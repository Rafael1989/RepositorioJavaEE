<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
	<head>
		<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	</head>
<c:import url="cabecalho.jsp"/>
Formulário para alteração de contatos:<br/>
<form action="mvc?id=${contato.id}" method="post">
	Id:
		<input type="text" name="id" disabled="disabled" value="${contato.id}"/><br/>
	Nome: 
		<input type="text" name="nome" value="${contato.nome}"/><br/>
	E-mail:
		<input type="text" name="email" value="${contato.email}"/><br/>
	Endereço:
		<input type="text" name="endereco" value="${contato.endereco}"/><br/>
	Data de Nascimento:
		<input type="text" id="dataNascimento" name="dataNascimento" value="<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/>"/>
		<script type="text/javascript">
			$("#dataNascimento").datepicker({dateFormat: 'dd/mm/yy', changeYear: true, changeMonth: true});
		</script>
		<input type="hidden" name="logica" value="AlteraContatoLogic"/>
		<input type="submit" value="Enviar"/>
</form>

<c:import url="rodape.jsp"/>