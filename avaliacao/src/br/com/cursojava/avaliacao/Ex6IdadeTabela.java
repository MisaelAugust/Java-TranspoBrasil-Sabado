package br.com.cursojava.avaliacao;

/*
6) Escreva um programa que solicite a idade do usuário e o classifique de acordo com a tabela abaixo:

0 a 12 - Criança
13 a 17 - Adolecente
18 a 24 - Jovem
25 a 59 - Adulto
60 ou mais - Idoso
 */

import java.util.Scanner;

public class Ex6IdadeTabela {
	public static void main(String[] args) {
		Scanner tecladoEx6 = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		int idade = Integer.parseInt(tecladoEx6.nextLine());
		
		if(idade <= 12){
			System.out.println("Criança");
		}else if(idade >= 13 && idade <= 17){
			System.out.println("Adolecente");
		}else if(idade >= 18 && idade <= 24){
			System.out.println("Jovem");
		}else if(idade >= 25 && idade <= 59){
			System.out.println("Adulto");
		}else{
			System.out.println("Idoso");
		}
		tecladoEx6.close();
	}
}
