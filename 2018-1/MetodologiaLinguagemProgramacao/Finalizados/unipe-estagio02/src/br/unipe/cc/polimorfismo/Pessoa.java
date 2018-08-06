package br.unipe.cc.polimorfismo;

/**
 * @author Morais, Alysson
 */


public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public void falar() {
		System.out.println("Meu nome: " + getNome());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

