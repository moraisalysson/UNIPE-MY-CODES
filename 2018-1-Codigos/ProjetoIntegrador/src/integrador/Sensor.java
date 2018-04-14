package integrador;

abstract class Sensor {
	private String modelo;
	private String marca;
	private boolean itsOn;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isItsOn() {
		return itsOn;
	}
	public void setItsOn(boolean itsOn) {
		this.itsOn = itsOn;
	}
	
	
	
}
