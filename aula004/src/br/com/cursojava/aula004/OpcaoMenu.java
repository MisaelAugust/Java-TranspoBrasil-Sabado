package br.com.cursojava.aula004;

import java.util.Scanner;

public class OpcaoMenu {
	public static void main(String[] args) {
		Scanner tecladoEx2 = new Scanner(System.in);
		
		String letraInformada = null;
		
		do{
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download arquivo");
			System.out.println("D - Upload arquivo");
			System.out.println("S - Sair");
			letraInformada = tecladoEx2.nextLine();
			
			switch(letraInformada){
				
			case "A":
				System.out.println("Abrir arquivo");
				break;
				
			case "B":
				System.out.println("Procurar arquivo");
				break;
				
			case "C":
				System.out.println("Download arquivo");
				break;
				
			case "D":
				System.out.println("Upload arquivo");
				break;
			
			case "S":
				System.out.println("Sair");
				break;
			
			default:
				System.out.println("Opção inválida");
			}
		}while(!"S".equalsIgnoreCase(letraInformada));
		
		System.out.println("Fim execução");
		
		tecladoEx2.close();
	}
}
