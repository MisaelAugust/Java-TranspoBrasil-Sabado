package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome por favor: ");
		String nome = teclado.nextLine(); // sempre retorna String
		System.out.printf("O nome informado foi %s \n", nome);
		
		teclado.close();
		
	}
}
