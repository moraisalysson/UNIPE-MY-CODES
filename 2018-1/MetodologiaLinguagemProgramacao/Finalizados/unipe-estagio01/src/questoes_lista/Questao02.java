package questoes_lista;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe o %dº valor: ", i + 1);
			valor = input.nextInt();
			
			if(valor % 2 == 0) {
				System.out.println("Par!");
			} else {
				System.out.println("Ímpar!");
			}
		}
		
		System.out.printf("%nFim da execução.%n");
		
		input.close();
	}
}

