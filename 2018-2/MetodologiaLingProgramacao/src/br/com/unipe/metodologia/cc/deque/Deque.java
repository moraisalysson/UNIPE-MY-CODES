package br.com.unipe.metodologia.cc.deque;

import java.util.LinkedList;

import br.com.unipe.metodologia.cc.excecoes.*;

public class Deque <T> {
	private LinkedList <T> deque;
	
	public Deque () {
		this.deque = new LinkedList<T>();
	}
	
	public boolean addInicio(T elemento) throws AddException {
		try {
			this.deque.addFirst(elemento);
			return true;
		}
		
		catch(Exception exection) {
			System.out.println("Erro ao adicionar. Tente novamente.");
			return false;
		}
	}
	
	public boolean addFim(T elemento) throws AddException {
		try {
			this.deque.addLast(elemento);
			return true;
		}
		
		catch(Exception exection) {
			System.out.println("Erro ao adicionar. Tente novamente.");
			return false;
		}
	}
	
	public boolean removeInicio() throws RemoveException {
		try {
			this.deque.removeFirst();
			return true;
		}
	
		catch(Exception exection) {
			System.out.println("Erro ao remover. Tente novamente.");
			return false;
		}	
	}
	
	public boolean removeFim() throws RemoveException {
		try {
			this.deque.removeLast();
			return true;
		}
	
		catch(Exception exection) {
			System.out.println("Erro ao remover. Tente novamente.");
			return false;
		}	
	}

	public int getTamanho() {
		return this.deque.size();
	}
	
	public void printEstrutura() {
		for(T elemento : this.deque) {
			System.out.println(elemento.toString());
		}
	}
}


