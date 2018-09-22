package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex14IdadeCategoria {
	public static void main(String[] args) {
		Scanner tecladoEx14 = new Scanner(System.in);
		
		
		System.out.println("Informe sua idade: ");
		int idade = Integer.parseInt(tecladoEx14.nextLine());
		
		if(idade >= 18){
			System.out.println("Categoria adulto");
		}else if(idade >= 14 && idade <= 17){
			System.out.println("Categoria Juvenil");
		}else if(idade >= 12 && idade <= 13){
			System.out.println("Categoria Infanto Juvenil");
		}else if(idade >= 9 && idade <=11){
			System.out.println("Categoria Infantil");
		}else{
			System.out.println("Categoria Mirim" );
		}
		tecladoEx14.close();
	}
}