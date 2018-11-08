package br.com.livro.cap18generics;

public class FullStackException188 extends RuntimeException {
	
	public FullStackException188() {
		
		this( "Stack is full ");
		
	}

	public FullStackException188( String exception ) {
		
		super( exception );
		
	}
	
	
}
