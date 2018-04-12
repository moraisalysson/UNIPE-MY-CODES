import java.util.Scanner;

public class Questao03 {
	private int TAM_LISTA = 10;
	private int[] lista = new int[TAM_LISTA];
	Scanner input = new Scanner(System.in);
	
	public void inputValores() {
		System.out.printf("Informe 10 valores em uma única linha: ");
		for(int i = 0; i < lista.length; i++) {
			lista[i] = input.nextInt();
		}
		
		this.ordenaListaCrescente();
	}
	
	private void ordenaListaCrescente() {
		int temp = 0;
		
		for(int i = 0; i < lista.length; i++) { 
			for(int j = i; j < lista.length; j++) {
				if(this.lista[i] > lista[j]) {
					temp = lista[i];
					lista[i] = lista[j];
					lista[j] = temp;
				}
			}
		}	
	}
	
	
	/*
	public void imprimeListaOrdenada() {
		for(int i = 0; i < lista.length; i++)
			System.out.printf("[%d] = %d%n", i, lista[i]);
	}
	*/
	
	public int buscaBinaria(int inicio, int fim, int valorProcurado) {
		int meio = 0;
		
		meio = inicio + (fim - inicio)/2;
		
		if(fim < inicio)
			return -1; //o elemento não está na lista
		
		if(lista[meio] == valorProcurado)
			return meio; //retorna o índice do elemento procurado, quando achado
	
		else if(lista[meio] > valorProcurado)
			return buscaBinaria(inicio, meio - 1, valorProcurado); 
			//como o elemento procurado é MENOR que o do meio, então a busca continua a ESQUERDA do vetor
	
		else
			return buscaBinaria(meio + 1, fim, valorProcurado);
			//como o elemento procurado é MAIOR que o do meio, então a busca continua a DIREITA do vetor
	}

}
