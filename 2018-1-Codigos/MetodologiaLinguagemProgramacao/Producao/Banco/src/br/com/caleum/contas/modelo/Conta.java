package br.com.caleum.contas.modelo;

/**
 * Classe respons�vel por moldar as Contas do Banco
 * 
 * @author ALYSSON
 *
 */

public class Conta {

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	/**
	 * M�todo que incrementa o saldo.
	 * @param valor
	 */
	
	
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

}
