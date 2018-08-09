package br.unipe.cc.exercicio01;

import java.util.Scanner;

public class Questao04 {
	Scanner input = new Scanner(System.in);
	String[] array = new String[10];

/**
 * M�todo para receber Strings
 */

	public void inputStrings() {		
		String entradas = new String();
		
		System.out.printf("Informe 10 nomes em uma �nica linha: ");
		entradas = input.nextLine();
		
		array = entradas.split(" ");
		
		this.ordenaArrayAlfabetica();
	}
	
/**
 * M�todo para ordendar o array em ordem alfab�tica
 */
	
	public void ordenaArrayAlfabetica() {
		String aux = " ";
		
		for(int i = 0; i < 10; i++) {
			for(int j = i; j < 10; j++) {
				if(array[i].compareToIgnoreCase( array[j]) > 0) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

/**
 * M�todo para imprimir a lista
 */
	
	public void imprimeListaOrdenada() {
		for(int i = 0; i < array.length; i++)
			System.out.printf("[%d] = %s%n", i, array[i]);
	}
	
}