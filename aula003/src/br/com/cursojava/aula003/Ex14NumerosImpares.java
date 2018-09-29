package br.com.cursojava.aula003;


public class Ex14NumerosImpares {
	public static void main(String[] args) {
		

		int contador = 1;
		
		while(contador <= 100){
			if(contador % 2 != 0){
			System.out.println(contador);
			}
			contador++;
		}
	}
}
