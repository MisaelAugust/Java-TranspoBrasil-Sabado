package br.com.cursojava.aula004;

import java.util.Scanner;

public class ApresentaNotasDigitadas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] notas = new int[5];
		int i = 0;
		for(i = 0; i < notas.length;i++){
			System.out.println("Informe o valor das notas: ");
			notas[i] = Integer.parseInt(teclado.nextLine());			
		}
		
		for(int contador = 0; contador < notas.length; contador++){
		System.out.println(notas[contador]);
		}
		teclado.close();
	}
}
