package com.alyssonmorais;

/**
 * 
 * @author ALYSSON
 *
 */

public enum TipoRamo {
	COMERCIO(1, "Comercio"),
	INDUSTRIA(2, "Industrica"),
	AGROPECUARIA(3, "Agropecuaria");
	
	private int codigo;
	private String descricao;
	
	TipoRamo(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
