package br.unipe.cc.exercicio01;

public class Questao06 {
	private String cpf;
	private String nome;
	
	public Questao06(String n_cpf, String n_nome) { //construtor
		this.cpf = n_cpf;
		this.nome = n_nome;
	}

	public void setCpf(String n_cpf) {
		cpf = n_cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setNome(String n_nome) {
		nome = n_nome;
	}
	
	public String getNome() {
		return nome;
	}
		
}