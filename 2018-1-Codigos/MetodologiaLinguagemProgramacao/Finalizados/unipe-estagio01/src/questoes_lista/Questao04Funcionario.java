package questoes_lista;

public class Questao04Funcionario {
	private String nome;
	private float salario;
	
	public void setNome(String novo_nome) {
		if(novo_nome != null) {
			this.nome = novo_nome;
		} else {
			this.nome = "vazio";
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSalario(float novo_salario) {
		if(novo_salario > 0) {
			this.salario = novo_salario;
		} else {
			this.salario = 0;
		}
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public void relatorioFuncionario(int index) {
		System.out.printf("%n------------------ %d ------------------%n", index + 1);
		System.out.printf("Nome: %s%n", this.getNome());
		System.out.printf("Salario: %.2f%n", this.getSalario());
	}
}
