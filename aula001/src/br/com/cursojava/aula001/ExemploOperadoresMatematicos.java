package br.com.cursojava.aula001;

public class ExemploOperadoresMatematicos {
	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 2;
		int numero3 = 3;
		double numero4 = 3;
		
		System.out.printf("%d + %d = %d \n", numero1, numero2, numero1 + numero2);
		System.out.printf("%d - %d = %d \n", numero1, numero2, numero1 - numero2);
		System.out.printf("%d * %d = %d \n", numero1, numero3, numero1 * numero3);
		System.out.printf("%d / %d = %d \n", numero1, numero3, numero1 / numero3);
		System.out.printf("%d / %f = %f \n", numero1, numero4, numero1 / numero4);
		System.out.printf("%d %% %d = %d \n", numero1, numero3, numero1 % numero3);
		System.out.printf("++ %d = %d \n", numero1, ++numero1);
		System.out.printf("-- %d = %d \n \n", numero1, --numero1);
		
		//printf � a impress�o formatada, o estilo acima de mascara somente pode ser utilizado printf;
		// %d = % � a mascara � o formatador, d � para numeros inteiros em formato deciaml acima o primero %d ir� substituir pela primeira 
		//variavel, segundo pela segunta and so on;
		// %f = % � a mascara e f � de float para numeros do tipo real, double e float. 
		//Abaixo um exemplo de como seria concatenando
		
		System.out.printf("%d + %d = %d \n", numero1, numero2, numero1 + numero2);
		System.out.println(numero1 + " + " + numero2 + " = " + numero1 + numero2);
	}
}
