package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex18Bissexto {
	public static void main(String[] args) {
		Scanner tecladoEx18 = new Scanner(System.in);
		
		int anoNascimento = 0;
		
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = Integer.parseInt(tecladoEx18.nextLine());
		
		if(anoNascimento % 400 == 0 || anoNascimento % 4 == 0 && anoNascimento % 100 != 0){
			System.out.println("Você nasce em um ano bissexto");
		}else{
			System.out.println("Seu ano de nascimento não era um ano bissexto");
		}
		
		tecladoEx18.close();				
	}
}
