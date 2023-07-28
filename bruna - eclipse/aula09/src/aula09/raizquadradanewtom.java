package aula09;

import java.util.Scanner;

public class raizquadradanewtom {
	public static void main(String[] args) {
		
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
		
	double numero = 0;
	double randonico = 0;
	
	// Entrada de Dados
	
	System.out.print("Digite um número: ");
	numero = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento de Dados
	
	randonico = (numero * Math.random());
	for (int i = 0 ; i < 30 ; i++); {
		System.out.println(randonico);
		
		randonico = ((randonico + (numero / randonico)) / 2);
	}
		
	// Saída de Dados
	
	System.out.println("Raiz quadrada calculada pelo Java:" + Math.sqrt(numero));
	System.out.println("Raiz quadrada calculada por Newton: " + randonico);	
	
	}

}
