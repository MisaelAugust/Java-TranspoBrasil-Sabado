package br.com.cursojava.avaliacao;

/*
9) Escreva um programa que solicite o valor de um produto, em seguida aplique a tabela de descontos abaixo e escreva o valor do desconto, 
o percentual de desconto e o valor l�quido;

0 a 1800		11%
1800,01 a 2500	15%
acima de 2500	18%
 */

import java.util.Scanner;

public class Ex9Desconto {
	public static void main(String[] args) {
		Scanner tecladoEx9 = new Scanner(System.in);
		
		double valor = 0;
		
		System.out.println("Informe o valor da compra: ");
		valor = Double.parseDouble(tecladoEx9.nextLine());
		
		System.out.println(valor);
		
		if(valor <= 1800){
			int porcentagem = 11;
			double desconto = (valor * porcentagem) / 100;
			double totalValor = valor - desconto;
			System.out.printf("O valor do produto � %.2f, o percentual de desconto � %d, "
					+ "o desconto � de %.2f, e o valor com o desconto � %.2f", valor,porcentagem, desconto, totalValor);
		}else if(valor > 1800 && valor <= 2500){
			int porcentagem = 15;
			double desconto = (valor * porcentagem) / 100;
			double totalValor = valor - desconto;
			System.out.printf("O valor do produto � %.2f, o percentual de desconto � %d, "
					+ "o desconto � de %.2f, e o valor com o desconto � %.2f", valor, porcentagem, desconto, totalValor);
		}else{
			int porcentagem = 18;
			double desconto = (valor * porcentagem) / 100;
			double totalValor = valor - desconto;
			System.out.printf("O valor do produto � %.2f, o percentual de desconto � %d, "
					+ "o desconto � de %.2f, e o valor com o desconto � %.2f", valor,porcentagem, desconto, totalValor);
		}
		tecladoEx9.close();
	}
}
