import java.util.Scanner;

public class peso_medio_populacao {
	public static void main (String[] args) {
		
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double somaDosPesos = 0;
	int temMaisGente = 0;
	int qtdDePessoas = 0;
	double media = 0;
		
	// Entrada 
	
    do {
    	System.out.print("Digite o peso da pessoa: ");
    	somaDosPesos += leitor.nextDouble();
    	
    	qtdDePessoas++;
    	
    	System.out.print("Digite <1> para mais pessoas ou <2> para sair: ");
    	temMaisGente = leitor.nextInt();
    } while (temMaisGente == 1);
    
    leitor.close();
	
    // Processamento 
	
    media = (somaDosPesos / qtdDePessoas);
    
    // Saída
    
    System.out.print(qtdDePessoas + " participaram da pesquisa!");
    System.out.print(" A média de peso da população é " + media);
    
	}
}