package br.com.livro.cap18generics;


//fig 18.3, pág 649

public class OverloadedMethods {
	
	public static <E> void printArray( E[] inputArray ) {
		
		for( E element : inputArray) 
			System.out.printf( "%s ", element );
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
		
		System.out.println("Array integer contains: ");
		printArray( integerArray );
		
		System.out.println("\nArray double contains: ");
		printArray( doubleArray );
		
		System.out.println("\nArray character contains: ");
		printArray( characterArray );
	
	}
	
}
