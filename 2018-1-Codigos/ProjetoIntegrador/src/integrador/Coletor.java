package integrador;

public class Coletor {
	private int id;
	private String nome;
	private double latitude;
	private double longitude;
	private boolean isFull;
	private SensorCapacitivo sensCapacitivo = new SensorCapacitivo();
	private SensorIndutivo sensIndutivo = new SensorIndutivo();
	private SensorCarga sensCarga = new SensorCarga();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public boolean isFull() {
		return isFull;
	}
	
	public void setIsFull(boolean isFull) {
		this.isFull = isFull;
	}
	
	public void getSituacaoSensores() {
		System.out.println("Capacitivo OK: " + this.sensCapacitivo.isItsOn());
		System.out.println("Indutivo OK: " + this.sensIndutivo.isItsOn());
		System.out.println("Carga OK: " + this.sensCarga.isItsOn());
	}
	
}
