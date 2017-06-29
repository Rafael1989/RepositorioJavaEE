package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaRemove {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setId(1L);
		dao.remove(contato);
		System.out.println("Contato removido!");
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = new Funcionario();
		funcionario.setId(1L);
		funcionarioDAO.remove(funcionario);
	}
}
