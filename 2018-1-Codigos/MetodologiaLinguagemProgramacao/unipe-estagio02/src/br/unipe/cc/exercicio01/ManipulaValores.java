package br.unipe.cc.exercicio01;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulaValores {
	public int[] inticializarVetor() {
		System.out.println("Incializando vetor");
		int valor = obterValor();
		int[] retorno = new int[valor];
		System.out.println("Vetor inicializado com " + valor + " elementos");
		
		return retorno;
	}
	
	public int[] preencherVetor(int[] vetor, int valor) {
		for(int cont = 0; cont < vetor.length; cont++) {
			vetor[cont] = valor;
		}
		
		//Arrays.fill(vetor, valor); <-- função da biblioteca pra fazer
		
		return vetor;
	}
	
	/**
	 * 
	 * @param vetor
	 * @param tipo 1 - For | 2 - While | 3 - ArraysToString
	 */
	
	public void imprimirVetor(int[] vetor, int tipo) {
		int i = 0;
		
		if(tipo == 1) {
			for(i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i]);
			}
		}
		
		if(tipo == 2) {
			i = 0;
			
			while(i < vetor.length) {
				System.out.println(vetor[i]);
				i++;
			}
		}
		
		if(tipo == 3) {
			System.out.println(Arrays.toString(vetor));
		}
	}
	
	public int consultarElemento(int[] vetor, int elementoBusca) {
		int i = 0;
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] == elementoBusca) {
				return i;
			}
		}
		return -1;
	}
	
	
	public int obterValor() {
		int valor = -1;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um núermo: ");
		
		while(true) {
			valor = leitor.nextInt();
			
			if(valor > 0)
				return valor;
			else
				System.out.println("Informe um valor maior que zero!!");
		}
		
	}

}
