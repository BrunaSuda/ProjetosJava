package aula13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fatorial_recursivo {
	// Declaração da Função
	static long calcularFatorial(long numero) {
		long retorno = 0;
		
		if (numero == 1) {
			retorno = 1;
		} else {
			retorno = (numero * calcularFatorial(numero - 1));
		}
		
		return retorno;				
	}
	
	static long lerNumeroDoTeclado() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		long retorno = 0;
		
		try {
			System.out.print("Digite um número: ");
			retorno = Long.parseLong(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		return retorno;
	}
		
		public static void main(String[] args) {
			// Declaração de variáveis
			long numero = 0;
			long resultado = 0;
			
			// Entrada de Dados
			numero = lerNumeroDoTeclado();
			
			// Processameto
			resultado = calcularFatorial(numero);
			
			// Saída de Dados
			System.out.println(numero + "! = " + resultado);
						
		}	
	}	

