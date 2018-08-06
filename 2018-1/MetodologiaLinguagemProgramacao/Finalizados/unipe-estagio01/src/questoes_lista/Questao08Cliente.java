package questoes_lista;

public class Questao08Cliente {
	String nome;
	int quantidade_diaras;
	float valor_tarifa;
	float valor_conta;
	
	public void setNome(String nome_cliente) {
		this.nome = nome_cliente;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setQuantidadeDiarias(int quant_diarias) {
		if(quant_diarias < 0) {
			this.quantidade_diaras = 0;
		} 
		else {
			this.quantidade_diaras = quant_diarias;
		}
	}
	
	public int getQuantidadeDiarias() {
		return this.quantidade_diaras;
	}
	
	public void setValorTarifa(float tarifa) {
		this.valor_tarifa = tarifa;
	}
	
	public float getValorTarifa() {
		return this.valor_tarifa;
	}
	
	public void setValorConta(float valor_cliente) {
		this.valor_conta = valor_cliente;
	}
	
	
	
	public float getValorConta() {
		return this.valor_conta;
	}
}
