package aula01;

public class TrocaValorValoriavel {
	public static void main (String[] args) {
		// Declaração de variáveis
		int a = 0;
		int b = 0;
		int temp = 0;
		
		// Entrada de dados
		a = 5;
		b = 7;
		
		// Processamento
		temp = a;
		a = b;
		b = temp;
		
		// Saida de dados
		System.out.println(a);
		System.out.println(b);
		
	}
}