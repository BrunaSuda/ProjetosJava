import java.util.Scanner;

public class votos_eleicao {
	public static void main(String[] args) {
	
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double VotoA = 0;
		double VotoB = 0;
		double VotoC = 0;
		double VotoBranco = 0;
		double VotoNulo = 0;
		
		double TotalV = 0;
		double TotalVV = 0;
		
		double PorcentagemA = 0;
		double PorcentagemB = 0;
		double PorcentagemC = 0;
		double PorcentagemBranco = 0;
		double PorcentagemNulo = 0;
		double PorcentagemVV = 0;		
		
		// Entrada de Dados
		
		System.out.print("Digite a quantidade de votos do candidato A: ");
		VotoA = leitor.nextDouble();
		
		System.out.print("Digite a quantidade de votos do candidato B: ");
		VotoB = leitor.nextDouble();
		
		System.out.print("Digite a quantidade de votos do candidato C: ");
		VotoC = leitor.nextDouble();
		
		System.out.print("Digite a quantidade de votos em Branco: ");
		VotoBranco = leitor.nextDouble();
		
		System.out.print("Digite a quantidade de votos Nulos: ");
		VotoNulo = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento de Dados
		
		TotalV = VotoA + VotoB + VotoC + VotoBranco + VotoNulo;
		
		TotalVV = VotoA + VotoB + VotoC;
		
		PorcentagemA = (VotoA / TotalVV) * 100;
		
		PorcentagemB = (VotoB / TotalVV) * 100;
		
		PorcentagemC = (VotoC / TotalVV) * 100;
		
		PorcentagemBranco = (VotoBranco / TotalV) * 100;
		
		PorcentagemNulo = (VotoNulo / TotalV) * 100;
		
		PorcentagemVV = (TotalVV / TotalV) * 100;
		
		// Saída de Dados
				
		System.out.println("A Porcentagem de Votos do Candidato A é: " + PorcentagemA);
		
		System.out.println("A Porcentagem de Votos do Candidato B é: " + PorcentagemB);
		
		System.out.println("A Porcentagem de Votos do Candidato C é: " + PorcentagemC);
		
		System.out.println("A Porcentagem de Votos em Branco é: " + PorcentagemBranco);
		
		System.out.println("A Porcentagem de Votos Nulos é: " + PorcentagemNulo);

		System.out.println("A Porcentagem de Votos Válidos é: " + PorcentagemVV);


	}
}