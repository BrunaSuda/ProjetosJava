package aula10;

import java.util.Scanner;

public class inversao_valoes_vetor {
	public static void main(String[]args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int[10];
		int[] vetorInvertido = new int[10];
		
		// Entrada de Dados
		
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			System.out.print("Digite um número: ");
			vetorOriginal[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Processamento de Dados
		
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			vetorInvertido[vetorOriginal.length - i - 1] = vetorOriginal[i];
			
		}
		
		// Saída de Dados
		for (int i = 0 ; i < vetorInvertido.length ; i++) {
			System.out.println(i + ": " + vetorInvertido[i]);
		}
	}
}
