package models;

//classe abstrata: n�o pode ser instanciada

public abstract class Funcionario implements Cadastro {
	protected String nome;
	protected String endereco;
	protected int codigo;
	protected double comissao;
	
	public void exibirDados() throws Exception {
		System.out.println("C�digo: " + this.getCodigo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endere�o: " + this.getEndereco());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
