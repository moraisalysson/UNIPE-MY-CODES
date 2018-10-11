package cap3;

public class Exe314Employee {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	public Exe314Employee(String nome, String sobrenome, double salarioMensal) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		
		if(salarioMensal > 0)
			this.setSalarioMensal(salarioMensal);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal > 0.0)
			this.salarioMensal = salarioMensal;
		
		else
			this.salarioMensal = 0.0;
	}
	
	
}
