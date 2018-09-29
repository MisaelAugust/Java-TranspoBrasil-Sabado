package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex17QuantidadeLetras {
	public static void main(String[] args) {
		Scanner tecladoEx17 = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = tecladoEx17.nextLine();
		
		if(nome.length() < 3){
			System.out.println("Nome invalido");
		}else{
			System.out.printf("seu nome é %s", nome);
		}
		
		tecladoEx17.close();
	}
	
}
