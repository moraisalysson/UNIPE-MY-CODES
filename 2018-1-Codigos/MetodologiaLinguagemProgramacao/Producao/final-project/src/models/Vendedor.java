package models;

public class Vendedor implements Cadastro {
	private String nome;
	private int codigo;
	private double comissao; //em percentagem e deve ser única para todos os objetos
	private String endereco;
	
	public Vendedor() {
		this.comissao = 0.15d; //15% de comissão para todos os vendedores
	}
		
	public int cadastrarDados(int contador_vendedor) {
		String nome_temp = "", endereco_temp = "";
		int codigo = 0;
		
		System.out.println("---- CADASTRO DE VENDEDOR ----");
		
		System.out.print("Vendedor: ");
		nome_temp = input.nextLine();
		
		System.out.print("Endereço: ");
		endereco_temp = input.nextLine();
		
		codigo = contador_vendedor + 1;
		
		this.setNome(nome_temp);
		this.setEndereco(endereco_temp);
		this.setCodigo(codigo);
		
		System.out.print("Vendedor cadastrado com sucesso! ");
		System.out.print("Codigo: " + this.getCodigo() );
		
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
