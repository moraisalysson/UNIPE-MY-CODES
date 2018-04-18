package br.unipe.cc.exercicio01;

import java.util.Scanner;

public class Questao05 {
	private int TAM_LISTA = 10;
	private int[] lista = new int[TAM_LISTA];
	Scanner input = new Scanner(System.in);

/**
 * Método para receber os valores
 */
	
	public void inputValores() {
		System.out.printf("Informe 10 valores em uma única linha: ");
		for(int i = 0; i < lista.length; i++) {
			lista[i] = input.nextInt();
		}
		
		this.ordenaListaCrescente();
	}

/**
 * Método para ordenar a lista de forma crescente
 */
	
	private void ordenaListaCrescente() {
		int temp = 0;
		
		for(int i = 0; i < lista.length; i++) { 
			for(int j = i; j < lista.length; j++) {
				if(this.lista[i] > lista[j]) {
					temp = lista[i];
					lista[i] = lista[j];
					lista[j] = temp;
				}
			}
		}	
	}

/**
 * Método para imprimir a lista 
 */
	
	public void imprimeListaOrdenada() {
		for(int i = 0; i < lista.length; i++)
			System.out.printf("[%d] = %d%n", i, lista[i]);
	}

}
