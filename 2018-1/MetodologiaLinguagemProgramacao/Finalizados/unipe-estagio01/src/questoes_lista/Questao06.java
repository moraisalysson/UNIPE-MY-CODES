package questoes_lista;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float salario_funcionario = 0.0f;
		float valor_prestacao = 0.0f;
		
		System.out.print("Informe o seu sal�rio: R$ ");
		salario_funcionario = input.nextFloat();
		
		System.out.print("Informe o valor da prestacao: R$ ");
		valor_prestacao = input.nextFloat();
		
		if(valor_prestacao / salario_funcionario < 0.3) {
			System.out.println("Empr�stimo concedio! :o)");
		} else {
			System.out.println("Empr�stimo N�O concedido ;o(");
		}
		
		System.out.printf("%nFim da execu��o%n");
		
		input.close();
	}
}
