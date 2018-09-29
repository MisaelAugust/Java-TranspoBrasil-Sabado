package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex8MaiorNota {

	public static void main(String[] args) {
		Scanner tecladoEx8 = new Scanner(System.in);
		
		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = Double.parseDouble(tecladoEx8.nextLine());
		System.out.println("Informe o segundo valor: ");
		valor2 = Double.parseDouble(tecladoEx8.nextLine());
		System.out.println("Informe o terceiro valor: ");
		valor3 = Double.parseDouble(tecladoEx8.nextLine());
		
		System.out.printf("O maior valor é: %.2f \nO menor valor é: %.2f ", Math.max(valor1, Math.max(valor2, valor3)), 
				Math.min(valor1, Math.min(valor2, valor3)));		
		tecladoEx8.close();
	}	
}
