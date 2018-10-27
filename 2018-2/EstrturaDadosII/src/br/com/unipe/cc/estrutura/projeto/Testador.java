package br.com.unipe.cc.estrutura.projeto;

import java.util.ArrayList;
import java.util.Map.Entry;

import br.com.unipe.cc.estrutura.projeto.algortimosOrdenacao.*;

import java.util.TreeMap;

public class Testador {
	public static void main(String[] args) {
		
		double somaTempoExecucao = 0;
		int [] vetor, vetorAuxiliar;
		VetoresUtils vetorUtil = new VetoresUtils();
		TreeMap <Integer, Double> mapaMedias = new TreeMap<Integer, Double>();
		ArrayList <Integer> tamanhosVetores = new ArrayList<Integer>();
		TreeMap <String, AlgoritmosOrdenacao> algoritmos = new TreeMap <String, AlgoritmosOrdenacao>();
		
		tamanhosVetores.add(100);
		tamanhosVetores.add(1000);
		tamanhosVetores.add(5000);
		tamanhosVetores.add(10000);
		tamanhosVetores.add(50000);
		
		algoritmos.put("Quick Sort", new QuickSort());
		algoritmos.put("Merge Sort", new MergeSort());
		algoritmos.put("Selection Sort", new SelectionSort());
		algoritmos.put("Insertion Sort", new InsertionSort());
		algoritmos.put("Bubble Sort", new BubbleSort());
		
		System.out.printf("Algoritmo\t100\t1.000\t5.000\t10.000\t50.000%n");
		
		for(Entry<String, AlgoritmosOrdenacao> algoritmo : algoritmos.entrySet()) {
			
			System.out.printf("%s\t", algoritmo.getKey());
			
			for(int tamanho : tamanhosVetores) {
				
				somaTempoExecucao = 0;
				
				for(int i = 1; i <= 30; i++) {
					
					vetor = vetorUtil.gerarVetor(tamanho);
					
					vetorAuxiliar = vetor.clone();
					
					long tempoInicial = System.currentTimeMillis();
					algoritmo.getValue().ordenar(vetorAuxiliar);
					long tempoFinal = System.currentTimeMillis();
					
					double tempoExecucao = ( ( tempoFinal - tempoInicial ) / 1000.0 );
					
					somaTempoExecucao += tempoExecucao;
				
				}
				
				mapaMedias.put(tamanho, (somaTempoExecucao / 30));
			}
			
			for (Entry<Integer, Double> medias : mapaMedias.entrySet()) {
				   System.out.printf("%.2f\t", medias.getValue());
			}
			
			System.out.println();
		
		}
		
	}
}
