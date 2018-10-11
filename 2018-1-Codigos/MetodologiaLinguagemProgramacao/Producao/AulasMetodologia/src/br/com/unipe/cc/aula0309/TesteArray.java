package br.com.unipe.cc.aula0309;

import java.util.Arrays;

public class TesteArray {

	public static void main() {
		int[] a = new int[10];
		int[] copia = new int[10];
		int pos = 0;
		
		//preenche
		for(pos = 0; pos < 10; pos++)
			java.util.Arrays.fill(a, pos, pos + 1, pos);
		
		for(pos = 0; pos < 10; pos++)
			copia = java.util.Arrays.copyOf(a, 10);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(copia));
		
	}

}
