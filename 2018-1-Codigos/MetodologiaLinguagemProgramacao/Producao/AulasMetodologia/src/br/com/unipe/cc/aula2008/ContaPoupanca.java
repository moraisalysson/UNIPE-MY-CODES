package br.com.unipe.cc.aula2008;

public class ContaPoupanca extends Conta {
	
	private Float taxaRendimento;
	
	public Float debitar(Float valor) {
		this.setSaldo(this.getSaldo() - valor);
		return this.getSaldo();
	}
	
	public void creditaTaxaRendimento() {
		this.setSaldo( this.getSaldo() * (1.0f + this.getTaxaRendimento()) );
	}
	
	public Float getTaxaRendimento() {
		return taxaRendimento;
	}
	
	public void setTaxaRendimento(Float taxaRendimento) {
		if(taxaRendimento >= 0.0f)
			this.taxaRendimento = taxaRendimento;
	}

}
