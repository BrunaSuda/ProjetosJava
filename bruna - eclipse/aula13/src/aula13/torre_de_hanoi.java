package aula13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class torre_de_hanoi {
	// Declaração da Função
	static void mover(int numero, String torreDeOrigem, String torreDoMeio, String torreDeDestino) {
		
		if (numero > 0) {
			mover(numero - 1, torreDeOrigem, torreDeDestino, torreDoMeio);
			System.out.println(numero + " da " + torreDeOrigem + " para " + torreDeDestino);
			
			mover(numero - 1, torreDoMeio, torreDeOrigem, torreDeDestino);
		}
	}
	
	public static void main(String[] args) {
		// Declaração de Variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		int qtdDiscos = 0;
		
		// Entrada de Dados
		try {
			System.out.print("Informe a quantidade de discos: ");
			qtdDiscos = Integer.parseInt(leitor.readLine());
		} catch (Exception erro) {
			
		}
		
		// Processamento de Dadoas
		mover(qtdDiscos, "Origem" , "Meio", "Destino");
			
		}
	}
