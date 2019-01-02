package br.com.unipe.cc.aula2409;

public class Pet {
	private String cpfDono;
	private String nome;
	private int idade;
	
	public Pet(String cpfDono, String nome, int idade) {
		this.cpfDono = cpfDono;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCpfDono() {
		return this.cpfDono;
	}

	public void setDono(String cpfDono) {
		this.cpfDono = cpfDono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
