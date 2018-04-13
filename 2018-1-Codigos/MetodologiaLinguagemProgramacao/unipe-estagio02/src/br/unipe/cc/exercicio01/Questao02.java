package br.unipe.cc.exercicio01;

/**
 * @author Morais, Alysson
 */

public class Questao02 {

/**
 * Método com 3 modos diferentes de imprimir os elementos do array
 * @param array
 */
	
	public void imprimeElementosArray(int[] array) {
		int i = 0;
		
		for(i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	
		System.out.println(); //pra pular uma linha
		
		i = 0;
		while(i < array.length) {
			System.out.print(array[i] + " ");
			i++;
		}
		
		System.out.println(); //pra pular uma linha
		
		for(int valor: array)
			System.out.print(valor + " ");
		
		System.out.println(); //pra pular uma linha
		
		recursiva(array, 0);
		
		System.out.println(); //pra pular uma linha
	}

/**
 * Método recursivo (extra) que também imprime os elementos do array
 * @param array
 * @param cont
 */

	public void recursiva(int[] array, int cont) {
	    System.out.print(array[cont] + " ");
		cont++;
		if(cont < array.length)
			recursiva(array, cont);
	}
}
