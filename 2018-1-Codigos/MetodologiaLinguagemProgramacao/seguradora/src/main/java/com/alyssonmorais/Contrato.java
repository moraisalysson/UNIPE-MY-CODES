package com.alyssonmorais;

/**
 * 
 * @author ALYSSON
 *
 */

public abstract class Contrato  {
	
	private Cliente cliente;
	private float valorImovel;
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float getValorImovel() {
		return valorImovel;
	}
	
	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}
	
}
