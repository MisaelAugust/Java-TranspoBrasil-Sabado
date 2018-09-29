package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex1MediaDasNotasScanner {
	
	public static void main(String []args){
		Scanner tecladoMisael = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double mediaDasNotas = 0;
		
		
		System.out.println("Informe sua primeira nota: ");
		nota1 = Double.parseDouble(tecladoMisael.nextLine());
		System.out.println("Informe sua segunda nota");
		nota2 = Double.parseDouble(tecladoMisael.nextLine());
		System.out.println("Informe sua terceira nota: ");
		nota3 = Double.parseDouble(tecladoMisael.nextLine());
		
		mediaDasNotas = (nota1+nota2+nota3) / 3;
		
		System.out.printf("Sua média foi %.2f", mediaDasNotas);
		
		tecladoMisael.close();
		
	}
}
