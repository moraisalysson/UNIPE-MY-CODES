package br.com.unipe.cc.aula2008;

public abstract class Conta {
	
	protected String numero;
	protected Float saldo;
	
	public Conta() {
		super();
		this.saldo = 0.0f;
	}
	
	public void exibirMensagem() {
		System.out.println("Bem vindo a sua conta!");
	}
	
	public abstract Float debitar(Float valorDebito);
	
	public int creditar(Float valorCredito) {
	
		if(valorCredito < 0.0f)
			return 0;
		
			this.setSaldo( this.getSaldo() + valorCredito );
			return 1;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	protected void setSaldo(Float saldo) {
		this.saldo = saldo; 
	}
	
	public Float getSaldo() {
		return this.saldo;
	}

}

