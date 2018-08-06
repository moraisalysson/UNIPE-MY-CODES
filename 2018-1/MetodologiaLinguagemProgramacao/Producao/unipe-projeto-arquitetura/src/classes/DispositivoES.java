package classes;

public class DispositivoES {
	private int valor;

	public int getValor() throws InterruptedException {
		Thread.sleep(5000);
		
		return valor;
	}

	public void setValor(int valor) throws InterruptedException {
		Thread.sleep(5000);
		
		this.valor = valor;
	}
}
