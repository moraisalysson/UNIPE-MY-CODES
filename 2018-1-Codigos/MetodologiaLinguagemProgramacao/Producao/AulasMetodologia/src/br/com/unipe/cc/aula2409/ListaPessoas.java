package br.com.unipe.cc.aula2409;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas<T> {
	
	private List<T> pessoas;
	
	public ListaPessoas() {
		this.pessoas = new ArrayList<T>();
	}
	
	public void addNomes(T pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public void listarNomes() {
		for(T s : this.pessoas)
			System.out.println(s);
	}
	
	public int qtdNomes() {
		return this.pessoas.size();
	}
	
	public T getNome(int posicao) {
		return this.pessoas.get(posicao);
	}
	
	public int getSize() {
		return this.pessoas.size();
	}
	
}
