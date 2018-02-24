//aula 02 - slide 45

package aula02exercicio03;

import java.util.Scanner;

public class Soma2Numeros {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.print("1º valor: ");
		valor1 = input.nextInt();
		
		System.out.print("2º valor: ");
		valor2 = input.nextInt();
		
		System.out.println("Soma: " + getSoma(valor1, valor2));
	}
	
	public static int getSoma(int n1, int n2) {
		return n1 + n2;
	}
}
