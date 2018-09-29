package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex5IdadeEmDias {
	
	public static void main(String[] args) {
		Scanner tecladoEx5 = new Scanner(System.in);
		
		int idade = 0;
		int ano = 0;
		int quantidadeDias = 0;
		
		System.out.println("Informe sua idade(Anos): ");
		idade = Integer.parseInt(tecladoEx5.nextLine());
		ano = 365;
		quantidadeDias = idade * ano;
		
		System.out.printf("Você já viveu %d dias.", quantidadeDias);
		
		tecladoEx5.close();
	}

}
