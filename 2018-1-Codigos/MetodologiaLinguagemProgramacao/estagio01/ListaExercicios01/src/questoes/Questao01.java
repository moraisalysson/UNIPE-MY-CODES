package questoes;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float salario = 0, percentual_aumento = 0;
		
		System.out.print("Informe seu salario (R$): ");
		salario = input.nextFloat();
		
		System.out.print("Informe o percentual de aumento (%): ");
		percentual_aumento = input.nextFloat();
		
		salario = salario * (1.0f + (percentual_aumento / 100.00f));
		
		System.out.printf("Novo salario: R$ %.2%n", salario);
		
		System.out.printf("%nFim da execução.%n");
		
		input.close();
	}
}

