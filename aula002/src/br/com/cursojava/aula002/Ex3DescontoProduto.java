package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex3DescontoProduto {
	public static void main(String[] args) {
		Scanner teclado3 = new Scanner(System.in);
		
		double valor = 0;
		double percentualDesconto = 0;
		double valorDesconto = 0;
		double valorComDesconto = 0;
		
		System.out.println("Informe o valor do produto: ");
		valor = Double.parseDouble(teclado3.nextLine());
		System.out.println("Infome o percentual de desconto: ");
		percentualDesconto = Double.parseDouble(teclado3.nextLine());
		
		valorDesconto = (valor * percentualDesconto) / 100;
		valorComDesconto = valor - valorDesconto;
		
		System.out.printf("O valor do desconto é: %.2f \nO valor do produto é: %.2f \nO valor com desconto é: %.2f", 
				valorDesconto, valor, valorComDesconto);

		teclado3.close();
	}
}
