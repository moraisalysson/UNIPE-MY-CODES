//aula 02 - slide 41

package aula02exercicio01;

import java.util.Scanner;

public class Cervejas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtd_cervejas = 99;
		
		retiraGarrafas(qtd_cervejas);
		
		System.out.print("Deseja adicionar quantas garrafas de cerveja ao freezer? ");
		qtd_cervejas = input.nextInt();
		
		System.out.printf("%n");
		
		retiraGarrafas(qtd_cervejas);
	}
	
	public static void retiraGarrafas(int cervejas) {
		while(cervejas > 0) {
			if(cervejas == 1) {
				System.out.println(cervejas + " garrafa de cerveja no freezer.");
			} else {
				System.out.println(cervejas + " garrafas de cerveja no freezer.");
			}
			
			System.out.println("Pego uma garrafa, paço pra frente.");
			
			--cervejas;
			
			if(cervejas == 1) {
				System.out.printf("Agora temos " + cervejas + " garrafa de cerveja no freezer.%n%n");
			} else {
				System.out.printf("Agora são " + cervejas + " garrafas de cerveja no freezer.%n%n");
			}
		}
	}
}
