package integrador;

public class Parceiro {
	private int id;
	private String nome;
	private String senha;
	private String telefone;
	private String email;
	private String endereco;
	private int pontosTrocados;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getPontosTrocados() {
		return pontosTrocados;
	}
	public void setPontosTrocados(int pontosTrocados) {
		this.pontosTrocados = pontosTrocados;
	}
	
}
