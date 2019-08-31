package controles;
import sensores.SensorNintendo64;

public class ControleNintendo64 {
	
	private SensorNintendo64 sensorAQueSeConecta;
    
    public void Conectar(SensorNintendo64 sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarNintendo64();
    }
}
