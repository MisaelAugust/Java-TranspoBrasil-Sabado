package br.com.cursojava.aula004;

public class NumerosPares {
	public static void main(String[] args) {
		int numero = 100;
		int numeroMax = 200;
		
		for(;numero <= numeroMax;numero++){
		if(numero % 2 == 0){
			System.out.println(numero);
			}
		}
	}
}
