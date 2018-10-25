package br.com.unipe.metodologia.cc.deque;

import br.com.unipe.metodologia.cc.excecoes.*;

public class DequeMain {
	public static void main(String[] args) throws AddException, RemoveException {
		Deque <String> deck = new Deque<String>();
		
		deck.addInicio("A");
		deck.addInicio("B");
		deck.addFim("C");
		deck.addFim("D");

		deck.printEstrutura();
		System.out.println("Tamanho: " + deck.getTamanho());
		
		deck.removeInicio();
		deck.removeFim();

		deck.printEstrutura();
		System.out.println("Tamanho: " + deck.getTamanho());		
	}
	
}
