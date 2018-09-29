package br.com.cursojava.aula001;

public class PorcentagemDoValor {
	public static void main(String[] args) {
		double valor = 870.50;
		double porcentagem = 13.5;
		double totalDaPorcentagem = (valor * porcentagem) / 100;
		
		System.out.println("13.5% de 870.50 é:  " + totalDaPorcentagem);
		System.out.printf("%f * %f / 100 = %f é 13.5%% de 870.50", valor, porcentagem, (valor * porcentagem) / 100);
	}
}
