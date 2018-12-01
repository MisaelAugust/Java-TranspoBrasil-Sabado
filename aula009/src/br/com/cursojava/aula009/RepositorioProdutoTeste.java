package br.com.cursojava.aula009;

import java.util.List;

public class RepositorioProdutoTeste {
	public static void main(String[] args) {
		//testeInserirProduto();
		listarProdutos();
	}
	
	public static void testeInserirProduto(){
		Produto produto = new Produto(null, "Sapato", "pesado", 50);
		RepositorioProdutos repositorio = new RepositorioProdutos();
		
		repositorio.inserirProduto(produto);
		System.out.println(produto);
	}
	
	public static void listarProdutos(){
		RepositorioProdutos repositorio = new RepositorioProdutos();
		List<Produto> buscarTodos = repositorio.buscarProdutos();
		System.out.println("Lista de produtos.");
		for (Produto produtos : buscarTodos){
			System.out.println(produtos);
		}
	}
}
