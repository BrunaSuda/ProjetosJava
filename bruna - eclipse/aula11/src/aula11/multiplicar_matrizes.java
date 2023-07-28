package aula11;

import java.util.Scanner;

public class multiplicar_matrizes {
	// Constantes da Classe
	private static final int LINHA1 = 2;
	private static final int COLUNA1_LINHA2 = 3;
	private static final int COLUNA2 = 2;
	
	public static void main(String[] args) {
	
	// Declaração de Variáveis
	Scanner leitor =  new Scanner(System.in);
	
	int[][] matriz1 = new int[LINHA1][COLUNA1_LINHA2];
	int[][] matriz2 = new int[COLUNA1_LINHA2][COLUNA2];
	int[][] resultado = new int[LINHA1][COLUNA2];
	
	// Entrada de Dados
	for (int i = 0 ; i < matriz1.length ; i++) {
		for (int j = 0 ; j < matriz1[i].length ; j ++) {
			System.out.print("Matriz1[" + i + ", " + j + "]: ");
			matriz1[i][j] = leitor.nextInt();
		}
	}
	for (int i = 0 ; i < matriz2.length ; i++) {
		for (int j = 0 ; j < matriz2[i].length ; j ++) {
			System.out.print("Matriz2[" + i + ", " + j + "]: ");
			matriz2[i][j] = leitor.nextInt();
		}
	}
	
	// Processamento de Dados
	for (int i = 0 ; i < matriz1.length ; i++) {
		for (int j = 0 ; j < matriz2[0].length ; j++) {
			for (int k = 0 ; k < matriz2.length ; k++) {
				resultado[i][j] += matriz1[i][k] * matriz2[k][j];
			}
		}
	}
	
	// Saída de Dados
	for (int i = 0 ; i < matriz1.length ; i++) {
		for (int j = 0 ; j < matriz1[i].length ; j++) {
			System.out.print(matriz1[i][j]+ "\t");	
		}
		System.out.println();
	}
	for (int i = 0 ; i < matriz2.length ; i++) {
		for (int j = 0 ; j < matriz2[i].length ; j++) {
			System.out.print(matriz2[i][j]+ "\t");	
		}
		System.out.println();
	}
	for (int i = 0 ; i < resultado.length ; i++) {
		for (int j = 0 ; j < resultado[i].length ; j++) {
			System.out.print(resultado[i][j]+ "\t");	
		}
		System.out.println();
	}
	System.out.println();
	
	}
}
