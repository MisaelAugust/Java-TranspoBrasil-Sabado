package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex11IdadeCnh {
	public static void main(String[] args) {
		Scanner tecladoEx11 = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		int idade = Integer.parseInt(tecladoEx11.nextLine());
		
		if(idade >= 18){
			System.out.println("Pode tirar a carteira");
		}else{
			System.out.println("Idade insuficiente");
		}
		
		tecladoEx11.close();
	}
}
