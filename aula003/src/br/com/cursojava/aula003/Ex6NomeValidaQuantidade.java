package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex6NomeValidaQuantidade {
	public static void main(String[] args) {
		Scanner tecladoEx6 = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
		String nome = tecladoEx6.nextLine();
		
		String validaNome = nome.trim().length() < 3? "Nome inv�lido" : "Seja bem vindo";
		
		System.out.println(validaNome);
		
		if(nome.trim().length() < 3){
			System.out.println("Nome inv�lido");
		}else{
			System.out.printf("Bem vindo %s", nome);
		}
		
		tecladoEx6.close();
	}
}
