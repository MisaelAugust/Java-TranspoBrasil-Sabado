package br.com.cursojava.avaliacao;

//1) Escreva um programa que solicite um n�mero e informe se o n�mero informedo � impar ou par.

import java.util.Scanner;

public class Ex1ParOuImpar {
	public static void main(String[] args) {
		Scanner tecladoEx1 = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int numero = Integer.parseInt(tecladoEx1.nextLine());
		
		if(numero % 2 == 0){
			System.out.printf("O n�mero %d � um n�mero par", numero);
		}else{
			System.out.printf("O n�mero %d � um n�mero impar", numero);
		}
		
		tecladoEx1.close();
	}
}
