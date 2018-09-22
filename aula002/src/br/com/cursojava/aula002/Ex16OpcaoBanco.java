package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex16OpcaoBanco {
	public static void main(String[] args) {
		Scanner tecladoEx16 = new Scanner(System.in);
		
		int opcao = 1;
		
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Verificar Saldo");
		opcao = Integer.parseInt(tecladoEx16.nextLine());
		
		if(opcao == 1){
			System.out.println("Você Escolheu a opção Depositar");
		}else if(opcao == 2){
			System.out.println("Você Escolheu a opção Sacar");
		}else if (opcao == 3) {
			System.out.println("Você Escolheu a opção Verificar Saldo");
		}else{
			System.out.println("Você escolheu uma opção que não esta no menu, favor escolha novamente.");
		}
		
		tecladoEx16.close();
	}
}
