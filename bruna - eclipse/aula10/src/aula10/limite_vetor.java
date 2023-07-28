package aula10;

import java.util.Scanner;

public class limite_vetor {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int[6];
		int[] vetorLimite = new int[6];
		
		int limite = 0;
		int qtdElementosVetorLimite = 0;
		
		// Entrada de Dados
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetorOriginal[i] = leitor.nextInt();
		}
		
		System.out.print("Digite o limite: ");
		limite = leitor.nextInt();
		
		leitor.close();
		
		// Processamento de Dados
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			if (vetorOriginal[i] >= limite){
				vetorLimite[qtdElementosVetorLimite] = vetorOriginal[i];
				qtdElementosVetorLimite++;
			}
		}
		
		// Saída de Dados
		for (int i = 0 ; i < qtdElementosVetorLimite ; i++ ) {
			System.out.println(i +": " + vetorLimite[i]);
		}
	}

}
