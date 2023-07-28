package aula09;

import java.util.Scanner;

public class exponencialTaylor {
	public static void main(String[] args) {
		
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double expoente = 0;
	
	double exponenciacao = 0;
	double fatorial = 0;
	
	double resultado = 0;
	
	// Entrada de Dados
	System.out.print("Digite o expoente: ");
	expoente = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento de Dados
	resultado = 1;
	for (int i = 1 ; i < 50 ; i++) {
		// Cálculo da exponenciação
		exponenciacao = 1;
		for (int j = 0 ; j < i ; j ++ ) {
			exponenciacao *= expoente;
		}
		// Cálculo do fatorial
		fatorial = 1;	
		for (int j = i ; j > 0 ; j--) {
			fatorial *= j;
		}
		// Somatóio de Taylor
		resultado += (exponenciacao / fatorial);
	}
	
	// Saída de Dados
	System.out.println("Neperiano elevado a " + expoente + " pelo Java: " + Math.pow(Math.E, expoente));
	System.out.println("Neperiano elevado a " + expoente + " calculado por Taylor: " + resultado);
		
	}

}
