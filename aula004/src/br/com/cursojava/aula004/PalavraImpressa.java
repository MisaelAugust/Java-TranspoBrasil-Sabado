package br.com.cursojava.aula004;

import java.util.Scanner;

public class PalavraImpressa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavraDigitada = teclado.nextLine();	
		
		
		for(int indice = 0;indice < palavraDigitada.length(); indice++ ){
			System.out.println(palavraDigitada.substring(0, indice+1));
		}
		
		teclado.close();
	}
}
