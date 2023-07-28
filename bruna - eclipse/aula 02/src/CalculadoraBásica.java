import java.util.Scanner;

public class CalculadoraBásica {
	public static void main (String[] args) {
		
		// Declaração de Variáveis
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;	
		int subtracao = 0;
		int multiplicacao = 0;
		int divisao = 0;
		
		// Entrada de Dados
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento de Dados
		
		soma = (numero1 + numero2);
		subtracao = (numero1 - numero2);
		multiplicacao = (numero1 * numero2);
		divisao = (numero1 / numero2);
		
		// Saida de Dados
		System.out.println("A soma dos dois números é: " + soma);	
		System.out.println("A subtração dos dois números é: " + subtracao);
		System.out.println("A multiplicação dos dois números é " + multiplicacao);
		System.out.println("A divisão dos dois números é " + divisao);
		
	}
}