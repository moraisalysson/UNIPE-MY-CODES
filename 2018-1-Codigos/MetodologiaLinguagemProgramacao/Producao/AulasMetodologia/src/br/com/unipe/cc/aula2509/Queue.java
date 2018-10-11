package br.com.unipe.cc.aula2509;

import java.util.LinkedList;

/**
 * Implementa os principais m�todos de uma Queue (Fila) utilizando LinkedList.  
 * @author ALYSSON
 *
 * @param <O>
 */
public class Queue <O> {
	private LinkedList<O> queue;
	
	public Queue() {
		this.queue = new LinkedList<O>();
	}
	
	/**
	 * Adiciona um elemento ao in�cio da fila
	 * @param elemento
	 */
	public void addElement(O elemento) {
		this.queue.addLast(elemento);
	}
	
	/**
	 * Remove o elemento do in�cio da fila
	 * @return <O>
	 */
	public void removeElement() {
		this.queue.removeFirst();
	}
	
	/**
	 * Retorna o elemento do �ndice informado
	 * @return <O>
	 */
	public O getElement(int pos) {
		return this.queue.get(pos);
	}
	
	 /** Retorna a quantidade de elementos (tamanho) da fila
	 * @return int
	 */
	public int getSize() {
		return this.queue.size();
	}
	
	/**
	 * Esvazia a fila
	 */
	public void clear() {
		this.queue.clear();
	}
	
}