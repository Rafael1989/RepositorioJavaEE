package br.com.caelum.mvc.logica;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Executando a logica e redirecionando...");
		
		RequestDispatcher rd = request.getRequestDispatcher("/primeira-logica.jsp");
		rd.forward(request, response);
		
		return "/primeira-logica.jsp";
	}

}
