package adaptadores;

import sensores.SensorPS5;
import sensores.SensorXbox2;

public class AdaptadorXbox2ParaPS5 extends SensorXbox2 {

	private SensorPS5 adaptee;

    public AdaptadorXbox2ParaPS5(SensorPS5 adaptee) {
        this.adaptee = adaptee;
    }

    //Override da solicitação
    public void conectarXbox2() {
        adaptee.conectarPS5();
        System.out.println("Controle de um Xbox 2!");
    }
	
}
