package br.com.cursojava.aula001;

public class MetodoMax {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 7;
		int n3 = 10;
		int n4 = 25;
		
		int max = Math.max(Math.max(n1, n2), Math.max(n3, n4));
		
		System.out.println(max);
	}
}
