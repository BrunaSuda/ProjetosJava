package aula09;

import java.util.Scanner;

public class lancamentoBalistico {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double velocidade = 0;
		double angulo = 0;
		
		double tempo = 0;
		double distanciafinal = 0;
		double distanciatempoatempo = 0;
		
		// Entrada de Dados
		System.out.print("Digite a velocidade do projetil: ");
		velocidade = leitor.nextDouble();
		
		System.out.print("Digite o ângulo: ");
		angulo = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento de Dados
		angulo = (Math.PI * angulo) / 180;
		tempo = (2 * velocidade * Math.sin(angulo)) / 9.8;
		distanciafinal = (Math.pow(velocidade, 2)) * (Math.sin(2 * angulo)) / 9.8;
		
		// Saída de Dados
		for (int i = 0 ; i < tempo ; i++) {
			distanciatempoatempo = (velocidade * Math.cos(angulo) * i);
			System.out.println(i + "s: " + distanciatempoatempo);
		}
		System.out.println("Distância final: " + distanciafinal);
		System.out.println("Tempo total: " + tempo);		
		
	}

}
