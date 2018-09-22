package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex9MediaPonderada {
	
	public static void main(String[] args) {
		Scanner tecladoEx9 = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;

		
		System.out.println("Digite sua primeira nota: ");
		nota1 = Double.parseDouble(tecladoEx9.nextLine());
		System.out.println("Digite sua segunda nota: ");
		nota2 = Double.parseDouble(tecladoEx9.nextLine());
		System.out.println("Digite sua terceira nota");
		nota3 = Double.parseDouble(tecladoEx9.nextLine());
		
		double somaNotas = (2 * nota1) + (3 * nota2) + (5 * nota3);
		double resultado1 = somaNotas / 9;

		
		System.out.printf("A soma das notas é: %.2f \nSua média é: %.2f", somaNotas, resultado1);
		
		tecladoEx9.close();
		
	}
}
