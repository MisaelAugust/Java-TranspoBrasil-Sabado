package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex7ValorElevadoPotencia {
	public static void main(String[] args) {
		Scanner tecladoEx7 = new Scanner(System.in);
		
		double numeroInformado = 0;
		double resultado = 0;
		int potencia = 2;
		
		System.out.println("Informe um número: ");
		numeroInformado = Double.parseDouble(tecladoEx7.nextLine());
		resultado = Math.pow(numeroInformado, potencia);
		
		System.out.printf("%.2f elevado a 2 potencia é: %.2f ", numeroInformado, resultado);
		
		tecladoEx7.close();
	}
}
