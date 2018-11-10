package br.com.coursojava;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

	List<Produto> produtos = new ArrayList<>();
	int quantidade = 0;

	public void criarProduto(String nome, String descricao, double preco) {
		
		if(produtos.size() >= quantidade){
			Produto novoProduto = new Produto();
			novoProduto.setNome(nome);
			novoProduto.setDescricao(descricao);
			novoProduto.setPreco(preco);
			produtos.add(novoProduto);
			quantidade++;
		}else{
			System.out.println("Limite ultrapassado.");
		}
			
	}

	public int contarProduto() {
		return produtos.size();
	}

	public Produto buscarProduto(int index) {
		if (index > -1 && index <= produtos.size()) {
			return produtos.get(index);
		}
		return null;
	}

}


