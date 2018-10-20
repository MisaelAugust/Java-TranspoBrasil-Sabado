package br.com.cursojava.aula005;

import java.util.Scanner;

/*2) Crie um programa que solicite 3 notas de 5 alunos e em seguida calcule a média das notas de cada aluno. 
O programa deve apresentar as notas dos alunos seguida da média do aluno. 
Utilize uma matriz para armazenar as notas dos alunos e um array para armazenar as médias.
*/

public class Ex2MediaAlunos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeAlunos = 2;
		int quantidadeNotas = 3;
		String[] nomeAluno = new String[5];
		double[][] notas = new double[quantidadeAlunos][quantidadeNotas];
		double[] somaDasNotas = new double[quantidadeNotas];
		
		for (int linha = 0; linha < notas.length; linha++) {
			System.out.println("Digite seu nome: ");
			nomeAluno[linha] = teclado.nextLine();
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				
				System.out.println("Digite a " + (coluna + 1)+ "° nota" + " do aluno " + nomeAluno[linha].toUpperCase());
				notas[linha][coluna] = Double.parseDouble(teclado.nextLine());

				somaDasNotas[linha] += notas[linha][coluna];
			}

		}
		
		for (int aluno = 0; aluno < notas.length; aluno++){
			System.out.print("As notas do aluno(a) "+ nomeAluno[aluno].toUpperCase() + " são: ");
	
			for (int nota = 0; nota < notas[aluno].length; nota++) {
				
				System.out.print(notas[aluno][nota] + ", ");
				
			}
			System.out.println("");
			System.out.println("A soma das notas é: " + somaDasNotas[aluno]);
			System.out.println("A média do aluno é = " + somaDasNotas[aluno] / notas.length);
			System.out.println("");
		} 
		teclado.close();
	}
}
