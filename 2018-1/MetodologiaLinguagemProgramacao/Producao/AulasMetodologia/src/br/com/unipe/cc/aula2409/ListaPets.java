package br.com.unipe.cc.aula2409;

import java.util.ArrayList;
import java.util.List;

public class ListaPets <T>{
	private List<T> pets;
	
	public ListaPets() {
		this.pets = new ArrayList<T>();
	}
	
	public void addNomes(T elemento) {
		this.pets.add(elemento);
	}
	
	public void listarNomes() {
		for(T elemento : this.pets)
			System.out.println(elemento);
	}
	
	public int qtdNomes() {
		return this.pets.size();
	}
	
	public T getNome(int posicao) {
		return this.pets.get(posicao);
	}
	
	public int getSize() {
		return this.pets.size();
	}

}
