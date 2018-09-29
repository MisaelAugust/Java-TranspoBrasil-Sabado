package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex13ParImpar {
	public static void main(String[] args) {
		Scanner tecladoEx13 = new Scanner(System.in);
		
		System.out.println("Informe um número e descubra se e par ou impar: ");
		int numeroInformado = Integer.parseInt(tecladoEx13.nextLine());
		
		if(numeroInformado % 2 == 0){
			System.out.println("O número é par");
		}else{
			System.out.println("O número é impar");
		}
		
		tecladoEx13.close();
		
	}
}
