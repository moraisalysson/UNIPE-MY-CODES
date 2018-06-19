package questoes_lista;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome_paciente = "vazio";
		String sexo_paciente = "vazio";
		float peso_paciente = 0.0f;
		float altura_paciente = 0.0f;
		int idade_paciente = 0;
		int quantidade_pacientes = 0;
		float media_idade_homens = 0.0f;
		int soma_idade_homens = 0;
		int quantidade_homens = 0;
		int quantidade_mulheres_faixa = 0;
		int quantidade_faixa_idade = 0;
		int idade_paciente_mais_velho = 0;
		String nome_paciente_mais_velho = "vazio";
		float altura_menor_mulher = 3.0f;
		String nome_mulher_mais_baixa = "vazio";
		
		while( ! nome_paciente.equals("fim")) {
			System.out.print("Nome do paciente ou 'fim' para parar: ");
			nome_paciente = input.nextLine();
			
			if(nome_paciente.equals("fim")) {
				System.out.printf("%n-> Encerrado pelo usuário <-%n");
				break;
			} 
			else {
				System.out.print("Sexo do paciente (m ou f): ");
				sexo_paciente = input.nextLine();
				
				System.out.print("Peso do paciente (kg): ");
				peso_paciente = Float.parseFloat(input.nextLine()); 
				
				System.out.print("Altura do paciente (m): ");
				altura_paciente = Float.parseFloat(input.nextLine()); 
				
				System.out.print("Idade do paciente: ");
				idade_paciente = Integer.parseInt(input.nextLine()); 
				
				++quantidade_pacientes;
			}
			
			if(sexo_paciente.equals("m")) {
				++quantidade_homens;
				
				soma_idade_homens = soma_idade_homens + idade_paciente;
				
				media_idade_homens = soma_idade_homens / quantidade_homens;
				
			} else { //mulheres:
				
				if(altura_paciente < altura_menor_mulher) {
					altura_menor_mulher = altura_paciente;
					
					nome_mulher_mais_baixa = nome_paciente;
				}
				
				if(altura_paciente > 1.6 && altura_paciente < 1.7 && peso_paciente > 70.0) {
					++quantidade_mulheres_faixa;
				}
				
			}
			
			if(idade_paciente > 18 && idade_paciente < 25) {
				++quantidade_faixa_idade;
			}
			
			if(idade_paciente > idade_paciente_mais_velho) {
				idade_paciente_mais_velho = idade_paciente;
				
				nome_paciente_mais_velho = nome_paciente;
			
			}
			
			System.out.println();
		}
		
		System.out.printf("%n################# RELATÓRIO #################%n");
		System.out.printf("Quantidade de pacientes: %d%n", quantidade_pacientes);
		System.out.printf("Média de idade dos hombres: %.1f%n", media_idade_homens);
		System.out.printf("Quantidade de mulheres entre 1,60 e 1,70 de altura e mais de 70 kg: %d%n", quantidade_mulheres_faixa);
		System.out.printf("Quantidade de pessoas entre 18 e 25 anos de idade: %d%n", quantidade_faixa_idade);
		System.out.printf("Nome do paciente mais velho: %s%n", nome_paciente_mais_velho);
		System.out.printf("Nome da mulher mais baixa: %s%n", nome_mulher_mais_baixa);
				
		input.close();
	}	
}
