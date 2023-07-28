import java.util.Scanner;

public class bascara {
	public static void main(String[] args) {
	
// Declaração de Variáveis
	
Scanner leitor = new Scanner(System.in);

double a = 0;
double b = 0;
double c = 0;
double delta = 0;
double x1 = 0;
double x2 = 0;

// Entrada de Dados

System.out.print("Digite o valor de A: ");
a = leitor.nextDouble();

System.out.print("Digite o valor de B: ");
b = leitor.nextDouble();

System.out.print("Digite o valor de C: ");
c = leitor.nextDouble();

leitor.close();

// Processamento de Dados

delta = (b * b) - (4 * a * c);

if (delta >= 0) {
	x1 = ((-b + Math.sqrt(delta)) / 2 * a);
	x2 = ((-b - Math.sqrt(delta)) / 2 * a);
}
 
// Saída de Dados

System.out.println(a + "x^2 +" + b + "x +" + c + " = 0");
if (delta < 0 ) {
	System.out.println("Não há raízes reais para a equação");
} else if (delta == 0) {
	System.out.println("Há apenas uma única raíz real para a equação" + x1);
} else {
	System.out.print("Há duas raízes reais para a equação" + x1 + "," +x2);
}

	
	}	

}
