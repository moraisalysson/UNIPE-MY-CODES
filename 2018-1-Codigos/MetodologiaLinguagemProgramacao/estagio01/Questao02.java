package lista;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe um valor: ");
			valor = input.nextInt();
			
			if(valor % 2 == 0) {
				System.out.println("É par!");
			} else {
				System.out.println("É ímpar!");
			}
		}
		
		System.out.println("Fim.");
		
		input.close();
	}
}
