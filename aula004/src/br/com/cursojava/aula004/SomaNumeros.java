package br.com.cursojava.aula004;

public class SomaNumeros {
	public static void main(String[] args) {
		
		int somaNumeros = 0;

		for(int numero = 0;numero <=50;numero++){
			somaNumeros += numero;
		}
		System.out.println("Soma dos números é: "+somaNumeros);
	}
}
