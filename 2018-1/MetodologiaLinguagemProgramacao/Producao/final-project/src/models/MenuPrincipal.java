package models;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
	Scanner input = new Scanner(System.in);
	MenuFuncionarios menu_funcionarios = new MenuFuncionarios();
	MenuProdutos menu_produtos = new MenuProdutos();
	MenuVendas menu_vendas = new MenuVendas();
	
	public void exibirMenu(Vendedor vendedores[], Gerente gerentes[], Produto produtos[], Venda vendas[]) throws Exception {
		int opcao = 0;
		boolean continue_loop = true;
		
		do {
			System.out.printf("\n        MENU PRINCIPAL\n");
			System.out.printf("===============================\n");
			System.out.println("Escolha uma das opções abaixo  ");
			System.out.println("1 - Menu funcionarios         |");
			System.out.println("2 - Menu produtos             |");
			System.out.println("3 - Menu vendas               |");
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
					menu_funcionarios.exibirMenu(vendedores, gerentes);
					break;
					
				case 2:
					menu_produtos.exibirMenu(produtos);					
					break;
			             
				case 3:
					menu_vendas.exibirMenu(vendas, vendedores, produtos);					
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
