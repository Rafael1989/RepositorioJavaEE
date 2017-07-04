<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<c:import url="cabecalho.jsp"/>


<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDAO"/>
<a href="adiciona-contato-logic.jsp">Adiciona Contato</a>
<table>
		<tr>
			<td>Nome</td>
			<td>E-mail</td>
			<td>Endereço</td>
			<td>Data de Nascimento</td>
			<td></td>
			<td></td>
		</tr>
	<c:forEach var="contato" items="${dao.lista}" varStatus="id">
		<tr bgcolor="#${id.count % 2 == 0? 'aaee88' : 'ffffff' }">
			<td>${contato.nome}</td>
			<td>
			<!--<c:if test="${not empty contato.email}">
					<a href="mailto:${contato.email}">${contato.email}</a>
				</c:if>
				<c:if test="${empty contato.email}">
					E-mail não informado
				</c:if> -->
				<c:choose>
					<c:when test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:when>
					<c:otherwise>
						E-mail não informado
					</c:otherwise>
				</c:choose>
			</td>
			<td>${contato.endereco}</td>
			<td>
				<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/>
			</td>
			<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">x</a></td>
			<td><a href="mvc?logica=PreparaContatoLogic&id=${contato.id}">Edita</a></td>
		</tr>
	</c:forEach>
</table>

<c:import url="rodape.jsp"/>