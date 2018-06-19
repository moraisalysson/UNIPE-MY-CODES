package models;

import java.util.InputMismatchException;

public class Produto implements Cadastro {
	private int codigo;
	private String descricao;
	private double valorVenda;
	private double valorCusto;
	private boolean promocao;

	public int cadastrarDados(int contador_produtos) {
		String descricao_temp = "";
		boolean emPromocao = false;
		boolean isNumber = false;
		double valor_venda_temp = 0.0d;
		double valor_custo_temp = 0.0d;
		int codigo = 0;

		System.out.println("---- CADASTRO DE PRODUTO ----");

		System.out.print("Descricao: ");
		descricao_temp = input.nextLine();

		System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)
		while( ! isNumber) {
			try {
				input.nextLine(); //limpa o buffer. fica aguardando alguma entrada do user na primeira iteração.

				System.out.print("Preço de venda: ");
				valor_venda_temp = input.nextDouble();

				if(valor_venda_temp < 0.0) {
					System.out.printf("    -> Não digite valores negativos.\n");
					System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)
				}

				else
					isNumber = true;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");
				System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)

			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");
				System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)
			}


			input.nextLine(); //limpa o buffer. fica aguardando alguma entrada do user na primeira iteração.
		}

		isNumber = false;

		System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)
		while( ! isNumber) {
			try {
				input.nextLine(); //limpa o buffer. fica aguardando alguma entrada do user na primeira iteração.

				System.out.print("Valor de custo: ");
				valor_venda_temp = input.nextDouble();

				if(valor_venda_temp < 0.0) {
					System.out.printf("    -> Não digite valores negativos.\n");
					System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)
				}

				else
					isNumber = true;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");
				System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)

			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores em reais.\n");
				System.out.print("Pressione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)
			}

			input.nextLine(); //limpa o buffer. fica aguardando alguma entrada do user na primeira iteração.
		}

		codigo = contador_produtos + 1;

		this.setCodigo(codigo);

		System.out.print("Produto cadastrado com sucesso! ");
		System.out.println("Codigo: " + this.getCodigo() );

		return codigo;
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
