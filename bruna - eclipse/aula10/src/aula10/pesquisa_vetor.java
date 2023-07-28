package aula10;

import java.util.Scanner;

public class pesquisa_vetor {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		int valorPesquisado = 0;
		int indiceEncontrado = -1;
		
		// Entrada de Dados
		
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite o número da posição " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		System.out.print("Digite um número a ser pesquisado: ");
		valorPesquisado = leitor.nextInt();
		
		leitor.close();
		
		// Processamento de Dados
		
		for (int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i] == valorPesquisado) {
				indiceEncontrado = i;
			}
		}
		
		// Saída de Dados
		
		if (indiceEncontrado == -1) {
			System.out.println("NÃO encontrei o valor!");
		}	 else {
			System.out.println("Encontrei o valor a posição " + indiceEncontrado);
		}
	}
}
