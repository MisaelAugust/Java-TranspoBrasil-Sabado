package br.com.cursojava.aula004;

public class TesteImportante {
	public static void main(String[] args) {
		
		String palavra = "Teste";
		String palavraInvertida = "";
		
		for(int tamanhoPalavra = palavra.length(); tamanhoPalavra > 0; tamanhoPalavra--){
			palavraInvertida = palavraInvertida + palavra.substring(tamanhoPalavra -1, tamanhoPalavra);
		}
		
		System.out.println(palavra);
		System.out.println(palavraInvertida);
		
		String palavraDigitada = "Teste";
		for(int indice = 0; palavraDigitada.length() > indice;indice++){
			System.out.println(palavraDigitada.substring(0, indice+1));
		}
		
		System.out.println("");
		
		String palavraDigitada2 = "Brasil";
		for(int indice = 0; palavraDigitada2.length() > indice;indice++){
			System.out.println(palavraDigitada2.substring(indice, palavraDigitada2.length()));
		}
	}
}
