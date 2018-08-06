package models;

import java.util.InputMismatchException;

public class Venda implements Cadastro {
	private static int contadorVendas;
	private int codigo;
	private Produto produto;
	private Vendedor vendedor;
	private double desconto;
	private int quantidadeItens;
	private double valor;
	
	private void registrarVendedor(Vendedor vendedores[]) {
		boolean continue_loop = true;
		int cod_vendedor = 0;
		
		while(continue_loop) {
			try {
				System.out.print("Informe o c�digo do vendedor: ");
				cod_vendedor = Integer.parseInt(input.nextLine());

				if(cod_vendedor < 0)
					System.out.printf("    -> N�o digite valores negativos.\n");

				else
					continue_loop = false;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");
			
			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");
			
			} catch (Exception ex) {
				System.out.println("Houve um erro inesperado. Entre em contato com o suporte.");
			}
			
			
		}

		this.setVendedor(vendedores[cod_vendedor  - 1]);
	}

	private void registrarProduto(Produto produtos[]) {
		boolean continue_loop = true;
		int cod_produto = 0;
		
		while(continue_loop) {
			try {
				System.out.print("Informe o c�digo do item: ");
				cod_produto = Integer.parseInt(input.nextLine());

				if(cod_produto < 0)
					System.out.printf("    -> N�o digite valores negativos.\n");

				else
					continue_loop = false;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");
			
			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");
			
			} catch (Exception ex) {
				System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
			}
		}

		this.setProduto(produtos[cod_produto - 1]);
	}
	
	private void registrarPercentualDesconto() {
		boolean continue_loop = true;
		double percentual_desconto = 0.0d;
		
		while(continue_loop) {
			try {
				System.out.print("Informe o percentual de desconto: ");
				percentual_desconto = (Double.parseDouble(input.nextLine()) ) / 100.0;

				if(percentual_desconto < 0.0d)
					System.out.printf("    -> N�o digite valores negativos.\n");

				else
					continue_loop = false;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores decimais.\n");
			
			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores decimais.\n");

			} catch (Exception ex) {
				System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
			}
			
		}

		this.setDesconto(percentual_desconto);
	}
	
	private void registrarQtdProdutos() {
		boolean continue_loop = true;
		int qtd_produtos = 0;
		
		while(continue_loop) {
			try {
				System.out.print("Informe a quantidade: ");
				qtd_produtos = Integer.parseInt(input.nextLine());

				if(qtd_produtos < 0)
					System.out.printf("    -> N�o digite valores negativos.\n");

				else
					continue_loop = false;

			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");
			
			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");

			} catch (Exception ex) {
				System.out.println("Houve um erro inesperado. Entre emm contato com o suporte.");
			}
			
		}

		this.setQuantidadeItens(qtd_produtos);
	}
	
	@Override
	public void cadastrarDados() {
		// TODO Auto-generated method stub
		
	}
	
	public void cadastrarDados(Vendedor vendedores[], Produto produtos[]) {
		this.registrarVendedor(vendedores);
		this.registrarProduto(produtos);
		this.registrarQtdProdutos();
		
		if(this.produto.isPromocao())
			this.registrarPercentualDesconto(); //s� pede o percentual de desconto se o produto estiver em promo��o
		
		Venda.setContadorVendas(++contadorVendas);

		this.setCodigo(contadorVendas);
		
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	private double efetuarDesconto(double percentualDesconto) {
		double valorComDesconto = 0.0;
		
		if(percentualDesconto < 0.0)
			return -1;
	
		valorComDesconto = produto.getValorVenda() * (1 - percentualDesconto);
	
		if(valorComDesconto < produto.getValorCusto())
			return 0;
		
		return valorComDesconto;
	}
	
	private double calcularValor() {
		return this.quantidadeItens * this.efetuarDesconto(desconto);
	}
	
	private double calcularComissao() {
		if(produto.isPromocao())
			return (vendedor.getComissao() * this.calcularValor()) / 2;
	
		return vendedor.getComissao() * this.calcularValor();
	}
	
	public void relatorioVenda() throws Exception {
		System.out.printf(">> C�digo da venda: %d%n", this.getCodigo());
		System.out.printf(">> C�digo vendedor: %s%n", vendedor.getCodigo());
		System.out.printf(">> Nome vendedor: %s%n", vendedor.getNome());
		if(produto.isPromocao())
			System.out.printf(">> Comiss�o do vendedor: %.2f %% %n", (vendedor.getComissao() * 100) / 2);
		else
			System.out.printf(">> Comiss�o do vendedor: %.2f %% %n", vendedor.getComissao() * 100);
		System.out.printf(">> Valor da comiss�o pela venda: R$ %.2f%n%n", this.calcularComissao());
		
		System.out.printf(">> Quantidade produtos vendidos: %d%n", this.quantidadeItens);
		System.out.printf(">> C�digo do produto: %s%n", produto.getCodigo());
		System.out.printf(">> Descri��o do produto: %s%n", produto.getDescricao());
		System.out.printf(">> Valor unit�rio do produto: R$ %.2f%n", produto.getValorVenda());
		System.out.printf(">> Produto em promo��o: %b%n", produto.isPromocao());
		if(this.calcularValor() == 0)
			System.out.println("Esta venda n�o pode ocorrer, pois o seu valor est� menor que o do custo do produto.");
		else {
			System.out.printf(">> Valor do desconto: R$ %.2f %n", (this.desconto * produto.getValorVenda() * this.quantidadeItens));	
			System.out.printf("= Valor total da venda: R$ %.2f%n%n", this.calcularValor());
		}
	}

	public static int getContadorVendas() {
		return contadorVendas;
	}

	public static void setContadorVendas(int contadorVendas) {
		Venda.contadorVendas = contadorVendas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
