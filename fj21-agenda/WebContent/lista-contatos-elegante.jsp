<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<c:import url="cabecalho.jsp"/>


<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDAO"/>

<table>
		<tr>
			<td>Nome</td>
			<td>E-mail</td>
			<td>Endere�o</td>
			<td>Data de Nascimento</td>
		</tr>
	<c:forEach var="contato" items="${dao.lista}" varStatus="id">
		<tr bgcolor="#${id.count % 2 == 0? 'aaee88' : 'ffffff' }">
			<td>${contato.nome}</td>
			<td>
			<!--<c:if test="${not empty contato.email}">
					<a href="mailto:${contato.email}">${contato.email}</a>
				</c:if>
				<c:if test="${empty contato.email}">
					E-mail n�o informado
				</c:if> -->
				<c:choose>
					<c:when test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:when>
					<c:otherwise>
						E-mail n�o informado
					</c:otherwise>
				</c:choose>
			</td>
			<td>${contato.endereco}</td>
			<td>
				<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/>
			</td>
		</tr>
	</c:forEach>
</table>

<c:import url="rodape.jsp"/>