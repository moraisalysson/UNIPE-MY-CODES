package questoes_lista;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float salario_funcionario = 0.0f;
		float valor_prestacao = 0.0f;
		
		System.out.print("Informe o seu salário: R$ ");
		salario_funcionario = input.nextFloat();
		
		System.out.print("Informe o valor da prestacao: R$ ");
		valor_prestacao = input.nextFloat();
		
		if(valor_prestacao / salario_funcionario < 0.3) {
			System.out.println("Empréstimo concedio! :o)");
		} else {
			System.out.println("Empréstimo NÃO concedido ;o(");
		}
		
		System.out.printf("%nFim da execução%n");
		
		input.close();
	}
}
