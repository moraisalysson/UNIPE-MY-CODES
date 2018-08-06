package models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuVendas {
	Scanner input = new Scanner(System.in);

	private void opcaoCadastrarVenda(Venda vendas[], Vendedor vendedores[], Produto produtos[]) {
		System.out.println("\n---- CADASTRO DE VENDA ----");
		
		try {
			if(Vendedor.getContador_id() == 0 || Produto.getContador_id() == 0) {
				System.out.println("N�o � poss�vel registrar a venda, pois n�o h� vendedores/produtos cadastrados.");
				return ; //n�o � poss�vel cadastrar uma venda sem que haja um vendedor ou um produto cadastrado
			}
			
			vendas[Venda.getContadorVendas()] = new Venda();
			vendas[Venda.getContadorVendas()].cadastrarDados(vendedores, produtos);
			
			if(ManipuladorArquivo.salvaVenda(vendas[Venda.getContadorVendas() - 1]))
				System.out.println("Venda cadastrada com sucesso.");
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("N�o � poss�vel cadastrar novas vendas.");
		
		} catch (Exception ex) {
			System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
		}
	}
	
	private void opcaoExibirVendas(Venda vendas[]) throws Exception {
		int i = 0;
		
		System.out.println("---- DADOS DAS VENDAS ----");
		
		try {
			if(Vendedor.getContador_id() == 0 || Produto.getContador_id() == 0) {
				System.out.println("N�o h� dados para exibir.");
				return ; //n�o � poss�vel cadastrar uma venda sem que haja um vendedor ou um produto cadastrado
			
			}
			
			while(vendas[i] != null) {
				vendas[i].relatorioVenda();
				++i;
			}	
			
		} catch (Exception ex) {
			System.out.println("Houve um erro inesperado. Contate o suporte.");
		}
	}
	
	public void exibirMenu(Venda vendas[], Vendedor vendedores[], Produto produtos[]) throws Exception {
		int opcao = 0;
		boolean continue_loop = true;
		
		do {
			System.out.printf("\n   MENU DE VENDAS\n");
			System.out.printf("===============================\n");
			System.out.println("Escolha uma das op��es abaixo  ");
			System.out.println("1 - Cadastrar venda            |");
			System.out.println("2 - Dados das vendas           |");
			System.out.println("0 - Sair                       |");
			System.out.println("===============================");
			
			while(continue_loop) {
				try {
					System.out.print("Sua op��o: ");
					opcao = Integer.parseInt( input.nextLine() );
					
					continue_loop = false;
				
				} catch (NumberFormatException ex) {
					System.out.printf("    -> Digite apenas as op��es dispon�veis.\n");
					
				} catch (InputMismatchException ex) {
					System.out.printf("    -> Digite apenas as op��es dispon�veis.\n");
				
				} catch (Exception ex) {
					System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
				}
			}
		
			switch (opcao) {
				case 1:
					this.opcaoCadastrarVenda(vendas, vendedores, produtos);
					break;
					
				case 2:
					this.opcaoExibirVendas(vendas);
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("Op��o Inv�lida!");
						break;
			}
			
			continue_loop = true;
			
		} while (opcao != 0);
	
	}
	

	
}
