package br.com.cursojava.avaliacao;

//3) Escreva um programa que solicite uma palavra e em seguida apresente a palavra digitada de modo inverso;

import java.util.Scanner;

public class Ex3PalavraInversa {
	public static void main(String[] args) {
		Scanner tecladoEx3 = new Scanner(System.in);
		
		int contador = 0;
		System.out.println("Digite uma palavra: ");
		String palavra = tecladoEx3.nextLine();
		String invertido = "";
		
		System.out.println(palavra);
		
		while(contador < invertido.length() - 1){
			System.out.println(invertido);
			contador++;
		}
		
		tecladoEx3.close();
	}
}
