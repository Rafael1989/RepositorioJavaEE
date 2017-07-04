package br.com.caelum.mvc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.mvc.logica.Logica;

public class ControllerServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "br.com.caelum.mvc.logica." + parametro;
		
		try{
			Class classe = Class.forName(nomeDaClasse);
			Logica logica = (Logica) classe.newInstance();
			String retorno = logica.executa(request, response);
			
			RequestDispatcher rd = request.getRequestDispatcher(retorno);
			rd.forward(request, response);
		}catch(Exception e){
			throw new ServletException("A l�gica de neg�cios causou uma exce��o", e);
		}
	}

}
