package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex3SwitchProduto {
	public static void main(String[] args) {
		Scanner tecladoEx3 = new Scanner(System.in);
		
		System.out.println("Escolha uma das op��es abaixo: ");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar Produto");
		System.out.println("3 - Pesquisar produto");
		System.out.println("4 - Remover produto");
		System.out.println("5 - Sair");
		
		int opcaoInformada = Integer.parseInt(tecladoEx3.nextLine());
		
		switch (opcaoInformada){
		
		case 1:
			System.out.println("Voc� escolheu a op��o Cadastrar produto");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o Listar produto");
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o Pesquisar produto");
			break;
		case 4:
			System.out.println("Voc� escolheu a op��o Remover produto");
			break;
		case 5:
			System.out.println("Obrigado por utilizar nossos terminais de atendimento");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;	
		}
		tecladoEx3.close();
	}
}
