import java.util.Scanner;

public class ExercicioFahrenheit {
	public static void main (String[] args) {
		
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	double celcius = 0;
	double fahrenheit  = 0;
	
	// Entrada de Dados
	System.out.print("Digite a temperatura em Celcius: ");
	celcius = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento de Dados
	fahrenheit = ((celcius * 9) / 5 + 32);
	
	// Saída de Dados
	System.out.println("A conversão da temperatura Celcius em Fahrenheit é " + fahrenheit);
			
 }
}