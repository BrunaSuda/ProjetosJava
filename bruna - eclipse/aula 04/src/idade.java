import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int idade = 0;
		
		// Entrada de Dados
		
		System.out.print("Qual a sua idade?");
		idade = leitor.nextInt();
		
		leitor.close();
		
		// Saída de Dados
		
		if (idade < 18) {
			System.out.print("Você é menor de idade");
		} else {
			System.out.print("Você é maior de idade");
			}
		
		
		
		
		
	}
}
