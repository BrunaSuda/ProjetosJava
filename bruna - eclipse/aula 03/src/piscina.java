import java.util.Scanner;

public class piscina {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double comprimento = 0;
		double largura = 0;
		double profundidade = 0;
		double arestaAzulejo = 0;
		
		double AreaPis = 0;
		double AreaAzulejo = 0;
		double QTAzulejo = 0;
		
		// Entrada de Dados
		
		System.out.print("Digite o comprimento da piscina: ");
		comprimento = leitor.nextDouble();
		
		System.out.print("Digite a largura da piscina: ");
		largura = leitor.nextDouble();
		
		System.out.print("Digite a profundidade da piscina: ");
		profundidade = leitor.nextDouble();
		
		System.out.print("Digite o tamanho da aresta do azulejo: ");
		arestaAzulejo = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento de Dados
		
		AreaPis = ((2 * comprimento * profundidade) +
				  (2 * largura * profundidade) +
				  (comprimento * largura));
		
		AreaAzulejo = arestaAzulejo * arestaAzulejo;
		
		QTAzulejo = AreaPis / AreaAzulejo;
		
		// Saída de Dados
		
		System.out.print("A quantidade total de azulejos necessários é: " + QTAzulejo);


	}
}