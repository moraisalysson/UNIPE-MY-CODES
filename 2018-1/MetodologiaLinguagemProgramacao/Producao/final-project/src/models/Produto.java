package models;

import java.util.InputMismatchException;

public class Produto implements Cadastro {
	private static int contador_id; //estático para que o valor possa ser usado em vários objetos
	private int codigo;
	private String descricao;
	private double valorVenda;
	private double valorCusto;
	private boolean promocao;
	
	public void exibirDados() throws Exception {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor de custo: R$ " + this.getValorCusto());
		System.out.println("Valor de venda: R$ " + this.getValorVenda());
		System.out.println("Em promoção: " + this.isPromocao());
	}
	
	public void cadastraDescricao( ) {
		String descricao_temp = "";
		
		System.out.print("Descricao: ");
		descricao_temp = input.nextLine();
		
		this.setDescricao(descricao_temp);
	}
	
	public void cadastraValorVenda() {
		boolean continue_loop = true;
		double valor_venda_temp = 0.0d;
		
		while(continue_loop) {
			try {
				System.out.print("Preço de venda: ");
				valor_venda_temp = Double.parseDouble(input.nextLine());

				if(valor_venda_temp < 0.0)
					System.out.printf("    -> Não digite valores negativos.\n");

				else
					continue_loop = false;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");
			
			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");
			
			} catch (Exception ex) {
				System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
			}
			
		}

		this.setValorVenda(valor_venda_temp);
	}
	
	public void cadastraValorCusto() {
		double valor_custo_temp = 0.0d;
		boolean continue_loop = true;
		
		while(continue_loop) { 
			try {
				System.out.print("Valor de custo: ");
				valor_custo_temp = Double.parseDouble(input.nextLine());

				if(valor_custo_temp < 0.0)
					System.out.printf("    -> Não digite valores negativos.\n");
				
				else
					continue_loop = false;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");
				
			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");

			} catch (Exception ex) {
				System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
			}
		}
		
		this.setValorCusto(valor_custo_temp);
	}
	
	public void cadastraEmPromoca() {
		String promocao_verificador = "";
		boolean emPromocao = false;	
		boolean continue_loop = true;
		
		while(continue_loop) {
			try {
				System.out.print("Em promoção (sim ou não): ");
				promocao_verificador = input.nextLine();
				
				if(promocao_verificador.equalsIgnoreCase("sim")) {
					emPromocao = true;
					continue_loop = false;
				}
				
				else if(promocao_verificador.equalsIgnoreCase("não")) {
					emPromocao = false;
					continue_loop = false;
				}
				
				else
					System.out.println("Digite apenas 'sim' ou 'não'.");
			
			} catch (Exception ex) {
				System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
			}
		}
		
		this.setPromocao(emPromocao);
	}
	
	public void cadastrarDados() {
		System.out.println("\n---- CADASTRO DE PRODUTO ----");

		this.cadastraDescricao();
		this.cadastraValorVenda();
		this.cadastraValorCusto();
		this.cadastraEmPromoca();

		Produto.setContador_id(++contador_id);

		this.setCodigo(contador_id);

		System.out.println("Codigo: " + this.getCodigo() );
	}

	public static int getContador_id() {
		return contador_id;
	}

	public static void setContador_id(int contador_id) {
		Produto.contador_id = contador_id;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}


}
