public class Questao01 {
	public int[] populaArray(int array[], int valor) {

		for(int i = 0; i < array.length; i++)
			array[i] = valor;
		
		return array;
	}
}
