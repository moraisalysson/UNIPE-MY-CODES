package adaptadores;
import sensores.SensorNintendo64;
import sensores.SensorXbox2;

public class AdaptadorNintendo64ParaXbox2 extends SensorNintendo64 {
	
    private SensorXbox2 adaptee;

    public AdaptadorNintendo64ParaXbox2(SensorXbox2 adaptee) {
        this.adaptee = adaptee;
    }

    //Override da solicitação 
    public void conectarNintendo64() {
        adaptee.conectarXbox2();
        System.out.println("Controle de um Nintendo64!");
    }
	
}
