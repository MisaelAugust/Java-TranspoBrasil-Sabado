package br.com.cursojava.aula005.orientacaoobjeto;

import java.util.Scanner;

public class CadastroContato {
	
	ContatoController controller = new ContatoController();
	
	public void mostraMenu(Scanner teclado){
		System.out.println("####### MENU PRINCIPAL #######");
		int opcao = 0;
		
		do{
			System.out.println("1 - Cadastra novo Contato");
			System.out.println("2 - Listar Contatos");
			System.out.println("3 - Sair");
			
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		}while(opcao != 3);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		
		switch (opcao) {
		case 1:
			CadastrarContato(teclado);
			break;
			
		case 2:
			listarContatos();
			break;
		
		case 3:
			sair();
			break;
		default:
			mostrarOpcaoInvalida();
			
		}
		
	}

	private void CadastrarContato(Scanner teclado) {
		System.out.println("####### CADASTRAR NOVO CONTATO #######");
		System.out.println("Informe o nome do contato:");
		String nome = teclado.nextLine();
		System.out.println("Informe o e-mail do contato:");
		String email = teclado.nextLine();
		System.out.println("Informe o telefone do contato:");
		String telefone = teclado.nextLine();
		controller.criarContato(nome,email,telefone);
		System.out.println("################");
	}

	private void listarContatos() {
		System.out.println("####### LISTAR CONTATOS #######");
		int quantidade = controller.contarContatos();
		
		if(quantidade > 0){
			Contato atual = null;
			for (int index = 0; index < quantidade; index++) {
				atual = controller.buscarContato(index);
				System.out.printf("%s - %s - %s\n",atual.nome, atual.email,atual.telefone);
			}
		}else{
			System.out.println("N�o existem contatos cadastrados.");
		}
		
		System.out.println("################");
	}

	private void sair() {
		System.out.println("Obrigado por utilizar nosso Systema.");
		
	}

	private void mostrarOpcaoInvalida() {
		System.out.println("Voc� digitou uma op��o inv�lida.");
		
	}

}
