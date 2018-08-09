package models;

/**
 * Esta classe representa os gerentes, do tipo Funcionario
 * @author Grupo de Java - P3 - CC
 */
public class Gerente extends Funcionario {
	private static int contador_id; //est�tico para valor poder ser usado em v�rios objetos
	
	/**
	 * Comiss�o de venda atribu�da ao gerente, em percentagem e deve ser �nica para todos os objetos
	 */
	
	/**
	 * Construtor da classe Gerente: 20% de comiss�o
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
		
		System.out.print("Endere�o: ");
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
