package br.com.cursojava.avaliacao;

//2) Escreva um programa que solicite ao usu�rio a sua idade e em seguida apresente o valor da idade do usu�rio ap�s 20 anos

import java.util.Scanner;

public class Ex2IdadeVinteAnos {
	public static void main(String[] args) {
		Scanner tecladoEx2 = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		int idade = Integer.parseInt(tecladoEx2.nextLine());
		int idade20 = idade + 20;
		
		System.out.printf("sua idade � %d, e daqui vinte anos ser� %d", idade, idade20);
	
		tecladoEx2.close();
	}
}
