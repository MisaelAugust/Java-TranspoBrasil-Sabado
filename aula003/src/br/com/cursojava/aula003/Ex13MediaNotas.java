package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex13MediaNotas {
	public static void main(String[] args) {
		Scanner tecladoEx13 = new Scanner(System.in);
		
		int contador = 1;
		
		double nota = 0;
		int quantidadeNotas = 3;
		double totalNotas = 0;
		
		
		while(contador <= quantidadeNotas){
			System.out.printf("Informe sua nota de n�mero %d \n", contador);
			nota = Double.parseDouble(tecladoEx13.nextLine());
			totalNotas = nota + nota + nota;
			contador++;
		}
		
		double media =  totalNotas / quantidadeNotas;
		
		System.out.printf("Sua m�dia �: %.2f", media);
		
		tecladoEx13.close();
	}
}
