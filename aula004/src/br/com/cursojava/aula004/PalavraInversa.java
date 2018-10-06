package br.com.cursojava.aula004;

import java.util.Scanner;

public class PalavraInversa {
	public static void main(String[] args) {
		Scanner tecladoEx3 = new Scanner(System.in);
		

		System.out.println("Digite uma palavra: ");
		String palavra = tecladoEx3.nextLine();
		String palavraInvertida = "";
		int tamanhoPalavra = palavra.length();
		do {
			
			palavraInvertida += palavra.substring(tamanhoPalavra - 1, tamanhoPalavra);
			tamanhoPalavra--;
			
		} while (tamanhoPalavra > 0);
		
		
		System.out.printf("A palavra digitada é: '%s' \n", palavra);
		System.out.printf("A palavra invertida é: '%s' ", palavraInvertida);
	
		// outra maneira de fazer
		/* 
		System.out.println("Digite uma palavra: ");
		String palavra = tecladoEx3.nextLine();
		String inverso = "";
		int index = palavra.length() -1;
		if(index > -1){
			do {
				inverso += palavra.charAt(index--);
			} while (index >= 0);
		}
		
		System.out.printf("O inverso da palavra é '%s' \n",inverso);
		*/
		tecladoEx3.close();
	}
}
