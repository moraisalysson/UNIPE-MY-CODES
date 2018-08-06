package br.unipe.cc.polimorfismo;

/**
 * @author Morais, Alysson
 */

public class Funcionario extends Pessoa {
	
	private String registro;
	private int tipo = 0;

	public void recebeSalario() {
		System.out.println("Recebe o FaiMeRir");
	}
	
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
}
