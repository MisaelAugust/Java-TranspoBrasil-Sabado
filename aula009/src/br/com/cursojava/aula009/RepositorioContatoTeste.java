package br.com.cursojava.aula009;

import java.util.List;

public class RepositorioContatoTeste {
	public static void main(String[] args) {
		//testeInserir();
		testeListarTodos();
		//testeBuscarContato();
		//testeAtualizar();
		//testeRemover();
		 //testeContador();
	}
	
	private static void testeInserir(){
		Contato contato = new Contato(null,"Bagrinho","b@teste.com","33221100");
		RepositorioContato repositorio = new RepositorioContato();
		
		repositorio.inserir(contato);
		System.out.println(contato);
	}
	
	private static void testeListarTodos(){
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> buscarTodos = repositorio.buscarTodos();
		System.out.println("=============================");
		System.out.println("LISTAR TODOS");
		System.out.println("=============================");
		for(Contato contato : buscarTodos){
			
			System.out.println(contato);
		}
	}
	
	private static void testeBuscarContato(){
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println("=============================");
		System.out.println("LISTAR POR ID");
		System.out.println("=============================");
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarPorId(5000));
	}
	
	private static void testeAtualizar(){
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(1);
		
		contato.setNome("Bagrinho da Silva Brasil");
		repositorio.atualizar(contato);
		contato = repositorio.buscarPorId(1);
		System.out.println(contato);
	}
	
	private static void testeRemover(){
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println("=============================");
		System.out.println("REMOVER");
		System.out.println("=============================");
		repositorio.remover(1);
			System.out.println(repositorio.buscarPorId(1));
	}
	
	private static void testeContador(){
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println("=============================");
		System.out.println("TOTAL CONTATOS");
		System.out.println("=============================");
		System.out.println(repositorio.contar());
	}
}
