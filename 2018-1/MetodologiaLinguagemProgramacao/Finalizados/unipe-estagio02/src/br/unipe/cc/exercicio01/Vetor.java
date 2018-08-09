package br.unipe.cc.exercicio01;

/**
 * @author Morais, Alysson
 */

public class Vetor {
	int[] vetor;

	public int defineTamVetor() {
		EntradasUser entrada = new EntradasUser();
		
		return entrada.getInteiro("Informe quantos valores deseja guardar: ");
	}

	public void criaVetor(int tam) {
		this.vetor = new int[tam];
	}
	
	public void populaVetor(int valor) {

		for(int i = 0; i < vetor.length; i++)
			vetor[i] = valor;
	}
	
	public int[] getVetor() {
		return vetor;
	}
}
