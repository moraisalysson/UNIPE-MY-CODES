package br.com.unipe.cc.aula2409;

public class PessoaFisica implements Comparable <PessoaFisica> {
	private String cpf;
	private String nome;
	private int idade;
	
	public PessoaFisica(String cpf, String nome, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int compareTo(PessoaFisica o) {
		if(this.getIdade() == o.getIdade())
			return 0;
		
		if(this.getIdade() < o.getIdade())
			return -1;
		
		else
			return 1;
	}

	public boolean equals(Object o) {
		
		PessoaFisica p = (PessoaFisica) o; //casting
		
		return this.getCpf().equals(p.getCpf());
	}
	
	public int hashCode() {
		return this.getCpf().hashCode();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
