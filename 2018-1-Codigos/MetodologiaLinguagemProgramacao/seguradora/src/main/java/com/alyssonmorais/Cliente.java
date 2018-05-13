package com.alyssonmorais;

/**
 * 
 * @author ALYSSON
 *
 */

public class Cliente {
	
	private int codigo;
	private String nome;
	private TipoPessoa tipopessoa;
	
	public TipoPessoa getTipopessoa() {
		return tipopessoa;
	}

	public void setTipopessoa(TipoPessoa tipopessoa) {
		this.tipopessoa = tipopessoa;
	}

	public Cliente() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
