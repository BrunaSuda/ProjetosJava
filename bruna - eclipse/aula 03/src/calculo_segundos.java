import java.util.Scanner;

public class calculo_segundos {
	public static void main(String[] args) {
	
		// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int hora = 0;
	int minuto = 0;
	int segundo = 0;
	
	int totalSeg = 0;
	
		// Entrada de Dados
	
	System.out.print("Digite a quantidade de horas: ");
	hora = leitor.nextInt();
	
	System.out.print("Digite a quantidade de minutos: ");
	minuto = leitor.nextInt();
	
	System.out.print("Digite a quantidade de segundos: ");
	segundo = leitor.nextInt();
	
	leitor.close();
	
		// Processamento de Dados5
	
	totalSeg = ((hora * 3600) + (minuto * 60) + segundo);
			
		// Saída de Dados
			
	System.out.print("A quantidade total de segundos é: " + totalSeg);
	

}
}