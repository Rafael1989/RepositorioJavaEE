package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaAtualiza {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setNome("a");
		contato.setEmail("b");
		contato.setEndereco("c");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(2L);
		dao.altera(contato);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("a");
		funcionario.setUsuario("a");
		funcionario.setSenha("a");
		funcionario.setId(2L);
		funcionarioDAO.altera(funcionario);
	}
}
