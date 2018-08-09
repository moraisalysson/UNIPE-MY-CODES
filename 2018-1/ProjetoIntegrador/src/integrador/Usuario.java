package integrador;

public class Usuario {
	private String nome;
	private String cpf;
	private String email;
	private String dataNascimento;
	private String telefone;
	private String senha;
	private Pontos pontos = new Pontos();
	
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
	
	public int getPontosRecebidos() {
		return this.pontos.getRecebidos();
	}
	
	public int getPontosTrocados() {
		return this.pontos.getTrocados();
	}
	
	public int getSaldoPontos() {
		return this.pontos.getSaldoPontos();
	}
		
	
}
