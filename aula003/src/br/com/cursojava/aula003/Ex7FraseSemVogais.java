package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex7FraseSemVogais {
	public static void main(String[] args) {
		Scanner tecladoEx7 = new Scanner(System.in);
		
		System.out.println("Escreva uma frase: ");
		
		
		String frase = tecladoEx7.nextLine();
		
		String teste = frase.replaceAll("[aeiou]"," ");
				
		String semVogal = frase.replaceAll("a", " ");
		semVogal = semVogal.replaceAll("e", " ");
		semVogal = semVogal.replace("i", " ");
		semVogal = semVogal.replace("o", " ");
		semVogal = semVogal.replace("u", " ");
		
		System.out.println(semVogal);
		System.out.println(teste);
		
		tecladoEx7.close();		

	}
}
