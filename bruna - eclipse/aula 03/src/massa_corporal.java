import java.util.Scanner;

public class massa_corporal {
	public static void main(String[] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double peso = 0;
	double altura = 0;
	double imc = 0;
	
	// Entrada de Dados
	
	System.out.print("Digite o peso: ");
	peso = leitor.nextDouble();
	
	System.out.print("Digite a altura: ");
	altura = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento de Dados
	
	imc = peso / (Math.pow(altura, 2));
	
	// Saída de Dados
	
	System.out.print("O IMC é: " + imc);
	

}
}