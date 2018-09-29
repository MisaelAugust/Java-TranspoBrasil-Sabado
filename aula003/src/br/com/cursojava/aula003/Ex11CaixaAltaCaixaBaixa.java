package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex11CaixaAltaCaixaBaixa {
	public static void main(String[] args) {
		Scanner tecladoEx11 = new Scanner(System.in);
		
		System.out.println("Digite uma frase");
		
		String frase = tecladoEx11.nextLine();
				
		System.out.printf("Sua frase em caixa alta: %s \n", frase.toUpperCase());
		System.out.printf("Sua frase em caixa baixa: %s", frase.toLowerCase());
	
		tecladoEx11.close();
	}
}
