package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex12MetadeMaiusculoMetadeMinusculo {
	public static void main(String[] args) {
		Scanner tecladoEx12 = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		
		String frase = tecladoEx12.nextLine();
		
		int tamanhoFrase = frase.trim().length();
		
		System.out.println(frase.substring(0, tamanhoFrase / 2).toLowerCase() + frase.substring(tamanhoFrase / 2).toUpperCase());
		
		tecladoEx12.close();
	}
}
