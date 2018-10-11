package br.com.caelum.contas.modelo;

/**
 * Classe responsável por modelar as Contas do Banco
 * 
 * @author ALYSSON
 *
 */

public class Conta {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	/**
	 * Método que incrementa o saldo.
	 * @param valor
	 */

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return "Conta";
	}

}
