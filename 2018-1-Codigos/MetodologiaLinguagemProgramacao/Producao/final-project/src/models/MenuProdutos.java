package models;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuProdutos {
	Scanner input = new Scanner(System.in);
	
	private void opcaoCadastrarProduto(Produto produtos[]) {
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

	}
	
	private void opcaoExibirProdutos(Produto produtos[]) {
		int i = 0;
		
		System.out.println("---- DADOS DOS PRODUTOS ----");
		
		try {
			if(Vendedor.getContador_id() == 0 || Produto.getContador_id() == 0) {
				System.out.println("Não há dados para exibir.");
				return ; //não é possível cadastrar uma venda sem que haja um vendedor ou um produto cadastrado
			}
			
			while(produtos[i] != null) {
				produtos[i].exibirDados();
				System.out.println();
				++i;
			}
			
		} catch (Exception ex) {
			System.out.println("Houve um erro inesperado. Contate o suporte.");
		}
	}
	
	public void exibirMenu(Produto produtos[]) throws IOException {
		int opcao = 0;
		boolean continue_loop = true;
		
		do {
			System.out.printf("\n   MENU DE PRODUTOS\n");
			System.out.printf("===============================\n");
			System.out.println("Escolha uma das opções abaixo  ");
			System.out.println("1 - Cadastrar produto          |");
			System.out.println("2 - Dados dos produtos         |");
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
					this.opcaoCadastrarProduto(produtos);
					break;
					
				case 2:
					this.opcaoExibirProdutos(produtos);
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
