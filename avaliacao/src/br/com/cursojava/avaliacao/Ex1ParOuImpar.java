package br.com.cursojava.avaliacao;

//1) Escreva um programa que solicite um número e informe se o número informedo é impar ou par.

import java.util.Scanner;

public class Ex1ParOuImpar {
	public static void main(String[] args) {
		Scanner tecladoEx1 = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = Integer.parseInt(tecladoEx1.nextLine());
		
		if(numero % 2 == 0){
			System.out.printf("O número %d é um número par", numero);
		}else{
			System.out.printf("O número %d é um número impar", numero);
		}
		
		tecladoEx1.close();
	}
}
