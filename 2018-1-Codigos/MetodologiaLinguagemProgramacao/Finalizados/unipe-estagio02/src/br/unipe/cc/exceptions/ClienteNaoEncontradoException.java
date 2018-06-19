package br.unipe.cc.exceptions;

public class ClienteNaoEncontradoException extends Exception {
	
	public ClienteNaoEncontradoException() {
		super("Cliente nao encontrado.");
	}

}
