import java.util.Scanner;

public class tres_valores {
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	// Declaração de Variáveis
	
	double n1 = 0;
	double n2 = 0;
	double n3 = 0;
	
	double soma = 0;
	
	// Entrada de Dados
	
	System.out.print("Digite o primeiro número: ");	
	n1 = leitor.nextDouble();
	
	System.out.print("Digite o segundo número: ");
	n2 = leitor.nextDouble();
	
	System.out.print("Digite o terceiro número: ");
	n3 = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento de Dados
	
	if ((n1 > n2) && (n1 > n3)) {
	soma = (n2 + n3);
	System.out.print("A soma dos dois menores números é: " + soma);
	
	} else if ((n2 > n1) && (n2 > n3)) {
	soma = (n1 + n3);
	System.out.print("A soma dos dois menores números é: " + soma);
	
	} else { 
		soma = (n1 + n2);
		
	// Saída de Dados
	
	System.out.println("A soma dos dois menores é: " + soma);		
		
	
	}
	
	
}
}