package aula11;

import java.util.Scanner;

public class quadrado_magico {
	// Constantes da Classe
	private static final int TAMANHO = 3;
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[][] quadrado = new int[TAMANHO][TAMANHO];
		
		int soma = 0;
		int temp = 0;
		
		boolean forQuadrado = false;
		
		// Entrada de Dados
		for (int i = 0 ; i < quadrado.length ; i++) {
			for (int j = 0 ; j <quadrado[i].length ; j++) {
				System.out.print("Quadrado[" + i + ", " + j +"]: ");
				quadrado[i][j] = leitor.nextInt();
			}
		}
		leitor.close();
		
		// Processamento diagoal principal
		for (int i = 0 ; i < quadrado.length ; i++) {
			soma += quadrado[i][i];
		}
		forQuadrado = true;
		
		// Processamento diagonal invertida
		temp = 0;
		for (int i = 0 ; i < quadrado.length ; i++) {
			temp += quadrado[i][quadrado.length - i -1];
		}
		if (temp != soma) {
			forQuadrado = false;
		}
		
		// Processamento das linhas
		for (int i = 0 ; i < quadrado.length ; i ++) {
			temp = 0;
			for (int j = 0 ; j < quadrado[i].length ; j ++) {
				temp += quadrado[i][j];
			}
			if (temp != soma) {
				forQuadrado = false;
			}
		}
		// Processamento das colunas
		for (int i = 0 ; i < quadrado.length ; i ++) {
			temp = 0;
			for (int j = 0 ; j < quadrado[i].length ; j ++) {
				temp += quadrado[j][i];
			}
			if (temp != soma) {
				forQuadrado = false;	
			}
		}
		
		// Saída de Dados
		if (forQuadrado) {
			System.out.println("Parabéns é um quadrado mágico");
		} else {
			System.out.println("Não serve pra nada");
		}	
	}
}
