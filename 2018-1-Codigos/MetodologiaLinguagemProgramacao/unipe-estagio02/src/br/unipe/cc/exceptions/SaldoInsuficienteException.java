package br.unipe.cc.exceptions;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException() {
		super("Sem saldo na conta");
	}
}
