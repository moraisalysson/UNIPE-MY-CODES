package com.alyssonmorais;

public enum TipoResidencia {
	
	CASA("Casa"),
	APARTAMENTO("Apartamento");
	
	private String tipo;
	
	private TipoResidencia(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
