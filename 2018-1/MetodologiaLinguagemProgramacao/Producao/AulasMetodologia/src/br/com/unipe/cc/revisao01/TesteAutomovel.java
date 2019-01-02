package br.com.unipe.cc.revisao01;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		//Array:
		Automovel [] array_automoveis = new Automovel[4];
		array_automoveis[0] = new Carro();
		array_automoveis[1] = new Moto();
		array_automoveis[2] = new Carro();
		array_automoveis[3] = new Moto();
		
		for(int i = 0; i < 4; i++) {
			array_automoveis[i].espessura();
		}
		
		System.out.println(array_automoveis[0].toString());
		System.out.println(array_automoveis[1].toString());
		System.out.println(array_automoveis[2].toString());
	}

}
