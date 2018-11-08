package br.com.livro.cap18generics;

//fig 18.10, pág 656/658
public class StackTest1810 {

	private double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
	private int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 		
	private Stack187 < Double > doubleStack;
	private Stack187 < Integer > integerStack;
	
	public void testStacks() {
	
		this.doubleStack = new Stack187 < Double >( 5 );
		this.integerStack = new Stack187 < Integer >( 10 );
		
		this.testPushDouble();
		this.testPopDouble();
		this.testPushInteger();
		this.testPopInteger();
		
	}
	
	public void testPushDouble() {
		
		try {
			
			System.out.println( "\nPushing elements into doubleStack" );
			
			for( double element : this.doubleElements ) {
				
				System.out.printf( "%.1f ", element );
				this.doubleStack.push( element );
				
			}	
		}
		
		catch ( FullStackException188 fullStackException ) {
			
			System.err.println();
			fullStackException.printStackTrace();
			
		}
	}
	
	public void testPopDouble() {
		
		try {
			
			System.out.println( "\nPopping elements from doubleStack" );
			double popValue;
			
			while( true ) {
				
				popValue = this.doubleStack.pop();
				System.out.printf( "%.1f ", popValue );
				
			}	
		
		}
		
		catch ( EmptyStackException189 emptyStackException ) {
			
			System.err.println();
			emptyStackException.printStackTrace();
			
		}
		
	}
	
	public void testPushInteger() {
		try {
			
			System.out.println( "\nPushing elements onto intStack" );
			
			for( int element : this.integerElements ) {
				
				System.out.printf( "%d ", element );
				this.integerStack.push( element );
				
			}	
		}
		
		catch ( FullStackException188 fullStackException ) {
			
			System.err.println();
			fullStackException.printStackTrace();
			
		}
	}
	
	public void testPopInteger	() {
		
		try {
			
			System.out.println( "\nPopping elements from intStack" );
			int popValue;
			
			while( true ) {
				
				popValue = this.integerStack.pop();
				System.out.printf( "%d ", popValue );
				
			}	
		
		}
		
		catch ( EmptyStackException189 emptyStackException ) {
			
			System.err.println();
			emptyStackException.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) {

		StackTest1810 application = new StackTest1810();
		
		application.testStacks();
		
	}

}
