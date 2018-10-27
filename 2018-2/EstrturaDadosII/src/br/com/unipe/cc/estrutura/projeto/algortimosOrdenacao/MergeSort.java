package br.com.unipe.cc.estrutura.projeto.algortimosOrdenacao;

public class MergeSort implements AlgoritmosOrdenacao {

	public void ordenar(int [] vetor) {
		
		this.mergeSort(vetor, 0, vetor.length - 1);
		
	}
	
	private void mergeSort(int [] vetor, int inicio, int fim) {
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
}
