package models;

public class Vendedor extends Funcionario {
	private static int contador_id; //estático para valor poder ser usado em vários objetos
	
	
	public Vendedor() { //inicializando o valor da comissão
		this.comissao = 0.15d; //15% de comissão para todos os vendedores
	}
		
	public void cadastraNome() {
		String nome_temp = "";
		
		System.out.print("Nome: ");
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
		this.cadastraNome();
		this.cadastraEndereco();

		Vendedor.setContador_id(++contador_id);

		this.setCodigo(contador_id);
	
		System.out.println("Codigo: " + this.getCodigo());
		
	}

	public static int getContador_id() {
		return contador_id;
	}

	public static void setContador_id(int contador_id) {
		Vendedor.contador_id = contador_id;
	}

}
