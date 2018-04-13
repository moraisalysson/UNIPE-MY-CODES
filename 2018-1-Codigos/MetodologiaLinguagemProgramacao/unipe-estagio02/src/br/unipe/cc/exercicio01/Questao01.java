package br.unipe.cc.exercicio01;

/**
 * @author Morais, Alysson
 */


public class Questao01 {

/**
 * Método para popular o array com o valor informado no main
 * @param array
 * @param valor
 * @return int[] array inicializado
 */
	
	public int[] populaArray(int[] array, int valor) {

		for(int i = 0; i < array.length; i++)
			array[i] = valor;
		
		return array;
	}
}
