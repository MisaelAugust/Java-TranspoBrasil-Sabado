package br.com.cursojava.aula004;

import java.util.Scanner;

public class ValorInformadoMenorZero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		int idade = 0;
		
		do{
			System.out.println("Digite sua idade ");
			idade = Integer.parseInt(teclado.nextLine());
			if(idade < 0){
				System.out.println("Valor inv�lido");
			}
		}while(idade < 0);
		
		System.out.printf("Idade informada foi %d ", idade);
		System.out.println("Fim Execu��o");
		
		teclado.close();
	}
}	