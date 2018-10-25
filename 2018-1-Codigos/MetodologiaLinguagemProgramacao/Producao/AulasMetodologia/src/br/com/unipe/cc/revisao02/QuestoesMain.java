package br.com.unipe.cc.revisao02;

public class QuestoesMain {

	public static void main(String[] args) {
		
		Questoes <Integer, String> que1 = new Questoes<Integer, String>();
		
		que1.inserirQuestao(1, "e");
		que1.inserirQuestao(2, "b");
		que1.inserirQuestao(3, "a");
		que1.inserirQuestao(4, "d");
		que1.inserirQuestao(5, "c");
		que1.inserirQuestao(6, "e");
		que1.inserirQuestao(7, "b");
		que1.inserirQuestao(8, "a");
		que1.inserirQuestao(9, "d");
		que1.inserirQuestao(10, "c");

		System.out.println(que1.getQntdQuestoes());
		que1.printGabarito();
	}

}
