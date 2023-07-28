package aula09;

public class fibonacci {
	public static void main(String[] args) {

	// Declaração de Variáveis
	
	long atual = 0;
	long ultimo = 1;
	long penultimo = 0;
	
	// Processamento de Dados
	
	while(atual < 100000000) {
		atual = (ultimo + penultimo);
		System.out.print(atual);
		
		penultimo = ultimo;
		ultimo = atual;
		
	}
		
		
		
		
		
		
	}

}
