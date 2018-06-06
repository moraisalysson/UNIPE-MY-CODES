package modelo;

import tiposenums.TipoResidencia;
import tiposenums.Zona;

/**
 * 
 * @author ALYSSON
 *
 */

public class ContratoResidencial extends Contrato {

	private String endereco;
	private Zona zona;
	private TipoResidencia tipoResidencial;
	
	
	public Float obterValorSeguro() {
		return 0.0f;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public TipoResidencia getTipoResidencial() {
		return tipoResidencial;
	}
	public void setTipoResidencial(TipoResidencia tipoResidencial) {
		this.tipoResidencial = tipoResidencial;
	}
	
	
	
	
}