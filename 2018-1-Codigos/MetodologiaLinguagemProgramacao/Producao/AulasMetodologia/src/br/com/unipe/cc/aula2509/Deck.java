package br.com.unipe.cc.aula2509;

import java.util.LinkedList;

/**
 * Implementa os prinpais métodos de um Deque usando LinkedList.
 * @author ALYSSON
 *
 * @param <O>
 */

public class Deck <O> {
	private LinkedList<O> deck;
	
	public Deck() {
		this.deck = new LinkedList<O>();
	}
	
	/**
	 * Adiciona um elemento ao início do deque
	 * @param elemento
	 */
	public void addElementBegin(O elemento) {
		this.deck.addFirst(elemento);
	}
	
	/**
	 * Adiciona um elemento ao final do deque
	 * @param elemento
	 */
	public void addElementLast(O elemento) {
		this.deck.addLast(elemento);
	}
	
	/**
	 * Remove o elemento do início do deque
	 * @return Object
	 */
	public void removeElementBegin() {
		this.deck.removeFirst();
	}
	
	/**
	 * Remove o elemento do final do deque
	 * @return Object
	 */
	public void removeElementLast() {
		this.deck.removeLast();
	}
	
	/**
	 * Retorna o elemento do índice informado
	 * @return Object
	 */
	public O getElement(int pos) {
		return this.deck.get(pos);
	}
	
	 /** Retorna a quantidade de elementos (tamanho) no deque
	 * @return int
	 */
	public int getSize() {
		return this.deck.size();
	}
		
	/**
	 * Esvazia o deque
	 */
	public void clear() {	
		this.deck.clear();
	}
}
