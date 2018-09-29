package br.com.cursojava.aula001;

public class MetodoMin {
	public static void main(String[] args) {
		
		int n1 = 7;
		int n2 = 10;
		int n3 = 20;
		int n4 = 30;
		
		int min = Math.min(Math.min(n1,n2), Math.min(n3, n4));

		System.out.println("Menor número é: " + min);
		
	}
}
