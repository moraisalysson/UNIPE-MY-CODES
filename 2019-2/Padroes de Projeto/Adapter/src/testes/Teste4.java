package testes;

import adaptadores.AdaptadorNintendo64ParaPS5;
import controles.ControleNintendo64;
import sensores.SensorPS5;

public class Teste4 {
	public static void main(String[] args) {
		
		SensorPS5 adaptee = new SensorPS5();
		ControleNintendo64 target = new ControleNintendo64();
		
		AdaptadorNintendo64ParaPS5 adapter = new AdaptadorNintendo64ParaPS5(adaptee);
		
		target.Conectar(adapter);
	}
}
