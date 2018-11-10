package br.com.coursojava;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		//adicionar elementos ao final da lista
		
		nomes.add("João");
		nomes.add("Maria");
		System.out.println(nomes);
		//retorna a quantidade de elementos da lista [lista.size()].
		System.out.println(nomes.size());
		//adicionar elementos no início [lista.add(posicao, elemento)].
		nomes.add(0, "José");
		nomes.add(0,"Ana");
		System.out.println(nomes);
		System.out.println(nomes.size());
		nomes.add("Frederico");
		System.out.println(nomes);
		//trocar o elemento [lista.set(indice, elemento)].
		nomes.set(nomes.size() - 1, "Tibúrcio");
		System.out.println(nomes);
		//buscar um elemento específico na lista [lista.get(indice)]
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println(nomes.get(3));
		System.out.println(nomes.get(4));
		//verificar o índice de um elemento [lista.indeOf(elemento)]
		System.out.println(nomes.indexOf("Tibúrcio"));
		System.out.println(nomes.indexOf("Marília"));
		//Verificar se um elemento está contido na lista [lista.contais(elemento)]
		System.out.println(nomes.contains("João"));
		System.out.println(nomes.contains("Bartolomeu"));
		//criar uma sublista
		List<String> subLista = nomes.subList(2, nomes.size());
		System.out.println(subLista);
		//remover um elemento da lista através do índice [lista.remove(index)]
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println(nomes);
		//remover um elemento da lista através da referência[lista.remove(elemento)]
		nomes.remove("Maria");
		System.out.println(nomes);
	}
}
