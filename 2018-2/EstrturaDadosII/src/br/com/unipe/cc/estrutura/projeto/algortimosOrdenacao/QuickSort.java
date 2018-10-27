package br.com.unipe.cc.estrutura.projeto.algortimosOrdenacao;

public class QuickSort implements AlgoritmosOrdenacao {

	public void ordenar(int [] vetor) {
		
		this.quickSort(vetor, 0, vetor.length);
		
	}
	
	private void quickSort(int [] vetor, int inicio, int fim) {
		int meio = 0;
		
		if(inicio < fim - 1) {
			
			meio = this.particao(vetor, inicio, fim);
			this.quickSort(vetor, inicio, meio);
			this.quickSort(vetor, meio + 1, fim);
		
		}
		
	}
	
	private int particao(int [] vetor, int inicio, int fim) {
		int pivo, i, j;
		
		pivo = vetor[fim - 1];
		i = inicio - 1;
		
		for(j = inicio; j < (fim - 1); j++) {
			
			if(vetor[j] <= pivo) {
				i++;
				this.troca(vetor, i, j);
			}
			
		}
		
		this.troca(vetor, i + 1, fim - 1);
	
		return i + 1;	
	}

	private void troca(int [] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
	
}
