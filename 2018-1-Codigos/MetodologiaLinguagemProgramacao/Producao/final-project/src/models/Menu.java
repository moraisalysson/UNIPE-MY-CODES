package models;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {		
	Scanner input = new Scanner(System.in);
	
	public void menuCadastroFuncionario(Vendedor vendedores[], Gerente gerentes[]) throws IOException {
		int opcao = 0;
		boolean continue_loop = true;
		
		do {
		
			System.out.printf("\n   CADASTRO DE FUNCIONARIOS\n");
			System.out.printf("===============================\n");
			System.out.println("Escolha uma das opções abaixo  ");
			System.out.println("1 - Cadastrar vendedor         |");
			System.out.println("2 - Cadastrar gerente          |");
			//System.out.println("3 - Dados dos vendedores       |");
			//System.out.println("4 - Dados dos vendedores       |");
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
					try {
						vendedores[Vendedor.getContador_id()] = new Vendedor();
						vendedores[Vendedor.getContador_id()].cadastrarDados(); 
						
						if(ManipuladorArquivo.salvaVendedor(vendedores[Vendedor.getContador_id() - 1]))
							System.out.println("Vendedor cadastrado com sucesso.");
								
					} catch (ArrayIndexOutOfBoundsException ex) {
						System.out.println("Não é possível cadastrar novos vendedores.");
					
					} catch (Exception ex) {
						System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
					}
				
					break;
					
				case 2:
					try {
						gerentes[Gerente.getContador_id()] = new Gerente();
						gerentes[Gerente.getContador_id()].cadastrarDados();
				
						if(ManipuladorArquivo.salvaGerente(gerentes[Gerente.getContador_id() - 1]))
							System.out.println("Gerente cadastrado com sucesso.");
						
					} catch (ArrayIndexOutOfBoundsException ex) {
						System.out.println("Não é possível cadastrar novos gerentes.");
					
					} catch (Exception ex) {
						System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
					}
					
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
	
	public void menuInicial(Vendedor vendedores[], Gerente gerentes[], Produto produtos[], Venda vendas[]) throws IOException {
		int opcao = 0;
		boolean continue_loop = true;
		
		do {
			System.out.printf("\n        MENU PRINCIPAL\n");
			System.out.printf("===============================\n");
			System.out.println("Escolha uma das opções abaixo  ");
			System.out.println("1 - Cadastrar funcionario     |");
			System.out.println("2 - Cadastrar produto         |");
			System.out.println("3 - Cadastrar venda           |");
			System.out.println("0 - Sair                      |");
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
					this.menuCadastroFuncionario(vendedores, gerentes);
					break;
					
				case 2:
					try {
						produtos[Produto.getContador_id()] = new Produto();
						produtos[Produto.getContador_id()].cadastrarDados();
						
						if(ManipuladorArquivo.salvaProduto(produtos[Produto.getContador_id() - 1]))
							System.out.println("Produto cadastrado com sucesso.");
						
					} catch (ArrayIndexOutOfBoundsException ex) {
						System.out.println("Não é possível cadastrar novos produtos.");

					} catch (Exception ex) {
						System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
					}
					
					break;
			             
				case 3:
					try {
						vendas[Venda.getContadorVendas()] = new Venda();
						vendas[Venda.getContadorVendas()].cadastrarDados(vendedores, produtos);
						
						if(ManipuladorArquivo.salvaVenda(vendas[Venda.getContadorVendas() - 1]))
							System.out.println("Venda cadastrada com sucesso.");
						
					} catch (ArrayIndexOutOfBoundsException ex) {
						System.out.println("Não é possível cadastrar novas vendas.");
					
					} catch (Exception ex) {
						System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
					}
					
					break;
				
				case 0:
					System.out.println("Programa encerrado pelo usuário. o/");
					break;
					
				default:
					System.out.println("Opção Inválida!");
						break;
			}
			
			continue_loop = true;
			
		} while (opcao != 0);
	
		input.close();
	}

}