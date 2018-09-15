package br.com.cursojava.aula001;

public class MinutosDias {
	public static void main(String[] args) {
		int minutos = 60;
		int horas = 24;
		int dias = 90;
		int resultadoMinutos = (minutos * horas) * dias;
		
		System.out.println("A quantidade de minutos em 90 dias é: " + resultadoMinutos);
		System.out.printf("%d * %d * %d = são %d minutos em 90 dias", minutos, horas, dias, minutos * horas * dias );
	}
}
