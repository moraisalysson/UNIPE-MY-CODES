package br.com.unipe.cc.estrutura.projeto;

public class AlgoritmosOrdenacao {
		
	//bubble
	public void bubbleSort(int [] vetor) {
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
	
	//selection
	public void selectionSort(int [] vetor) {
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

	//insertion
	public void insertionSort(int [] vetor) {
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
	
	//merge
	public void mergeSort(int [] vetor, int inicio, int fim) {
		int meio = 0;
		
		if(inicio < fim) { 
			meio = (inicio + fim) / 2;
			
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio + 1, fim);
			this.intercala(vetor, inicio, meio, fim);
		}
	}
 	
	private void intercala(int [] vetor, int inicio, int meio, int fim) {
		int posLivre, inicio_vetor1, inicio_vetor2, i, tam_vetor_aux;
		
		tam_vetor_aux = fim - inicio + 1;
		
		int [] aux = new int[tam_vetor_aux];
		
		inicio_vetor1 = inicio;
		inicio_vetor2 = meio + 1;
		posLivre = 0;
		i = 0;
		
		while(inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
			
			if(vetor[inicio_vetor1] < vetor[inicio_vetor2]) {
				aux[posLivre] = vetor[inicio_vetor1];
				inicio_vetor1++;
			}
			
			else {
				aux[posLivre] = vetor[inicio_vetor2];
				inicio_vetor2++;
			}
			
			posLivre++;
		}
		
		for(i = inicio_vetor1; i <= meio; i++) {
			aux[posLivre] = vetor[i];
			posLivre++;
		}
		
		for(i = inicio_vetor2; i <= fim; i++) {
			aux[posLivre] = vetor[i];
			posLivre++;
		}
		
		for(i = inicio; i <= fim; i++) {
			vetor[i] = aux[i - inicio];
		}
		
	}
	
	//quick
	public void quickSort(int [] vetor, int inicio, int fim) {
		int meio = 0;
		
		if(inicio < fim) {
			
			meio = this.particao(vetor, inicio, fim);
			quickSort(vetor, inicio, meio);
			quickSort(vetor, meio + 1, fim);
		
		}
		
	}
	
	private int particao(int [] vetor, int inicio, int fim) {
		int pivo, i, j;
		
		pivo = vetor[fim];
		i = inicio - 1;
		
		for(j = inicio; j < fim; j++) {
			
			if(vetor[j] < pivo) {
				i++;
				troca(vetor, i, j);
			}
			
		}
		
		if(vetor[fim] < vetor[i + 1]) {
			troca(vetor, i + 1, fim);
		}
		
		return j + 1;
	}

	
}
