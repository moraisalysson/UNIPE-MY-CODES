package lista;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float salario = 0, percentual_aumento = 0;
		
		System.out.print("Informe seu salario: ");
		salario = input.nextFloat();
		
		System.out.print("Informe o percentual de aumento (%): ");
		percentual_aumento = input.nextFloat();
		
		salario = salario * (1.0f + (percentual_aumento / 100.00f));
		
		System.out.println("Novo salario: " + salario);
		
		input.close();
	}
}
