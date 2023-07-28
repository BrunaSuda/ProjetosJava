import java.util.Scanner;

public class aumento_salario {
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	// Declaração de Variáveis
	
	int tipo_funcionario = 0;
	double salario = 0;
	double aumento = 0;
	
	// Entrada de Dados
	
	System.out.print("Digite o seu nível de 1 a 3: ");
	tipo_funcionario = leitor.nextInt();
	
	System.out.print("Digite o valor do seu salário: ");
	salario = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento de Dados
	
	switch (tipo_funcionario) {
	case 1:
		aumento = (salario * 0.1);
	break;
	case 2:
		aumento = (salario * 0.2);
	break;
	case 3:
		aumento = (salario * 0.5);
	break; 
	}
	
	salario += aumento;
	
	
	// Saída de Dados
	
	System.out.print("O salário com aumento é: " + new DecimalFormat("#.00").format(salario));
	
	
	}
}
