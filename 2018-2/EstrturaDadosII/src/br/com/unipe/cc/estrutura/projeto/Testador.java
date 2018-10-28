package br.com.unipe.cc.estrutura.projeto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;

import br.com.unipe.cc.estrutura.projeto.algortimosOrdenacao.*;
import br.com.unipe.cc.estrutura.projeto.persistencia.GerarCSV;

import java.util.TreeMap;

public class Testador {
	public static void main(String[] args) throws IOException {
		
		double somaTempoExecucao = 0;
		int [] vetor, vetorAuxiliar;
		int conclusao = 0;
		VetoresUtils vetorUtil = new VetoresUtils();
		TreeMap <Integer, Double> mapaMedias = new TreeMap<Integer, Double>();
		ArrayList <Integer> tamanhosVetores = new ArrayList<Integer>();
		TreeMap <String, AlgoritmosOrdenacao> algoritmos = new TreeMap <String, AlgoritmosOrdenacao>();
		GerarCSV file = new GerarCSV();
		
		tamanhosVetores.add(100);
		tamanhosVetores.add(1000);
		tamanhosVetores.add(5000);
		tamanhosVetores.add(10000);
		tamanhosVetores.add(50000);
		
		algoritmos.put("01 Bubble Sort", new BubbleSort());
		algoritmos.put("02 Insertion Sort", new InsertionSort());
		algoritmos.put("03 Selection Sort", new SelectionSort());
		algoritmos.put("04 Merge Sort", new MergeSort());
		algoritmos.put("05 Quick Sort", new QuickSort());
		
		file.gerarCSVFile();
		
		System.out.println("Testes iniciados. Aguarde confirmação para verificar o arquivo.\n");
		System.out.print("Conclusão: ");
		
		for(Entry<String, AlgoritmosOrdenacao> algoritmo : algoritmos.entrySet()) {
			
			System.out.printf("%d%%... ", conclusao);
			
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
			
			conclusao += 20;
					
			file.addDataCSVFile( mapaMedias, algoritmo.getKey() );
			
		}
		
		System.out.printf("100%\n\n");
		file.fechar();
	}
}
