package br.com.unipe.cc.estrutura.projeto.algortimosOrdenacao;

public class InsertionSort implements AlgoritmosOrdenacao {
	
	public void ordenar(int [] vetor) {
		int aux = 0, j = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			
			while(j >= 0 && aux < vetor[j]) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			
			vetor[j + 1] = aux;
		}
		
	}
}
