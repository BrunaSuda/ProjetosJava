import java.util.Scanner;

public class validacao_lote_cheque {
	public static void main(String[]args) {
		
		
		// Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int qtdCheques = 0;
		double valorTotal = 0;
		
		int chequesContados = 0;
		double valorContado = 0;
		
		
		// Entrada de dados
		
		
		qtdCheques = leitor.nextInt();
		
		System.out.print("Digite a quantidade de cheques: ");
		qtdCheques = leitor.nextInt();
		
		System.out.print("Digite o valor total: ");
		valorTotal = leitor.nextDouble();
		
		do {
			chequesContados++;	
			
			System.out.print("Digite o valor do cheque " + chequesContados + ":");
			valorContado += leitor.nextDouble();
			
			System.out.print("Digite <1> se tem mais cheques no lote: ");			
		} while (leitor.nextInt() == 1);
		
		leitor.close();
		
		// Saída de dados
		
		if ((qtdCheques == chequesContados) && (valorTotal == valorContado)) {
			System.out.print("O lote batu");
		} else {
			System.out.print("ERRO!");
		}
		
	
		
	}
}
