package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex16RepeticaoPalavra {
	public static void main(String[] args) {
		Scanner tecladoEx16 = new Scanner(System.in);
		
		String palavra = tecladoEx16.nextLine();
		
		System.out.println(palavra);
		tecladoEx16.close();
	}
}
