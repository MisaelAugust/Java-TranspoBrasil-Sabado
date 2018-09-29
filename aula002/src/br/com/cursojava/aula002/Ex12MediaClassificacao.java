package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex12MediaClassificacao {
	
	public static void main(String[] args) {
		Scanner tecladoEx12 = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		
		System.out.println("Informe sua primeira nota: ");
		nota1 = Double.parseDouble(tecladoEx12.nextLine());
		System.out.println("Informe sua segunda nota: ");
		nota2 = Double.parseDouble(tecladoEx12.nextLine());
		System.out.println("Informe sua terceia nota: ");
		nota3 = Double.parseDouble(tecladoEx12.nextLine());
		System.out.println("Informe sua quarta nota: ");
		nota4 = Double.parseDouble(tecladoEx12.nextLine());
		
		double media = (nota1+nota2+nota3+nota4) / 4;
		
		if(media >= 9){
			System.out.println("Conceito A");
		}else if(media >= 8 && media < 9){
			System.out.println("Conceito B");
		}else if(media >= 6 && media < 8){
			System.out.println("Conceito C");
		}else if(media >= 5 && media < 6){
			System.out.println("Conceito D");
		}else{
			System.out.println("Insuficiente");
		}
		
		tecladoEx12.close();
	}
}
