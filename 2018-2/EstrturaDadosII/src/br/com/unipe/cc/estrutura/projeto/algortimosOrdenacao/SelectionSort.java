package br.com.unipe.cc.estrutura.projeto.algortimosOrdenacao;

public class SelectionSort implements AlgoritmosOrdenacao {
	
	public void ordenar(int [] vetor) {
		int aux = 0, min = 0;
					
		for(int i = 0; i < vetor.length; i++) {
			min = i;
			
			for(int proximo = (i + 1); proximo < vetor.length; proximo++) {
				if(vetor[proximo] < vetor[min]) {
					min = proximo;
				}
			}
			aux = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = aux;
		}

	}
	
}
