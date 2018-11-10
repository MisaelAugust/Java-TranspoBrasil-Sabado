package br.com.coursojava;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		Map<String, Pessoa> mapa = new HashMap<>();
		
		//Adicionar elementos;
		mapa.put("123456", new Pessoa("Maria"));
		mapa.put("789012", new Pessoa("João"));
		mapa.put("teste1", new Pessoa("Mariaana"));
		System.out.println("1 - "+ mapa);
		
		//quantidade de elementos
		System.out.println("2 - "+mapa.size());
		
		//troca de valores
		mapa.put("troca", new Pessoa("Pessoa1"));
		mapa.put("Troca", new Pessoa("Tibúrcio"));
		System.out.println("3 - "+mapa);
		
		//verifica se existe uma chave		
		System.out.println("4 - "+mapa.containsKey("123456"));
		System.out.println("5 - "+mapa.containsKey("nãoexiste"));
		
		//verifica se existe um valor específico
		System.out.println("6 - "+mapa.containsValue(new Pessoa("Maria")));
		System.out.println("7 - "+mapa.containsValue(new Pessoa("Joana")));
		
		//busca um elemento atraves da chave		
		System.out.println("8 - "+mapa.get("123456"));
		System.out.println("9 - "+mapa.get("Troca1000"));
		
		//retorna o conjunto de keys
		System.out.println("10 - "+mapa.keySet());
		
		//retorna o conjunto dos valores
		System.out.println("11 - "+mapa.values());
		
		//percorre todos os elementos através de um entryset
		for (Map.Entry<String, Pessoa> entry : mapa.entrySet()) {
			System.out.println("12 - "+entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println("13 - "+mapa.entrySet());
		
		//reomver um elemento
		mapa.remove("123456");
		System.out.println("14 - "+mapa);
		
		//remover todos os itens
		mapa.clear();
		System.out.println("15 - "+mapa);
	}
}
