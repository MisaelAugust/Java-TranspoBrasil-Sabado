package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		int codigo = 0;
		
		// vai ser executado pelo menos uma vez, pois primeiro executa e depois verifica a expressão booleana;
		
		do{
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Remover Produtos");
			System.out.println("4 - Sair");
			codigo = Integer.parseInt(teclado.next());
			switch(codigo){
			
			case 1: 
				System.out.println("Você escolheu a opção de cadastrar produto");
				break;
			
			case 2:
				System.out.println("Você escolheu a opção de listar produto");
				break;
			
			case 3:
				System.out.println("Você escolheu a opção de remover produto");
				break;
				
			case 4:
				System.out.println("Executando logoff");
				break;
				
			default:
				System.out.println("Opção inválida");
			}
		}while(codigo != 4);
		
		System.out.println("Fim da aplicação");
		
		teclado.close();
		
	}
}
