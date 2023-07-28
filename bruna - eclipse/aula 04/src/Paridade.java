import java.util.Scanner;

public class Paridade {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		// Entrada de Dados
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// Processamento de Dados
		
		if ((numero < 0) && ((numero % 2) == 0)) {
			System.out.print("Número par negativo");
		} else if ((numero > 0) && (numero % 2) == 0) {
			System.out.print("Número par positivo"); 
		} else if ((numero < 0) && (numero % 2) != 0) {
			System.out.print("Número ímpar negativo"); 
		} else if ((numero > 0) && (numero % 2) != 0) {
			System.out.print("Número ímpar positivo"); 
		} else {
			System.out.print("Número é zero");
		}
	
	
	
	
	
	}
}
