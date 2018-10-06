package br.com.cursojava.aula004;

import java.util.Scanner;

public class NotasDigitadasMaiorNota {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] notas = new int[5];
		int i = 0;

		System.out.println("digite as notas desejadas: ");
		int maiorNota = Integer.parseInt(teclado.nextLine());
		int menorNota = maiorNota;
		notas[0] = maiorNota;
		
		for(i = 1; i < notas.length; i++){
			System.out.println("Digite as notas desejadas: ");
			notas[i] = Integer.parseInt(teclado.nextLine());
			
			if(maiorNota < notas[i]){
				maiorNota = notas[i];
			}
			if(menorNota > notas[i]){
				menorNota = notas[i];
			}
		}
		
		for(int nota: notas){
			System.out.println(nota);
		}

		System.out.println("A maior nota digitada é: " + maiorNota);
		System.out.println("A menor nota digitada é: "+ menorNota);

		teclado.close();
	}
}
