package aula09;
public class num_perfeito {
	public static void main(String[] args) {
	
	// Declaração de Variáveis
	
	long numero = 0;
	long somadiv = 0;
	
	// Processamento
	
	while (true) {
		for (int i = 1 ; i < numero ; i++) {
			if ((numero % i) == 0) {
				somadiv += i;
			}
		}
		
		if (numero == somadiv) {
			System.out.println("Achei um número perfeito: " + numero + "!");
		}
		
		
		numero++;
		somadiv = 0;		
		
		}
	}
}

