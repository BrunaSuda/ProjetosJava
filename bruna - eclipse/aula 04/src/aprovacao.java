import java.util.Scanner;

public class aprovacao {
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		
	// Declaração de Varíaveis
		
		double P1 = 0;
		double P2 = 0;
		double P3 = 0;
		
		double media = 0;
		double substitutiva = 0;
		
	// Entrada de Dados
		
		System.out.print("Digite a nota da P1: ");
		P1 = leitor.nextDouble();
		
		System.out.print("Digite a nota da P2: ");
		P2 = leitor.nextDouble();
		
		System.out.print("Digite a nota da P3: ");
		P3 = leitor.nextDouble();
		
	// Processamento de dados
		
		media = ((P1 + P2 + P3) / 3);
	
		if (media >= 5) {
			System.out.println("Parabéns você foi aprovado!");	
		} else {
			System.out.print("Digite o nota da Substitutiva: ");
			substitutiva = leitor.nextDouble();			
		}
			if (substitutiva >= 5) {
				System.out.println("Parabéns você foi aprovado!");
			} else {
					System.out.println("Você foi reprovado!");
				}
	
			
		leitor.close();
		
		
	}
}
