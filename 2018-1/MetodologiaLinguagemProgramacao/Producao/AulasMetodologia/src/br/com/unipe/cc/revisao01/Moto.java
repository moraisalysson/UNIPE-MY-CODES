package br.com.unipe.cc.revisao01;

public class Moto extends Automovel {

	int tamanhoGuidom;
	
	public void acelerar(int pressao) {
		System.out.println(pressao);
	}
	
	public void usarPotencia(int potencia) {
		System.out.println(potencia);
	}
	
	public void receberCombustivel(int quantidade) {
		System.out.println(quantidade);
	}

	@Override
	public void espessura() {
		System.out.println("espessura assento da moto");		
	}


}

