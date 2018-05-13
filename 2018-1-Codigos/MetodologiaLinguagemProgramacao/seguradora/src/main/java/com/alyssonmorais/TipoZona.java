package com.alyssonmorais;

/**
 * 
 * @author ALYSSON
 *
 */

public enum TipoZona {

	URBANA(1, "Zona Urbana"),
	SUBURBANA(2, "Zona Suburbana"),
	RURAL(3, "Zona Rural");
	
	private int codigo;
	private String descricao;
	
	private TipoZona(int codigo, String descricao) {
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
