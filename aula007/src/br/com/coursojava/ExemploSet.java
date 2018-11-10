package br.com.coursojava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		
		//adicionar elementos;
		nomes.add("Maria");
		nomes.add("Ana");
		System.out.println("1 "+nomes);
		
		//não são permitidos elementos duplicados
		boolean adicionado = nomes.add("Ana");
		System.out.println("2 "+adicionado);
		System.out.println("3 "+nomes);
		
		//Verificar a quantidadde de elementos
		System.out.println("4 "+" - "+nomes.size());
		
		//Verifica se o conjunto tem um elemento
		System.out.println("5 "+nomes.contains("Ana"));
		System.out.println("6 "+nomes.contains("Beatriz"));
		
		//verifica se o conjunto está vazio
		System.out.println("7 "+nomes.isEmpty());
		
		//itera sobre o conjunto
		for(String atual : nomes){
			System.out.println("8 "+atual);
		}
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()){
			System.out.println("9 "+iterator.next());
		}
		//remover um elemento do conjunto
		System.out.println("10 "+nomes);
		nomes.remove("Maria");
		System.out.println("11 "+nomes);
	}
}
