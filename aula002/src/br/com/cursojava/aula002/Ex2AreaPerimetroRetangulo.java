package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex2AreaPerimetroRetangulo {
	public static void main(String []args){
		Scanner outroTeclado = new Scanner(System.in);
		int base = 0;
		int altura = 0;
		int area = 0;
		int perimetro = 0;
		
		
		System.out.println("Informe a base do retângulo: ");
		base = Integer.parseInt(outroTeclado.nextLine());
		System.out.println("Informe a altura do retângulo");
		altura = Integer.parseInt(outroTeclado.nextLine());
		
		area = base * altura;
		perimetro = (base + base) + (altura + altura);
		
		System.out.printf("A área do retangulo é: %d. \nJá o perímetro é %d", area, perimetro);
		
		outroTeclado.close();
	}
}
