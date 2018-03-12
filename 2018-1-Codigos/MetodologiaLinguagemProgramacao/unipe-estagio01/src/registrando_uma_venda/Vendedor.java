package registrando_uma_venda;

public class Vendedor {
	private String nome;
	private String codigo;
	private double comissao; //em percentagem e deve ser única para todos os objetos
	private String endereco;
	
	public Vendedor(String c_nome, String c_endereco, String c_codigo) {
		this.nome = c_nome;
		this.codigo = c_codigo;
		this.endereco = c_endereco;
		this.comissao = 0.15d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}