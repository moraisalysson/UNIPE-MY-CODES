package integrador;

public class Coletor {
	private int id;
	private String nome;
	private double latitude;
	private double longitude;
	private boolean isFull;
	private Sensor sensCapacitivo = new SensorCapacitivo();
	private Sensor sensIndutivo = new SensorIndutivo();
	private Sensor sensCarga = new SensorCarga();
	
	public Coletor() {
		this.sensCapacitivo.setItsOn(true);
		this.sensCarga.setItsOn(true);
		this.sensIndutivo.setItsOn(true);
		this.setFull(false);
	}
	
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

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public Sensor getSensCapacitivo() {
		return sensCapacitivo;
	}

	public void setSensCapacitivo(Sensor sensCapacitivo) {
		this.sensCapacitivo = sensCapacitivo;
	}

	public Sensor getSensIndutivo() {
		return sensIndutivo;
	}

	public void setSensIndutivo(Sensor sensIndutivo) {
		this.sensIndutivo = sensIndutivo;
	}

	public Sensor getSensCarga() {
		return sensCarga;
	}

	public void setSensCarga(Sensor sensCarga) {
		this.sensCarga = sensCarga;
	}

	public int getSituacaoSensores() {
		return 0;
	}
	
	public int identificaMaterial() {
		return 0;
	}
	
}
