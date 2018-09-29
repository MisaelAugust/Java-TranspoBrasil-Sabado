package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex1VotaOuNao {
	public static void main(String[] args){
		Scanner tecladoEx1 = new Scanner(System.in);
		
		int idade = 0;
		String podeOuNaoVotar = null;
		
		System.out.println("Informe sua idade");
		idade = Integer.parseInt(tecladoEx1.nextLine());
		podeOuNaoVotar = idade >= 16? "Pode Votar" : "Não pode votar";
		System.out.printf("Sua idade é %d, então você %s",idade, podeOuNaoVotar);
		
		tecladoEx1.close();
		
	}
}
