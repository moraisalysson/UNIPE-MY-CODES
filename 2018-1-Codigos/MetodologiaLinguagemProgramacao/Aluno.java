package br.unipe.cc.polimorfismo;

/**
 * 
 * @author Morais, Alysson
 *
 */

public class Aluno extends Pessoa {
	
	private String matricula;

	
	public void falar(String mensagem) { 
		System.out.println(mensagem);
	}
	
	public void falar(Pessoa p) { //sobrecarga. m�todo com a mesma assinatura, mas com par�metros diferentes
		p.falar();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
