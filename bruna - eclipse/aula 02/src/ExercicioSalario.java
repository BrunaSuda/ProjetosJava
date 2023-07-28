import java.util.Scanner;

public class ExercicioSalario {
	public static void main (String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double salarioMinimo = 1302;
		double quantidadeDeSalariosMinimos = 0;
		
		// Entrada de Dadados
		
		System.out.print ("Digite o seu salário: ");
		salario = leitor.nextDouble();
		leitor.close();
		
		// Processamento de Dados
		
		quantidadeDeSalariosMinimos = (salario / salarioMinimo);
		
		// Saida de Dados
		System.out.print ("A quantidade de salários mínimos é: " + quantidadeDeSalariosMinimos );
		
		
	}
}
