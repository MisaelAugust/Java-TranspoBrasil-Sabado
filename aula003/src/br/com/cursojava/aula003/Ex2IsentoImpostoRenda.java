package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex2IsentoImpostoRenda {
	public static void main(String[]args){
		Scanner tecladoEx2 = new Scanner(System.in);
		
		double salario = 0;
		String isentoOuNao = null;
		
		System.out.println("Informe seu salario: ");
		salario = Double.parseDouble(tecladoEx2.nextLine());
		
		isentoOuNao = salario > 1800? "voc� tem que declarar o imposto de renda" : "voc� � isento do imposto de renda";
		System.out.printf("Seu salario � de %.2f, sendo assim %s", salario, isentoOuNao);

		tecladoEx2.close();
	}
}
