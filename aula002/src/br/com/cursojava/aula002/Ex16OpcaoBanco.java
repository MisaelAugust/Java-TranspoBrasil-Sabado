package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex16OpcaoBanco {
	public static void main(String[] args) {
		Scanner tecladoEx16 = new Scanner(System.in);
		
		int opcao = 1;
		
		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Verificar Saldo");
		opcao = Integer.parseInt(tecladoEx16.nextLine());
		
		if(opcao == 1){
			System.out.println("Voc� Escolheu a op��o Depositar");
		}else if(opcao == 2){
			System.out.println("Voc� Escolheu a op��o Sacar");
		}else if (opcao == 3) {
			System.out.println("Voc� Escolheu a op��o Verificar Saldo");
		}else{
			System.out.println("Voc� escolheu uma op��o que n�o esta no menu, favor escolha novamente.");
		}
		
		tecladoEx16.close();
	}
}
