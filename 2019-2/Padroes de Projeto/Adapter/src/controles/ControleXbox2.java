package controles;

import sensores.SensorXbox2;

public class ControleXbox2 {
	private SensorXbox2 sensorAQueSeConecta;
	
	public void Conectar(SensorXbox2 sensor) {
		this.sensorAQueSeConecta = sensor;
		sensorAQueSeConecta.conectarXbox2();
	}

}
