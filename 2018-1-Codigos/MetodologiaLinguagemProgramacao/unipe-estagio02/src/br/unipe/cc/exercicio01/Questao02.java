package br.unipe.cc.exercicio01;

public class Questao02 {

	public void imprimeElementosArray(int array[]) {
		int i = 0;
		
		for(i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	
		System.out.println(); //pra pular uma linha
		
		i = 0;
		while(i < array.length) {
			System.out.print(array[i] + " ");
			i++;
		}
		
		System.out.println(); //pra pular uma linha
		
		for(int valor: array)
			System.out.print(valor + " ");
		
		System.out.println(); //pra pular uma linha
	}
}
