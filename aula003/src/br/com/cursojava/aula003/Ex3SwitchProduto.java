package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex3SwitchProduto {
	public static void main(String[] args) {
		Scanner tecladoEx3 = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar Produto");
		System.out.println("3 - Pesquisar produto");
		System.out.println("4 - Remover produto");
		System.out.println("5 - Sair");
		
		int opcaoInformada = Integer.parseInt(tecladoEx3.nextLine());
		
		switch (opcaoInformada){
		
		case 1:
			System.out.println("Você escolheu a opção Cadastrar produto");
			break;
		case 2:
			System.out.println("Você escolheu a opção Listar produto");
			break;
		case 3:
			System.out.println("Você escolheu a opção Pesquisar produto");
			break;
		case 4:
			System.out.println("Você escolheu a opção Remover produto");
			break;
		case 5:
			System.out.println("Obrigado por utilizar nossos terminais de atendimento");
			break;
		default:
			System.out.println("Opção inválida");
			break;	
		}
		tecladoEx3.close();
	}
}
