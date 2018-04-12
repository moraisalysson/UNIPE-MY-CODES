package br.unipe.cc.exercicio01;

public class ClasseMain {

	public static void main(String[] args) {
	
		Questao01 q1 = new Questao01();
		Questao02 q2 = new Questao02();
		Questao03 q3 = new Questao03();
		
//questao01
		int TAM_ARRAY = 300;
		int[] m_array = new int[TAM_ARRAY];
			
		m_array = q1.populaArray(m_array, 45);		

//questao02
		q2.imprimeElementosArray(m_array);
		
//questão03
		
		q3.inputValores();
		q3.imprimeListaOrdenada();
		System.out.println("Valor 6 encontrado no índice: " + q3.buscaBinaria(0, 10, 6));
		
//questao04
		
//ordem alfabética
		
	String[] arrayStrings = new String[5];
	String tempString = " ";
				
	
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				if(arrayStrings[i].compareToIgnoreCase( arrayStrings[j]) > 0) {
					tempString = arrayStrings[i];
					arrayStrings[i] = arrayStrings[j];
					arrayStrings[j] = tempString;
				}
			}
		}
		
	}//fecha main

}//fecha classe
