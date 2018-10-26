package br.com.unipe.cc.estrutura.projeto;

import java.util.Random;

public class VetoresUtils {
	Random sorteador;
	
	public VetoresUtils() {
		this.sorteador = new Random();
	}
	
	public int [] gerarVetor(int tamanho) {
		int [] vetor = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = sorteador.nextInt(tamanho);
		}
		
		return vetor;
	}
	
	public void printVetor(int [] vetor) {
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
	}
}
