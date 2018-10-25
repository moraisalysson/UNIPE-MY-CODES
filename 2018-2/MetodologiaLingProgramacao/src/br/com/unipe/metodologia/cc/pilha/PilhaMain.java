package br.com.unipe.metodologia.cc.pilha;

import br.com.unipe.metodologia.cc.excecoes.*;

public class PilhaMain {
	public static void main(String[] args) throws AddException, RemoveException {
		Pilha <String> stack = new Pilha <String>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		stack.printEstrutura();
		System.out.println("Tamanho: " + stack.getTamanho());
		
		stack.pop();
		
		stack.printEstrutura();
		System.out.println("Tamanho: " + stack.getTamanho());	
	}
}
