package br.com.caelum.agenda.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FiltroTempoDeExecucao implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long tempoInicial = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long tempoFinal = System.currentTimeMillis();
		String uri = ((HttpServletRequest)request).getRequestURI();
		System.out.println("Tempo da requisição de " + uri + " demorou (ms): " + (tempoFinal-tempoInicial));
	}

}
