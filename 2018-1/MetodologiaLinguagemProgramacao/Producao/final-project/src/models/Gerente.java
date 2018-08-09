package models;

/**
 * Esta classe representa os gerentes, do tipo Funcionario
 * @author Grupo de Java - P3 - CC
 */
public class Gerente extends Funcionario {
	private static int contador_id; //estático para valor poder ser usado em vários objetos
	
	/**
	 * Comissão de venda atribuída ao gerente, em percentagem e deve ser única para todos os objetos
	 */
	
	/**
	 * Construtor da classe Gerente: 20% de comissão
	 */
	public Gerente() {
		this.comissao = 0.20d;
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

		Gerente.setContador_id(++contador_id);

		this.setCodigo(contador_id);
		
		System.out.println("Codigo: " + this.getCodigo());
		
	}
	
	public static int getContador_id() {
		return contador_id;
	}

	public static void setContador_id(int contador_id) {
		Gerente.contador_id = contador_id;
	}

}
