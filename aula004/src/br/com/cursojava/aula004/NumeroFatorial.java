package br.com.cursojava.aula004;

import java.util.Scanner;

public class NumeroFatorial {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroInformado = 0;
		
		do {
			System.out.println("Informe um número: ");
			numeroInformado = Integer.parseInt(teclado.nextLine());
			
			long fatorial =1;
			for(int i = 1;i<=numeroInformado;i++){
				fatorial *= i;
				
				System.out.println(fatorial);
			}
			
		
		} while (numeroInformado < 1 || numeroInformado > 20);
			
		
		
			teclado.close();
	}
}
