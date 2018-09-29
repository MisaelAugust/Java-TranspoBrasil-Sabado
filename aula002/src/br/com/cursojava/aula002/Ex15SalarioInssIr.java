package br.com.cursojava.aula002;

import java.util.Scanner;

public class Ex15SalarioInssIr {

	public static void main(String[] args) {
		Scanner tecladoEx15 = new Scanner(System.in);
		
		double salario = 0;
		int inss = 11;
		
		System.out.println("Digite seu sal�rio: ");
		salario = Double.parseDouble(tecladoEx15.nextLine());
		
		double descontoInss = (salario * inss) / 100;
		double salarioComDescontoInss = salario - descontoInss;
		
		if(salarioComDescontoInss >= 1800 && salarioComDescontoInss <= 2400){
			double impostoRenda = 7.5;
			double impostoRendaSalario = (salarioComDescontoInss * impostoRenda) / 100;
			double salarioComImpostoDeduzido = salarioComDescontoInss - impostoRendaSalario;
			
			System.out.printf("Seu sal�rio atual �: %.2f, com desconto INSS fica: %.2f, seu imposto de renda ser�: %.2f, "
					+ "ent�o ir� sobrar para voc�: %.2f",salario,  salarioComDescontoInss, impostoRendaSalario, salarioComImpostoDeduzido);
		}else if(salarioComDescontoInss >= 2400 && salarioComDescontoInss <= 3600){
			double impostoRenda = 24;
			double impostoRendaSalario = (salarioComDescontoInss * impostoRenda) / 100;
			double salarioComImpostoDeduzido = salarioComDescontoInss - impostoRendaSalario;
			
			System.out.printf("Seu sal�rio atual �: %.2f, com desconto INSS fica: %.2f, seu imposto de renda ser�: %.2f, "
					+ "ent�o ir� sobrar para voc�: %.2f",salario, salarioComDescontoInss, impostoRendaSalario, salarioComImpostoDeduzido);
		}else if(salarioComDescontoInss> 3600){
			double impostoRenda = 32;
			double impostoRendaSalario = (salarioComDescontoInss * impostoRenda) / 100;
			double salarioComImpostoDeduzido = salarioComDescontoInss - impostoRendaSalario;
			
			System.out.printf("Seu sal�rio atual �: %.2f, com desconto INSS fica: %.2f, seu imposto de renda ser�: %.2f, "
					+ "ent�o ir� sobrar para voc�: %.2f",salario, salarioComDescontoInss, impostoRendaSalario, salarioComImpostoDeduzido);
		}else{
			System.out.println(salario);
		}
	
		tecladoEx15.close();
	}
}
