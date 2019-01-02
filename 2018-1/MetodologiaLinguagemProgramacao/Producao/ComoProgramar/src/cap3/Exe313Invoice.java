package cap3;

public class Exe313Invoice {
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Exe313Invoice(String numero, String descricao, int quantidade, double preco) {
		this.numero = numero; 
		this.descricao = descricao;
		
		if(quantidade > 0)
			this.quantidade = quantidade;
		
		if(preco > 0.0)
			this.preco = preco;
	}
	
	public String getRelatorio() {
		return "Numero: " + this.getNumero() + "\n" +
				"Descricao: " + this.getDescricao() + "\n" +
				"Quantidade: " + this.getQuantidade() + "\n" +
				"Preço: " + this.getPreco() + "\n" +
				"Total da fatura: R$ " + this.getInvoiceAmount();
		}

	public double getInvoiceAmount() {
		return this.getQuantidade() * this.getPreco();
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade > 0)
			this.quantidade = quantidade;
		
		else
			this.quantidade = 0;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco > 0.0)
			this.preco = preco;
		
		else
			this.preco = 0.0;
	}
	
}
