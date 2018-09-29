package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex8PrimeiraPalavra {
	public static void main(String[] args) {
		Scanner tecladoEx8 = new Scanner(System.in);
		
		System.out.println("Digite uma frase");
		
		String palavra = tecladoEx8.nextLine();
		
		int palavraAntesEspaco = palavra.indexOf(" ");
		
		System.out.println(palavra.substring(0, palavraAntesEspaco));
		
		tecladoEx8.close();
	}
}
