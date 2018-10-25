package br.com.unipe.metodologia.cc.fila;

import java.util.LinkedList;

import br.com.unipe.metodologia.cc.excecoes.*;

public class Fila <T> {
	private LinkedList <T> fila;
	
	public Fila () {
		this.fila = new LinkedList<T>();
	}
	
	public boolean add(T elemento) throws AddException {
		try {
			this.fila.addLast(elemento);
			return true;
		}
		
		catch(Exception exection) {
			System.out.println("Erro ao adicionar. Tente novamente.");
			return false;
		}
	}
	
	public boolean remove() throws RemoveException {
		try {
			this.fila.removeFirst();
			return true;
		}
	
		catch(Exception exection) {
			System.out.println("Erro ao remover. Tente novamente.");
			return false;
		}	
	}

	public int getTamanho() {
		return this.fila.size();
	}
	
	public void printEstrutura() {
		for(T elemento : this.fila) {
			System.out.println(elemento.toString());
		}
	}
}
