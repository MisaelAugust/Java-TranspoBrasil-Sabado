package br.com.coursojava;

import java.util.Scanner;

public class AppProduto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroProduto cadastro = new CadastroProduto();
		cadastro.mostraMenu(teclado);
		teclado.close();
	}
}