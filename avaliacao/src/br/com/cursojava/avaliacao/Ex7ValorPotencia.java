package br.com.cursojava.avaliacao;

//7) Escreva um programa que solicite um n�mero e em seguida informe o valor do n�mero elevado a quinta pot�ncia;

import java.util.Scanner;

public class Ex7ValorPotencia {
	public static void main(String[] args) {
		Scanner tecladoEx7 = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		int numeroInformado = Integer.parseInt(tecladoEx7.nextLine());
		
		System.out.println(Math.pow(numeroInformado, 5));
		
		tecladoEx7.close();
	}
}
