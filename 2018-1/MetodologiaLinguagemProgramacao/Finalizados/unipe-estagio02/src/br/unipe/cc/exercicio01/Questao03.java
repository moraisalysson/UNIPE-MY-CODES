package br.unipe.cc.exercicio01;

import java.util.Scanner;

public class Questao03 {
	private int TAM_LISTA = 10;
	private int[] lista = new int[TAM_LISTA];
	Scanner input = new Scanner(System.in);

/**
 * M�todo para receber os valores que v�o ser inseridos no array
 */

	public void inputValores() {
		System.out.printf("Informe 10 valores em uma �nica linha: ");
		for(int i = 0; i < lista.length; i++) {
			lista[i] = input.nextInt();
		}
		
		this.ordenaListaCrescente();
	}

/**
 * M�todo para ordenar o array de forma crescente
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
 * M�todo para imprimir os valores da lista
 */
	public void imprimeListaOrdenada() {
		for(int i = 0; i < lista.length; i++)
			System.out.printf("[%d] = %d%n", i, lista[i]);
	}

/**
 * M�todo recursivo de busca bin�ria
 * @param inicio
 * @param fim
 * @param valorProcurado
 * @return int �ndice do valor procurado ou -1
 */
	
	public int buscaBinaria(int inicio, int fim, int valorProcurado) {
		int meio = 0;
		
		meio = inicio + (fim - inicio)/2;
		
		if(fim < inicio)
			return -1; //o elemento n�o est� na lista
		
		if(lista[meio] == valorProcurado)
			return meio; //retorna o �ndice do elemento procurado, quando achado
	
		else if(lista[meio] > valorProcurado)
			return buscaBinaria(inicio, meio - 1, valorProcurado); 
			//como o elemento procurado � MENOR que o do meio, ent�o a busca continua a ESQUERDA do vetor
	
		else
			return buscaBinaria(meio + 1, fim, valorProcurado);
			//como o elemento procurado � MAIOR que o do meio, ent�o a busca continua a DIREITA do vetor
	}

}

