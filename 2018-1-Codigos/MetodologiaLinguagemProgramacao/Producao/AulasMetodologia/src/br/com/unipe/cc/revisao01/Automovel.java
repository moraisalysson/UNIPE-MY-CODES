package br.com.unipe.cc.revisao01;

public abstract class Automovel implements Motor, Assento {
	protected int potencia;
	protected String cor;
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public abstract void acelerar(int pressao);
}
