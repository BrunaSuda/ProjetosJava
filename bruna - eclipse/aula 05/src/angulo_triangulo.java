import java.util.Scanner;

public class angulo_triangulo {
	public static void main (String[] args) {

// Declaração de Variáveis

		Scanner leitor = new Scanner(System.in);
				
int a = 0;
int b = 0;
int c = 0;
		
// Entrada de Dados

System.out.print("Digite o primeiro ângulo: ");
a = leitor.nextInt();

System.out.print("Digite o segundo ângulo: ");
b = leitor.nextInt();

System.out.print("Digite o terceiro ângulo: ");
c = leitor.nextInt();

leitor.close();

// Saida de Dados

if ((a + b + c) != 180) {
	System.out.print("Isso não é um triângulo");
} else if ((a == 90) || (b == 90) || (c == 90)) {
	System.out.print("Triângulo Retângulo");
} else if ((a < 90) && (b < 90) && (c < 90)) {
	System.out.print("Triângulo Acutângulo");
} else {
	System.out.print("Triângulo Obtusângulo");
}



	}
}
