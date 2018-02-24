package lista;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = "";
		float salario = 0.0f;
		float aumento = 0.2f;	
		
		for(int i = 4; i < 10; i++) {
			System.out.println("Informe o nome ('fim' para parar): ");
			nome = input.nextLine();
			
			if(nome.equals("fim")) {
				break;
			}
			
			System.out.println("Informe o salario: ");
			salario = Float.parseFloat(input.nextLine());
			
			if(salario < 500) {
				System.out.printf("Salario novo: %.2f", (salario + (salario * aumento)));
				System.out.println();
			} else {
				System.out.println("Não tem direito ao aumento.");
				System.out.println();
			}
		}
		
		System.out.println("fim");
		
		input.close();
	}
}
