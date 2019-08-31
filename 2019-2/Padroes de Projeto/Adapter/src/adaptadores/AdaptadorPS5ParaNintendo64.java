package adaptadores;

import sensores.SensorPS5;
import sensores.SensorNintendo64;

public class AdaptadorPS5ParaNintendo64 extends SensorPS5 {
	
	private SensorNintendo64 adaptee;
	
	public AdaptadorPS5ParaNintendo64(SensorNintendo64 adaptee) {
		this.adaptee = adaptee;
	}
	
	public void conectarPS5() {
		adaptee.conectarNintendo64();
		System.out.println("Controle de um PlayStation 5!");
	}
}
