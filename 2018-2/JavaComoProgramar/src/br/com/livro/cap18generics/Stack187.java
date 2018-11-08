package br.com.livro.cap18generics;

//fig 18.7, pág. 654
public class Stack187 <E> {

	private final int size;
	private int top;
	private E[] elements;
	
	public Stack187() {
		
		this( 10 );
		
	}
	
	public Stack187(int s) {
		
		this.size = ( s > 0 ? s : 10 );
		this.top = -1;
		
		this.elements = ( E[] ) new Object[ this.size ]; 
	}
	
	public void push( E pushValue ) {
		
		if( this.top == this.size - 1 )
			
			throw new FullStackException188( String.format( "Stack is full, cannot push %s", pushValue ) );
			
		this.elements[ ++this.top ] = pushValue;
	
	}
	
	public E pop() {
		
		if( this.top == -1 ) 
			
			throw new EmptyStackException189( "Stack is empty, cannot pop");
		
		return this.elements[ top-- ];
		
	}
}
