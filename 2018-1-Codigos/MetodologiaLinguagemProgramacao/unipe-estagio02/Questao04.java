import java.util.Scanner;

public class Questao04 {
	Scanner input = new Scanner(System.in);
	String[] array = new String[10];
	
	public void inputStrings() {
		String entradas = new String();
		
		System.out.printf("Informe 10 nomes em uma única linha: ");
		entradas = input.nextLine();
		
		array = entradas.split(" ");
		
		this.ordenaArrayAlfabetica();
	}
	
	
	public void ordenaArrayAlfabetica() {
		String aux = " ";
		
		for(int i = 0; i < 10; i++) {
			for(int j = i; j < 10; j++) {
				if(array[i].compareToIgnoreCase( array[j]) > 0) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	
	public void imprimeListaOrdenada() {
		for(int i = 0; i < array.length; i++)
			System.out.printf("[%d] = %s%n", i, array[i]);
	}
	
}