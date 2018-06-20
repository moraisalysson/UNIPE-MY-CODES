package models;

public class Vendedor implements Cadastro {
	private static int contador_id; //estático para valor poder ser usado em vários objetos
	private String nome;
	private int codigo;
	private double comissao; //em percentagem e deve ser única para todos os objetos
	private String endereco;
	
	public Vendedor() { //inicializando o valor da comissão
		this.comissao = 0.15d; //15% de comissão para todos os vendedores
	}
	
	public void cadastraNome() {
		String nome_temp = "";
		
		System.out.print("Vendedor: ");
		nome_temp = input.nextLine();
		
		this.setNome(nome_temp);
	}
	
	public void cadastraEndereco() {
		String endereco_temp = "";
		
		System.out.print("Endereço: ");
		endereco_temp = input.nextLine();

		this.setEndereco(endereco_temp);
	}
		
	public void cadastrarDados() {		
		System.out.printf("\n---- CADASTRO DE VENDEDOR ----\n\n");

		this.cadastraNome();
		this.cadastraEndereco();

		contador_id = contador_id + 1;

		this.setCodigo(contador_id);
		
		System.out.print("Vendedor cadastrado com sucesso! ");
		System.out.println("Codigo: " + this.getCodigo());
		
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
