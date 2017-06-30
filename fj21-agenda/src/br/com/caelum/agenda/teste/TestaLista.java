package br.com.caelum.agenda.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.dao.FuncionarioDAO;
import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.modelo.Funcionario;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato : contatos){
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime()) + "\n");
		}
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		List<Funcionario> funcionarios = funcionarioDAO.getLista();
		
		for(Funcionario funcionario : funcionarios){
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Email: " + funcionario.getUsuario());
			System.out.println("Endereço: " + funcionario.getSenha());
		}
		
		
	}
}
