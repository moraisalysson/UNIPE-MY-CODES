package models;

public class Venda {
	private Produto produto;
	private Vendedor vendedor;
	private double desconto;
	private int quantidadeItens;
	private double valor;
	
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
	
	public void imprimir() {
		System.out.println("---------- VENDA ----------");
		System.out.printf(">> Código vendedor: %s%n", vendedor.getCodigo());
		System.out.printf(">> Nome vendedor: %s%n", vendedor.getNome());
		System.out.printf(">> Comissão do vendedor: %.2f %% %n", vendedor.getComissao() * 100);
		System.out.printf(">> Valor da comissão pela venda: R$ %.2f%n%n", this.calcularComissao());
		
		System.out.printf(">> Quantidade produtos vendidos: %d%n", this.quantidadeItens);
		System.out.printf(">> Código do produto: %s%n", produto.getCodigo());
		System.out.printf(">> Descrição do produto: %s%n", produto.getDescricao());
		System.out.printf(">> Valor unitário do produto: R$ %.2f%n", produto.getValorVenda());
		System.out.printf(">> Produto em promoção: %b%n", produto.isPromocao());
		if(this.calcularValor() == 0)
			System.out.println("Esta venda não pode ocorrer, pois o seu valor está menor que o do custo do produto.");
		else {
			System.out.printf(">> Valor do desconto: R$ %.2f %n", (this.desconto * produto.getValorVenda() * this.quantidadeItens));	
			System.out.printf("= Valor total da venda: R$ %.2f%n%n", this.calcularValor());
		}
	}
}
