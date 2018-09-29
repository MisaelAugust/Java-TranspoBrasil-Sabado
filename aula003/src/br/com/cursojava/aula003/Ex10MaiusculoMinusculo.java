package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex10MaiusculoMinusculo {
	public static void main(String[] args) {
		Scanner tecladoEx10 = new Scanner(System.in);
		
		System.out.println("L ou l (minusculo)?");
		
		String frase = tecladoEx10.nextLine();
		
		if (frase.contains("L")){
			System.out.println("Sua frase é com L maiúsculo");
		}else if (frase.contains("l")){
			System.out.println("Sua frase é com l minúsculo");
		}else{
			System.out.println("Frase não possui L");
		}
		
		tecladoEx10.close();
	}
}
