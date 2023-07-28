import java.util.Scanner;

public class VolumeDaEsfera {
	public static void main(String[] args) {
		
		// Declaração de Variáeis
		Scanner leitor = new Scanner(System.in);
		
		double volume = 0;
		double raio = 0;
				
		// Entrada de Dados
		System.out.print("Digite o valor do Raio da Esfera: ");
		raio = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento de Dados
		volume = ( ((4 * Math.PI)) * (Math.pow(raio, 3)) / 3);
		
		// Saída de Dados
		System.out.print("O volume da esfera é: " + volume);
		
		
		
	}
}
