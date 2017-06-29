package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Cevada");
		funcionario.setUsuario("aaa");
		funcionario.setSenha("aaa");
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.adiciona(funcionario);
		
		System.out.println("Gravado!");
	}
}
