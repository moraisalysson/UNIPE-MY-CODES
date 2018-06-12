package modelo;

/**
 * 
 * @author ALYSSON
 *
 */

public abstract class Contrato {

	private Cliente cliente;
	private Float valorImovel;
	
	public abstract Float obterValorSeguro(); 
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Float getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(Float valorImovel) {
		this.valorImovel = valorImovel;
	}
		
}