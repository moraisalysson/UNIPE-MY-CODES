package testes;

import sensores.SensorNintendo64;
import controles.ControleXbox2;
import adaptadores.AdaptadorXbox2ParaNintendo64;

public class Teste6 {

	public static void main(String[] args) {
		SensorNintendo64 adaptee = new SensorNintendo64();
		ControleXbox2 target = new ControleXbox2();
		
		AdaptadorXbox2ParaNintendo64 adapter = new AdaptadorXbox2ParaNintendo64(adaptee);
		
		target.Conectar(adapter);
	}

}
