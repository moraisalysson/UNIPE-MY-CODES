package br.com.unipe.cc.aula2108p2;

import br.com.unipe.cc.aula2008.Conta;

public class ListaConta implements Lista<Conta> {
	
	//falta implementar os shifts pra esquerda (remove) e pra direita (add)
	
	protected Conta lista [] = new Conta[10];
	protected int n; //último elemento
	
	public ListaConta() {
		this.n = -1;
		
		for(int i = 0; this.lista[i] != null; i++) {
			this.lista[this.getTamanho() + 1] = (Conta) new Object();
		}
	}
	
	@Override
	public void add(Conta elemento) {
		if( (this.n + 1) < this.lista.length )			
			this.lista[this.n + 1] = elemento;
			this.n++;
	}

	@Override
	public Conta remove(int pos) {
		Conta elemento_removido;
		
		if(pos < 0 || pos > this.n)
			return null;
		
		elemento_removido = this.lista[pos];
		
		this.lista[pos] = null;
		
		this.n--;
		
		return elemento_removido;
	}

	@Override
	public int getTamanho() {		
		return (this.n + 1);
	}

	@Override
	public Conta[] listarTodos() {
		return this.lista;
	}
	
}
