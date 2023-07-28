import java.util.Scanner;

public class notas {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double media = 0;
		
		// Entrada de dados
		
		System.out.print("Digite a nota da prova 1: ");
		p1 = leitor.nextDouble();
		
		System.out.print("Digite a note da prova 2: ");
		p2 = leitor.nextDouble();
		
		System.out.print("Digite a note da prova 3: ");
		p3 = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento de Dados
		
		media = (p1 + p2 + p3) / 3;
	
		// Saída de Dados
		
		System.out.print("A média das 3 notas é: " + media);
		
		
}
}