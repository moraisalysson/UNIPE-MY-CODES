package adaptadores;
import sensores.SensorPS5;
import sensores.SensorXbox2;

public class AdaptadorPS5ParaXbox2 extends SensorPS5  {
	
    private SensorXbox2 adaptee;

    public AdaptadorPS5ParaXbox2(SensorXbox2 adaptee) {
        this.adaptee = adaptee;
    }

    //Override da solicitação
    public void conectarPS5() {
        adaptee.conectarXbox2();
        System.out.println("Controle de um PlayStation");
    }
}
