package integrador;

public class Usuario {
	private String nome;
	private String cpf;
	private String email;
	private String dataNascimento;
	private String telefone;
	private String senha;
	private Pontos saldoPontos = new Pontos();
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Pontos getSaldoPontos() {
		return saldoPontos;
	}
	public void setSaldoPontos(Pontos saldoPontos) {
		this.saldoPontos = saldoPontos;
	}
	
	
	
}
