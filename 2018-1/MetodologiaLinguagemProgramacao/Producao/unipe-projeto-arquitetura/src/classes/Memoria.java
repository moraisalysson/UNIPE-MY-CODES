package classes;

public class Memoria {
	private int valor;

	public int getValor() throws InterruptedException {
		Thread.sleep(1000);
		
		return valor;
	}

	public void setValor(int valor) throws InterruptedException {
		Thread.sleep(1000);
		
		this.valor = valor;
	}
	
	
}
