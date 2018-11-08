package br.com.livro.cap18generics;

public class EmptyStackException189 extends RuntimeException {

	public EmptyStackException189() {
		
		this( "Stack is empty" );
		
	}
	
	public EmptyStackException189( String exception ) {
		
		super( exception );
		
	}
	
}
