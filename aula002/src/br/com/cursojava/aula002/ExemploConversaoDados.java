package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploConversaoDados {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sua idade em 20 anos será: ");
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.println(idade + 20);
		
		teclado.close();
	}
}
