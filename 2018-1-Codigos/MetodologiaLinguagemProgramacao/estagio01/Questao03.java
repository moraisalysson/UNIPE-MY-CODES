package lista;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabuada = 0;
		
		while(true) {
			System.out.printf("Qual tabuada deseja exibir (-1 para parar)? ");
			tabuada = input.nextInt();
			
			if(tabuada == -1) { 
				break; 
			}
			
			for(int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d%n", tabuada, i, tabuada * i);
			}
			
			System.out.println();
		}
		
		System.out.println("Fechou");
		
		input.close();
	}
}
