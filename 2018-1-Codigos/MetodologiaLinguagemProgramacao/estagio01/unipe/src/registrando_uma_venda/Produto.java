package registrando_uma_venda;

public class Produto {
	private String codigo;
	private String descricao;
	private double valorVenda;
	private double valorCusto;
	private boolean promocao;
	
	public Produto(String c_codigo, String c_descricao, double c_valorVenda, double c_valorCusto, boolean c_promocao) {
		this.codigo = c_codigo;
		this.descricao = c_descricao;
		this.valorVenda = c_valorVenda;
		this.valorCusto = c_valorCusto;
		this.promocao = c_promocao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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
