package br.com.coursojava;

import java.util.Scanner;

public class CadastroProduto {

	ProdutoController teste = new ProdutoController();

	public void mostraMenu(Scanner teclado) {
		System.out.println("######### Escolha uma das opções abaixo #########");
		int ie_opcao = 0;
		try {
			do {
				System.out.println("1 - Cadastrar produto");
				System.out.println("2 - Listar produto");
				System.out.println("3 - Remover produto");
				System.out.println("4 - Sair");

				ie_opcao = Integer.parseInt(teclado.nextLine());
				tratarOpcao(ie_opcao, teclado);

			} while (ie_opcao != 4);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void tratarOpcao(int ie_opcao, Scanner teclado) {
		switch (ie_opcao) {
		case 1:
			cadastroProduto(teclado);
			break;
		case 2:
			listarProduto();
			break;
		case 3:
			removeProduto(teclado);
			break;
		case 4:
			sair();
			break;
		default:
			opcaoInvalida();
			break;
		}

	}

	private void cadastroProduto(Scanner teclado) {
		try {
			System.out.println("######### Cadastre seu produto #########");
			System.out.println("Infome o nome do produto: ");
			String nome = teclado.nextLine();
			System.out.println("Infome a descrição do produto: ");
			String descricao = teclado.nextLine();
			System.out.println("Infome o valor do produto: ");
			double preco = Double.parseDouble(teclado.nextLine());
			teste.criarProduto(nome, descricao, preco);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void listarProduto() {
		System.out.println("######### Listar produtos #########");

		int quantidade = teste.contarProduto();

		try {
			if (quantidade > 0) {

				Produto atual = null;

				for (int index = 0; index < quantidade; index++) {
					atual = teste.buscarProduto(index);
					System.out.printf("%s - %s - %s\n", atual.getNome(), atual.getDescricao(), atual.getPreco());

				}
			} else {
				System.out.println("Não existe produto cadastado.");

			}

			System.out.println("##########################");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void removeProduto(Scanner teclado) {
		// TODO Auto-generated method stub

	}

	private void sair() {
		System.out.println("Obrigado por utilizar nosso sistema.");

	}

	private void opcaoInvalida() {
		System.out.println("Opção digitada é inválida.");

	}
}
