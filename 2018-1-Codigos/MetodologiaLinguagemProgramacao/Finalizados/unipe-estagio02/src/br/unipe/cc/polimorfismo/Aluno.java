package br.unipe.cc.polimorfismo;

/**
 * @author Morais, Alysson
 */

public class Aluno extends Pessoa {
	
	private String matricula;

	
	public void falar(String mensagem) { 
		System.out.println(mensagem);
	}
	
	public void falar(Pessoa p) {
		/** 
		 * Sobrecarga: método com a mesma assinatura do anterior, mas com parâmetros diferentes
		 */
		p.falar();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
