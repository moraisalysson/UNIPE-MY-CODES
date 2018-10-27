package br.com.unipe.cc.estrutura.projeto.algortimosOrdenacao;

public class BubbleSort implements AlgoritmosOrdenacao {
	
	public void ordenar(int [] vetor) {
		int aux = 0;
		boolean swap;
		
		do {
			swap = false;
			
			for(int i = 0; i < (vetor.length - 1); i++) {
				if(vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					swap = true;
				}
			}
		} while(swap);

	}

}
