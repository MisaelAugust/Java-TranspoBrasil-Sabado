package br.com.cursojava.avaliacao;

/*
10)Escreva um programa que solicite a idade, altura e o peso de uma pessoa e em seguida calcule o IMC utilizando a formula 
imc = peso/(altura*altura). O programa deve apresentar uma mensagem informando se o imc esta abaixo, normal ou obeso de acordo com a tabela abaixo:
Entre 17 e 18,49		"Abaixo do peso"
Entre 18,50 e 24,99		"Peso normal"
Entre 25 e 29,99		"Acima do peso"
Entre 30 e 39,99		"Obesidade I"
Acima de 40 			"Obesidade morbida"	
 */

import java.util.Scanner;

public class Ex10Imc {
	public static void main(String[] args) {
		Scanner tecladoEx10 = new Scanner(System.in);
		
		double altura = 0;
		double peso = 0;
		
		System.out.println("Informe sua idade: ");
		int idade = Integer.parseInt(tecladoEx10.nextLine());
		System.out.println("Informe sua altura: ");
		altura = Double.parseDouble(tecladoEx10.nextLine());
		System.out.println("Informe seu peso: ");
		peso = Double.parseDouble(tecladoEx10.nextLine());
		
		double imc = peso / (altura * altura);
		
		if (imc >= 17 && imc <= 18.49){
			System.out.printf("Abaixo do peso, sua idade � %d e seu imc � %f",idade, imc);
		}else if(imc >= 18.50 && imc < 25){
			System.out.printf("Peso normal, sua idade � %d e seu imc � %f",idade, imc);
		}else if(imc >= 25 && imc < 30){
			System.out.printf("Acima do peso, sua idade � %d e seu imc � %f",idade, imc);
		}else if(imc >= 30 && imc < 40){
			System.out.printf("Obesidade I, sua idade � %d e seu imc � %f",idade, imc);
		}else{
			System.out.printf("Obesidade morbida, sua idade � %d e seu imc � %f",idade, imc);
		}
		tecladoEx10.close();
	}
}
