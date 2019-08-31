package controles;
import sensores.SensorPS5;

public class ControlePS5 {

    private SensorPS5 sensorAQueSeConecta;
    
    public void Conectar(SensorPS5 sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarPS5();
    }
}
