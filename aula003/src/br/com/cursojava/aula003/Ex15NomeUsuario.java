package br.com.cursojava.aula003;

import java.util.Scanner;

public class Ex15NomeUsuario {
	public static void main(String[] args) {
		Scanner tecladoEx15 = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = tecladoEx15.nextLine();
		int quantidadeLetras = nome.trim().length();
		int contador = 1;
		System.out.println(quantidadeLetras);
		
		while(contador > 0){
			
			if(nome.length() > 0){
				System.out.println("Digite novamente");
				nome = tecladoEx15.nextLine();
			}else{
				break;
			}
			
			contador++;
		}
		
		tecladoEx15.close();
	}
}
