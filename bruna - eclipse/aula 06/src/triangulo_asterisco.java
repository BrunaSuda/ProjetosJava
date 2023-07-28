import java.util.Scanner;
public class triangulo_asterisco {
	public static void main (String[] args) {
		
		// Variaveis
		Scanner leitor = new Scanner(System.in);
		int qtd = 0;
		
		// Entrada de Dados
		
		System.out.print("Digite a quantidade: ");
		qtd = leitor.nextInt();
		
		leitor.close();
		
		// Saída de Dados
		
		for (int i = 0 ; i < qtd ; i++) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("*");	
		}	
		System.out.println();
		
		}		
	}
}