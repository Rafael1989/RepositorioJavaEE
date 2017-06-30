<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.*,
	br.com.caelum.agenda.dao.*,
	br.com.caelum.agenda.modelo.*" %>
	
<html>
	<body>
		<table>
			<tr>
				<td>Nome</td>
				<td>Email</td>
				<td>Endereço</td>
				<td>Data de nascimento</td>
			</tr>
			<%
			ContatoDAO dao = new ContatoDAO();
			List<Contato> contatos = dao.getLista();
			
			for(Contato contato : contatos){
			%>
				<tr>
					<td><%=contato.getNome() %></td>
					<td><%=contato.getEmail() %></td>
					<td><%=contato.getEndereco() %></td>
					<td><%=new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime()) %></td>
				</tr>
			<%
			}
			%>
		</table>
	</body>
</html>