package adaptadores;

import sensores.SensorPS5;
import sensores.SensorNintendo64;

public class AdaptadorNintendo64ParaPS5 extends SensorNintendo64 {
	
	private SensorPS5 adaptee;
	
	public AdaptadorNintendo64ParaPS5(SensorPS5 adaptee) {
		this.adaptee = adaptee;
	}
	
	public void conectarNintendo64() {
		adaptee.conectarPS5();
		System.out.println("Controle de um Nintendo64!");
	}
}
