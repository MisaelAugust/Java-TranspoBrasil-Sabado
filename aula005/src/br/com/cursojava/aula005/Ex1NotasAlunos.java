package br.com.cursojava.aula005;

/*1) Crie um programa que solicite 3 notas de 5 alunos e em seguida apresente as notas cadastradas. As notas dos alunos devem ser impressas agrupadas linha a linha. 
(Cada aluno deve ter todas as notas apresentadas na mesma linha e deve possuir uma linha para cada aluno) Armazene as notas em uma matriz.
*/

import java.util.Scanner;

public class Ex1NotasAlunos {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[] nomeAluno = new String[5];
		int[][] notas = new int[2][3];
			
		try{
			for (int linha = 0; linha < notas.length; linha++) {
				System.out.println("Digite seu nome: ");
				nomeAluno[linha] = teclado.nextLine();
				for (int coluna = 0; coluna < notas[linha].length; coluna++) {
					
					System.out.println("Digite a " + (coluna + 1)+ "° nota" + " do " + (linha+1) + "° aluno");
					notas[linha][coluna] = Integer.parseInt(teclado.nextLine());
					}
				}
			}catch (Exception erro) {
				System.out.println(erro);
			}
			
		for (int aluno = 0; aluno < notas.length; aluno++){
			System.out.print("As notas do aluno(a) "+ nomeAluno[aluno] + " são: ");
			for (int nota = 0; nota < notas[aluno].length; nota++) {
				
				System.out.print(notas[aluno][nota] + ", ");
			}
			
			System.out.println(" ");
		} 
		teclado.close();
	}
}
