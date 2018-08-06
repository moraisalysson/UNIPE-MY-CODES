package questoes_lista;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int litros_gasolina = 0;
		int quantidade_refrigerantes = 2;
		float valor_total_gasolina = 0.0f;
		float valor_total_refri = 0.0f;
		float total_conta = 0.0f;
		
		System.out.print("Informe a quantidade litros de gasolina: ");
		litros_gasolina = input.nextInt();
		
		valor_total_gasolina = (float) (litros_gasolina * 2.50);
		
		valor_total_refri = (float) (quantidade_refrigerantes * 3.00);
		
		total_conta = valor_total_gasolina + valor_total_refri;
		
		System.out.printf("%n### Detalhamento da conta ###%n");
		System.out.printf("+ Gasolina: %d litros * R$ 2,50 = R$ %.2f%n", litros_gasolina, valor_total_gasolina);
		System.out.printf("+ Refrigerante: %d und * R$ 3,00 = R$ %.2f%n", quantidade_refrigerantes, valor_total_refri);
		System.out.printf("= Total da conta: R$ %.2f%n", total_conta);
		
		input.close();
	}
}
