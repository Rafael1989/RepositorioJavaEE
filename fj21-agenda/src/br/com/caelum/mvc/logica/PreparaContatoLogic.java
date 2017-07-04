package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class PreparaContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		ContatoDAO dao = new ContatoDAO();
		Contato contato = dao.pesquisar(id);
		request.setAttribute("contato", contato);
		
		return "/testa-altera.jsp";
	}

}
