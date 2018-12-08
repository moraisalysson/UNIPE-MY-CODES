package br.com.unipe.metodologia.cc.aula1911.q06;

public class Conta implements Runnable {

	private double saldo;

	public void run() {
				
		try {
		this.sacar(50);
		this.depositar(100);
		
		this.sacar(25);
		this.depositar(500);
		
		this.sacar(520);
		this.depositar(100);
		
		this.sacar(25);
		this.depositar(50);
		
		Thread.sleep(2000);
		
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Conta(double saldoInicial) {
		
		this.saldo = saldoInicial;
	
	}
	
	public void sacar(double valorSaque) {
		
		this.saldo -= valorSaque;
		
	}
	
	public void depositar(double valorDeposito) {
		
		this.saldo += valorDeposito;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}
