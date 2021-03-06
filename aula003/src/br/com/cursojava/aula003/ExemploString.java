package br.com.cursojava.aula003;

public class ExemploString {
	public static void main(String[] args) {
		String curso = "Curso Java TranspoBrasil S�bado";
		
		//Quantidade de caracteres
		
		System.out.printf("O texto '%s' possui %d caracteres \n", curso, curso.length());
		System.out.println(curso);
		
		String semEspaco = curso.replace(" ", "");
		
		//replace ir� pegar o valor antigo, ali " "(os espa�os), e altera por um novo ""(sem espa�o)
		
		System.out.printf("O texto '%s' possui %d caracteres \n", curso, semEspaco.length());
		System.out.println(curso.replace(" ", "").length());
		System.out.println(semEspaco);
		
		String semA = curso.replace("a", "b");
		
		System.out.println(semA);
		
		System.out.println(curso.contains("TranspoBrasil"));
		System.out.println(curso.startsWith("Curso"));
		System.out.println(curso.endsWith("sabado"));
		
		//indexOf � a posi��o inicial que a palavra come�a no texto
		
		System.out.println(curso.indexOf("TranspoBrasil"));
		System.out.println(curso.indexOf("a"));
		System.out.println(curso.indexOf("a", 10));
		System.out.println(curso.lastIndexOf("a"));
		System.out.println(curso.toUpperCase());
		System.out.println(curso.toLowerCase());
		
		// subString ir� buscar apenas o que � posterio ao index informado, ou o que est� dentro do index informado
		
		System.out.println(curso.substring(11));
		System.out.println(curso.substring(11, 18));
		
		String palavra = "s�bado";
		
		int indice = curso.toLowerCase().indexOf(palavra.toLowerCase());
		System.out.println(indice);
		
		//busca o caracter da posi��o informada
		
		System.out.println(curso.charAt(10));
		System.out.println(curso.charAt(11));
		System.out.println(curso.charAt(12));
		System.out.println(curso.charAt(13));
		
		System.out.println("================================");
		
		String user1 = "Jo�o";
		String user2 = "Jo�o";
		String user3 = new String("Jo�o");
		
		System.out.println(user1 == user2);
		System.out.println(user1 == user3);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
		
		//compara strings e ignora se � mai�sculo ou min�sculo
		
		System.out.println(user1.equalsIgnoreCase("JO�O"));
		System.out.println("jo�o".equalsIgnoreCase("JO�O"));
		
		System.out.println("===============================");
		
		String texto = "      oi pessoal     ";
		String registro = "contato;contato@teste.com;33221100";
		
		System.out.printf(">%s<, length = %d\n", texto, texto.length());
		System.out.printf(">%s<, length = %d\n", texto.trim(), texto.trim().length());
		
		//trim retira espa�os antes e depois das palavras;
		//split ele corta fora o que esta informado (no caso ";" ir� retirar todos os ; e pular linha com o que est� depois do ; (utiliza arrey))
		
		String[] valores = registro.split(";");
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);

	}
}
