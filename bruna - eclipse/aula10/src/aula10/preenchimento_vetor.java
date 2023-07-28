package aula10;

import java.util.Scanner;

public class preenchimento_vetor {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		// Entrada de Dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Saída de Dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("Índice: " + i + ", valor: " + vetor[i]);
		}		
		
	}

}
