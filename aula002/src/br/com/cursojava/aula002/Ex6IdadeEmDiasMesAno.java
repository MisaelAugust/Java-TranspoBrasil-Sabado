package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex6IdadeEmDiasMesAno {
	public static void main(String[] args) {
		
		int dias = 0;
		int mes = 0;
		int anos = 0;		
		
		Scanner tecladoEx6 = new Scanner(System.in);
		
		System.out.println("Informe sua idade em dias: ");
		dias = Integer.parseInt(tecladoEx6.nextLine());
		
		System.out.println("1 "+anos);
		System.out.println("1 "+mes);
		System.out.println("1 "+dias);
		
		anos = dias / 360;
		System.out.println("2 "+anos);
		System.out.println("2 "+mes);
		System.out.println("2 "+dias);
		dias -= 360 * anos;
		System.out.println("3 "+anos);
		System.out.println("3 "+mes);
		System.out.println("3 "+dias);
		mes = dias / 30;
		System.out.println("4 "+anos);
		System.out.println("4 "+mes);
		System.out.println("4 "+dias);
		dias -= 30 * mes;
		System.out.println("5 "+anos);
		System.out.println("5 "+mes);
		System.out.println("5 "+dias);
		
		
		System.out.printf("Idade em anos %d, \nmês %d, \ndias %d", anos, mes, dias);
		
		tecladoEx6.close();		
		
	}
}
