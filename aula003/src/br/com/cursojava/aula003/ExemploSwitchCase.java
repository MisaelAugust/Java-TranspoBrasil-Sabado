package br.com.cursojava.aula003;

import java.util.Scanner;

public class ExemploSwitchCase {
	public static void main(String[] args) {
		
		final int dia1 = 1;
		
		//Quando a variavel � final n�o tem como atribuir valor a ela posteriormente.
		
		int dia = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 7");
		dia = Integer.parseInt(teclado.nextLine());
		
		switch (dia){
		case dia1:
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda feira");
			break;
		case 3:
			System.out.println("Ter�a feira");
			break;
		case 4:
			System.out.println("Quarta feira");
			break;
		case 5:
			System.out.println("Quinta feira");
			break;
		case 6:
			System.out.println("Sexta feira");
			break;
		case 7:
			System.out.println("S�bado");
		default:
			System.out.println("N�mero inv�lido");
		}
		
		teclado.close();
		
	}
}
