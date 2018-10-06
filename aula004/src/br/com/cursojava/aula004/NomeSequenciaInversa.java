package br.com.cursojava.aula004;

import java.util.Scanner;

public class NomeSequenciaInversa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] nomes = new String[5];
		int i = 0;
		for(; i < nomes.length;i++){
			System.out.println("Informe os nomes: ");
			nomes[i] = teclado.nextLine();
			
		}
		
		for(int contador = 0; contador < nomes.length; contador++){
		System.out.println(nomes[i -= 1]);
		}
		teclado.close();
	}
}
