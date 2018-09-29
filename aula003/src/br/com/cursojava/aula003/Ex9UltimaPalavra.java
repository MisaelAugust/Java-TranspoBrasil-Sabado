package br.com.cursojava.aula003;

import java.util.Scanner;	

public class Ex9UltimaPalavra {
	public static void main(String[] args) {
		Scanner tecladoEx9 = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		
		System.out.println("Digite uma frase");
		
		String palavra = tecladoEx9.nextLine();
		
		int index = palavra.trim().lastIndexOf(" ");
		
		System.out.println(palavra.trim().substring(index+1));	
		
		tecladoEx9.close();
				
	}
}
