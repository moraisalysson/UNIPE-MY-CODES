package br.com.unipe.cc.aula2008;

public class ContaCorrente extends Conta {
	
	private Float taxaManutencao;
	
	public Float debitar(Float valor) {
		this.setSaldo(this.getSaldo() - valor);
		return this.getSaldo();
	}

	public void debitarTaxaManutencao() {
		this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
	}
	
	public Float getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Float taxaManutencao) {
		if(taxaManutencao >= 0.0f)
			this.taxaManutencao = taxaManutencao;
	}
	
}
