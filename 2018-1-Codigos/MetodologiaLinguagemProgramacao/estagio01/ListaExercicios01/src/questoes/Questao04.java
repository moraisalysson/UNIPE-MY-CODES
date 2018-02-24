package questoes;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Questao04Funcionario [] funcionarios = new Questao04Funcionario[5];
		String nome_verificador = "";
		float percentual_aumento = 0.2f;
		int index = 0;
		int quantidade_funcionarios = 3;
		
		while(index < quantidade_funcionarios) {
			funcionarios[index] = new Questao04Funcionario();
			
			System.out.printf("Informe o nome do %dº funcionario ou 'fim' para parar: ", index + 1);
			nome_verificador = input.nextLine();
			
			if(nome_verificador.equals("fim")) {
				System.out.printf("%nEncerrado pelo usuário.%n");
				break;
			}
			
			funcionarios[index].setNome(nome_verificador);
			
			System.out.printf("Informe o salario do(a) %s: R$ ", funcionarios[index].getNome());
			funcionarios[index].setSalario( Float.parseFloat(input.nextLine()) ); //recebe como String e converte para Float. Evita problema c/ buffer
			
			if(funcionarios[index].getSalario() < 500) {
				funcionarios[index].setSalario(funcionarios[index].getSalario() + (funcionarios[index].getSalario() * percentual_aumento));
				
				System.out.printf("%n# Novo salário do(a) %s: R$ %.2f #%n%n", funcionarios[index].getNome(), funcionarios[index].getSalario());
			} else {
				System.out.printf("%n-> %s não tem direito ao aumento. <-%n%n", funcionarios[index].getNome());
			}
			
			++index;
		}
		
		index = 0;
		
		System.out.println("################ RELATÓRIO ###############");
		while(index < quantidade_funcionarios) {
			funcionarios[index].relatorioFuncionario(index);
			++index;
		}
		
		System.out.printf("%nFim da execução.%n");
		
		input.close();
	}	
	
}