package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex4ImcPessoa {
	public static void main(String[] args) {
		Scanner tecladoEx4 = new Scanner(System.in);
		
		double altura = 0;
		double peso = 0;
		double imc = 0;
		
		System.out.println("Informe sua altura: ");
		altura = Double.parseDouble(tecladoEx4.nextLine());
		System.out.println("Informe seu peso: ");
		peso = Double.parseDouble(tecladoEx4.nextLine());
		
		imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é: %.2f", imc);
		
		tecladoEx4.close();
	}
}
