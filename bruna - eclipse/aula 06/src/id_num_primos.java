import java.util.Scanner;
public class id_num_primos {
	public static void main (String[] args) {
		
		// Variaveis
		
		long numero = 1;
		long divisor = 0;
		long resto = 0;
		boolean primo = false;
		
		// Processamento
		while (true) {		
				divisor = 2;
				primo = true;
			do {
				resto = (numero % divisor);
				if (resto == 0) {
					primo = false;
					break;
				}
		
				divisor ++;
			} while (divisor < (numero/2));
			
			if (primo) {
				System.out.println(numero);
			}
			
			numero++;
		
		}
	}
}