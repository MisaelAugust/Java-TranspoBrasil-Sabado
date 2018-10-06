package br.com.cursojava.aula004;

import java.util.Scanner;

public class IdadeMenorZero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0;
		
		do {
			System.out.println("Digite sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0){
				System.out.printf("Sua idade é %d", idade);
			}else{
				System.out.println("Idade inválida");
				System.out.println("");
			}
		} while (idade < 0);
		
		teclado.close();		
	}
}
