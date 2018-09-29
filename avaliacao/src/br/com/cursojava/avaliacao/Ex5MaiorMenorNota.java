package br.com.cursojava.avaliacao;

/*
 5) Escreva um programa que solicite 10 notas e em seguida calcula e apresenta a menor e a maior not digitada;
 */

import java.util.Scanner;

public class Ex5MaiorMenorNota {
	public static void main(String[] args) {
		Scanner tecladoEx5 = new Scanner(System.in);
		
	
		int contador = 0;

		while(contador <= 3){
			System.out.println("Informe um número: ");
			int numeroInformado = Integer.parseInt(tecladoEx5.nextLine());
			int numero = Math.max(Math.max(Math.max(numeroInformado, numeroInformado), Math.max(numeroInformado, numeroInformado)), 
					Math.max(Math.max(numeroInformado, numeroInformado), Math.max(numeroInformado, numeroInformado)));
			int maiorNumero = numero;
			System.out.println(maiorNumero);
			
			contador++;
			
		}

		tecladoEx5.close();
	}
}
