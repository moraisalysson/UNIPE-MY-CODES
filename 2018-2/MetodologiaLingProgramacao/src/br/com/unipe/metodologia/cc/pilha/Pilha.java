package br.com.unipe.metodologia.cc.pilha;

import java.util.LinkedList;

import br.com.unipe.metodologia.cc.excecoes.*;

public class Pilha <T> {
	private LinkedList <T> pilha;
	
	public Pilha () {
		this.pilha = new LinkedList<T>();
	}
	
	public boolean push(T elemento) throws AddException {
		try {
			this.pilha.addLast(elemento);
			return true;
		}
		
		catch(Exception exection) {
			System.out.println("Erro ao adicionar. Tente novamente.");
			return false;
		}
	}
	
	public T pop() throws RemoveException {
		T removido = null;
		
		try {
			removido = this.pilha.removeLast();
		}
	
		catch(Exception exection) {
			System.out.println("Erro ao remover. Tente novamente.");
		}	
		
		return removido;
	}

	public int getTamanho() {
		return this.pilha.size();
	}
	
	public void printEstrutura() {
		for(T elemento : this.pilha) {
			System.out.println(elemento.toString());
		}
	}
}
