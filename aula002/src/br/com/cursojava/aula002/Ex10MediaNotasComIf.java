package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex10MediaNotasComIf {

	public static void main(String[] args) {
		Scanner tecladoEx10 = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		System.out.println("Informe sua primeira nota: ");
		nota1 = Double.parseDouble(tecladoEx10.nextLine());
		System.out.println("Informe sua segunda nota: ");
		nota2 = Double.parseDouble(tecladoEx10.nextLine());
		System.out.println("Informe sua terceira nota: ");
		nota3 = Double.parseDouble(tecladoEx10.nextLine());
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if( media > 7){
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
		
		tecladoEx10.close();
		
	}
	
}
