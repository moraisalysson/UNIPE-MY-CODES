package br.com.unipe.cc.revisao01;

public class Aviao implements Motor, Assento {

	public void usarPotencia(int potencia) {
		System.out.println("potencia");
	}
	
	public void receberCombustivel(int quantidade) {
		System.out.println(quantidade);	
	}
	
	public void espessura()  {
		System.out.println("espessura");
	}
	 
}
