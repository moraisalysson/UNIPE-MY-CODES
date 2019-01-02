package br.com.unipe.cc.aula2108p1;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Animal[] array_animais = new Animal[5];
		
		array_animais[0] = new Gato();
		array_animais[1] = new Cachorro();
		array_animais[2] = new Passaro();
		array_animais[3] = new Gato();
		array_animais[4] = new Cachorro();
		
		for(int i = 0; i < 5; i++) {
			array_animais[i].fazerBarulho();
		}
	}
}
