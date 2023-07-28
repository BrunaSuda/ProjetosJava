import java.util.Scanner;

public class operacoes_bancarias {
	public static void main (String[] args) {
		
	// Declaração de Variáveis
		
	Scanner leitor = new Scanner(System.in);
	
	double saldoin = 0;
	int operacao = 0;
	double valor = 0;
	double saldofin = 0;
	
	// Entrada de Dados
	
	System.out.print("Digite o saldo inicial: ");
	saldoin = leitor.nextDouble();
	
	System.out.print("Digite (1) para Saque ou (2) para Depósito: ");
	operacao = leitor.nextInt();
	
	System.out.print("Digite o valor: ");
	valor = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento de Dados
	
	if (operacao == 1)  {
	saldofin = saldoin - valor;
	} else if (operacao == 2){
		saldofin = saldoin + valor;
	} else {
	System.out.print("Operaçao Inválida!");
	}
	
	// Saída de Dados
	
	System.out.print("O Saldo final da conta é: " + saldofin);

	
	}
}
