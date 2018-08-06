package models;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuFuncionarios {
	Scanner input = new Scanner(System.in);

	private void opcaoCadastrarVendedor(Vendedor vendedores[]) {
		System.out.printf("\n---- CADASTRO DE VENDEDOR ----\n");

		try {
			vendedores[Vendedor.getContador_id()] = new Vendedor();
			vendedores[Vendedor.getContador_id()].cadastrarDados();  //<- função que solicita os dados
			
			if(ManipuladorArquivo.salvaVendedor(vendedores[Vendedor.getContador_id() - 1]))
				System.out.println("Vendedor cadastrado com sucesso.");
					
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Não é possível cadastrar novos vendedores.");
		
		} catch (Exception ex) {
			System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
		}
	}
	
	private void opcaoCadastrarGerente(Gerente gerentes[]) {
		System.out.printf("\n---- CADASTRO DE GERENTE ----\n");

		try {
			gerentes[Gerente.getContador_id()] = new Gerente();
			gerentes[Gerente.getContador_id()].cadastrarDados(); //<- função que solicita os dados
	
			if(ManipuladorArquivo.salvaGerente(gerentes[Gerente.getContador_id() - 1]))
				System.out.println("Gerente cadastrado com sucesso.");
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Não é possível cadastrar novos gerentes.");
		
		} catch (Exception ex) {
			System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
		}
	}
	
	private void opcaoExibirVendedores(Vendedor vendedores[]) {
		int i = 0;
		
		System.out.println("---- DADOS DOS VENDEDORES ----");
		
		try {
			if(Vendedor.getContador_id() == 0) {
				System.out.println("Não há dados para exibir.");
				return ; //não é possível cadastrar uma venda sem que haja um vendedor ou um produto cadastrado
			}
			
			while(vendedores[i] != null) {
				vendedores[i].exibirDados();
				System.out.println();
				++i;
			}
			
		} catch (Exception ex) {
			System.out.println("Houve um erro inesperado. Contate o suporte.");
		}
	}
	
	private void opcaoExibirGerentes(Gerente gerentes[]) {
		int i = 0;
		
		System.out.println("---- DADOS DOS GERENTES ----");
		
		try {
			if(Gerente.getContador_id() == 0) {
				System.out.println("Não há dados para exibir.");
				return ; //não é possível cadastrar uma venda sem que haja um vendedor ou um produto cadastrado
			}
			
			while(gerentes[i] != null) {
				gerentes[i].exibirDados();
				System.out.println();
				++i;
			}
			
		} catch (Exception ex) {
			System.out.println("Houve um erro inesperado. Contate o suporte.");
		}
	}
	
	public void exibirMenu(Vendedor vendedores[], Gerente gerentes[]) throws IOException {
		int opcao = 0;
		boolean continue_loop = true;
		
		do {
			System.out.printf("\n   CADASTRO DE FUNCIONARIOS\n");
			System.out.printf("===============================\n");
			System.out.println("Escolha uma das opções abaixo  ");
			System.out.println("1 - Cadastrar vendedor         |");
			System.out.println("2 - Cadastrar gerente          |");
			System.out.println("3 - Dados dos vendedores       |");
			System.out.println("4 - Dados dos gerentes         |");
			System.out.println("0 - Sair                       |");
			System.out.println("===============================");
			
			while(continue_loop) {
				try {
					System.out.print("Sua opção: ");
					opcao = Integer.parseInt( input.nextLine() );
					
					continue_loop = false;
				
				} catch (NumberFormatException ex) {
					System.out.printf("    -> Digite apenas as opções disponíveis.\n");
					
				} catch (InputMismatchException ex) {
					System.out.printf("    -> Digite apenas as opções disponíveis.\n");
				
				} catch (Exception ex) {
					System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
				}
			}
		
			switch (opcao) {
				case 1:
					this.opcaoCadastrarVendedor(vendedores);
					break;
					
				case 2:
					this.opcaoCadastrarGerente(gerentes);
					
					break;
					
				case 3:
					this.opcaoExibirVendedores(vendedores);
					break;
					
				case 4:
					this.opcaoExibirGerentes(gerentes);
					break;
			             
				case 0:
					break;
					
				default:
					System.out.println("Opção Inválida!");
						break;
			}
			
			continue_loop = true;
			
		} while (opcao != 0);
	
	}

}
