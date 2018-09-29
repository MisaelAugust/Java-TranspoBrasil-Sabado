package br.com.cursojava.aula001;

public class MediaNotas {
	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 9;
		int nota3 = 8;
		int media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Primeira nota = " + nota1);
		System.out.println("Segunda Nota = " + nota2);
		System.out.println("Terceira nota = " + nota3);
		System.out.println("Sua média é = " + media);
		
		System.out.printf("%d + %d + %d = Sua média é %d ", nota1, nota2, nota3, (nota1 + nota2 + nota3) / 3);
		
	}
}
