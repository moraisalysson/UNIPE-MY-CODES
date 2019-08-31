package adaptadores;

import sensores.SensorXbox2;
import sensores.SensorNintendo64;

public class AdaptadorXbox2ParaNintendo64 extends SensorXbox2 {
	private SensorNintendo64 adaptee = new SensorNintendo64();
	
	public AdaptadorXbox2ParaNintendo64(SensorNintendo64 adaptee) {
		this.adaptee = adaptee;
	}
	
	public void conectarXbox2() {
		adaptee.conectarNintendo64();
		System.out.println("Controle de um Xbox2!");
	}
}
