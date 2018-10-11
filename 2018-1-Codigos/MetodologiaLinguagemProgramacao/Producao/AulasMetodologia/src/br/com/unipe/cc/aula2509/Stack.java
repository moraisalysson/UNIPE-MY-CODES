package br.com.unipe.cc.aula2509;

import java.util.LinkedList;

/**
 * Implementa os principais métodos de uma Stack (Pilha) utilizando LinkedList.  
 * @author ALYSSON
 *
 * @param <O>
 */
public class Stack <O> {
	private LinkedList<O> stack;
	
	public Stack() {
		this.stack = new LinkedList<O>();
	}
	
	/**
	 * Adiciona um elemento ao topo da pilha
	 * @param elemento
	 */
	public void push(O elemento) {
		this.stack.addLast(elemento);
	}
	
	/**
	 * Retorna e remove o elemento do topo da pilha
	 * @return Object
	 */
	public O pop() {
		O elemento = this.stack.getLast();
		
		this.stack.removeLast();
		
		return elemento;
	}
	
	/**
	 * Retorna o elemento do índice informado
	 * @return <O>
	 */
	public O getElement(int pos) {
		return this.stack.get(pos);
	}
	
	/**
	 * Retorna a quantidade de elementos (tamanho) da fila
	 * @return int
	 */
	public int getSize() {
		return this.stack.size();
	}
	
	/**
	 * Esvazia a pilha
	 */
	public void clear() {
		this.stack.clear();
	}
	
}