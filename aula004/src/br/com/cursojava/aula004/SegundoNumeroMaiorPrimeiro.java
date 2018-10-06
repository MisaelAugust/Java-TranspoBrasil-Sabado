package br.com.cursojava.aula004;

import java.util.Scanner;

public class SegundoNumeroMaiorPrimeiro {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		do {
			System.out.println("Informe dois números: ");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			
			if(numero2 < numero1){
				System.out.printf("Os números digitados foram %d e %d, digite novamente: \n", numero1, numero2);
			}else{
				for(int contador = numero1 +1 ; contador < numero2; contador++ ){
					System.out.println(contador);
				}
			}
		} while (numero1 > numero2);
		
		teclado.close();
	}
}
