package br.com.unipe.cc.estrutura.projeto;

public class Testador {
	public static void main(String[] args) {
		int [] vetorTrinta;
		VetoresUtils vetorUtil = new VetoresUtils();
		AlgoritmosOrdenacao ordenacao = new AlgoritmosOrdenacao();
		
		vetorTrinta = vetorUtil.gerarVetor(30);
		
		vetorUtil.printVetor(vetorTrinta);
		
		ordenacao.bubbleSort(vetorTrinta);
		//ordenacao.selectionSort(vetorTrinta);
		//ordenacao.insertionSort(vetorTrinta);
		//ordenacao.mergeSort(vetorTrinta, 0, vetorTrinta.length - 1);
		ordenacao.quickSort(vetorTrinta, 0, vetorTrinta.length - 1);
		
		vetorUtil.printVetor(vetorTrinta);
	
	}
}
