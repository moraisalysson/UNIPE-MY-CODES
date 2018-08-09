package integrador;

abstract class Sensor {
	private String modelo;
	private String fabricante;
	private double intensidade;
	private boolean itsOn;
	
	public int leituraMaterial() {
		return 0; //so para não ficar dando erro
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(double intensidade) {
		this.intensidade = intensidade;
	}

	public boolean isItsOn() {
		return itsOn;
	}

	public void setItsOn(boolean itsOn) {
		this.itsOn = itsOn;
	}
	
	
	
}
