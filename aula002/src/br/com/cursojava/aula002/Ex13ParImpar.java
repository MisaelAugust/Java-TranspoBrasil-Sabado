package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex13ParImpar {
	public static void main(String[] args) {
		Scanner tecladoEx13 = new Scanner(System.in);
		
		System.out.println("Informe um n�mero e descubra se e par ou impar: ");
		int numeroInformado = Integer.parseInt(tecladoEx13.nextLine());
		
		if(numeroInformado % 2 == 0){
			System.out.println("O n�mero � par");
		}else{
			System.out.println("O n�mero � impar");
		}
		
		tecladoEx13.close();
		
	}
}
