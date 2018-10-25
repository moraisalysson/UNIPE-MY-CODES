package br.com.unipe.metodologia.cc.fila;

import br.com.unipe.metodologia.cc.excecoes.*;

public class FilaMain {
	public static void main(String[] args) throws AddException, RemoveException {
		Fila <String> queue = new Fila <String>();
		
		queue.add("A");
		queue.add("B");
		queue.add("C");
		
		queue.printEstrutura();
		System.out.println("Tamanho: " + queue.getTamanho());
		
		queue.remove();
		
		queue.printEstrutura();
		System.out.println("Tamanho: " + queue.getTamanho());		
	}
}
