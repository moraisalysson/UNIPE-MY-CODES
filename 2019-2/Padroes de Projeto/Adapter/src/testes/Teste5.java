package testes;

import adaptadores.AdaptadorPS5ParaNintendo64;
import controles.ControlePS5;
import sensores.SensorNintendo64;;

public class Teste5 {
	public static void main(String[] args) {
		SensorNintendo64 adaptee = new SensorNintendo64();
		ControlePS5 target = new ControlePS5();
		
		AdaptadorPS5ParaNintendo64 adapter = new AdaptadorPS5ParaNintendo64(adaptee);
		
		target.Conectar(adapter);
	}
}
