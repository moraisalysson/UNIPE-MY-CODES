package br.com.unipe.cc.revisao02;

import java.util.TreeMap;

public class Questoes<T, K> {
	private TreeMap<T, K> tm;
	
	public Questoes() {
		this.tm = new TreeMap<T, K>();
	}
	
	public void inserirQuestao(T questao, K resposta) {
		this.tm.put(questao, resposta);
	}
	
	public K getRespostaQuestao(T questao) {
		return this.tm.get(questao);
	}
	
	public int getQntdQuestoes() {
		return this.tm.size();
	}
	
	public void printGabarito() {
		System.out.printf("Questão\tResposta%n");
		
		for(int i = 1; i <= this.getQntdQuestoes(); i++) {
			System.out.printf("%d\t%s%n", i, this.tm.get(i));
		}
	}
}
