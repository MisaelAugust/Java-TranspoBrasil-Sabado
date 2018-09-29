package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex5nomeQuantCaracter {
	public static void main(String[] args) {
		Scanner tecladoEx5 = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
		String nome = tecladoEx5.nextLine();
		
		System.out.printf("O nome informado foi %s, a quantidade de caracteres é %s", nome.trim(), nome.trim().length());
		tecladoEx5.close();
	}
}
