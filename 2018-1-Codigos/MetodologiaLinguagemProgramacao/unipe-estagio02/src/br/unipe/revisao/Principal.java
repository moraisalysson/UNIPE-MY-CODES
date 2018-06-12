package br.unipe.revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author MORAIS, ALYSSON
 */

public class Principal {

	public static void main(String[] args) {
		Arrays[] array_teste = new Arrays[5];
		Scanner input = new Scanner(System.in);
		int i, idade, zero;
		i = idade = zero = 0;
		
		System.out.print("Precione ENTER para começar: ");
		while(i < 5) {
			try {
				array_teste[i] = new Arrays();
				
				input.nextLine(); //limpa o buffer. fica aguardando alguma entrada do user na primeira iteração.
				
				System.out.print("Informe sua idade: ");
				
				idade = input.nextInt();
				
				System.out.print("Digite zero: ");
				
				zero = input.nextInt();
								
				array_teste[i].setValor(idade);
				
				zero = array_teste[i].getValor() / zero;
				
				i++;
			}
			
			catch (NullPointerException e) {
				System.out.println(">>> Você esqueceu de instanciar os objetos do array.");
			}
			
			catch (InputMismatchException e) {
				System.out.println(">>> Informe apenas valores inteiros.");
			}
			
			catch (Exception e) {
				System.out.println(">>> Ocorreu um erro inesperado.");
			}
		}
		
		for(i = 0; i < 5; i++)
			System.out.printf("[%d]=%d ", i, array_teste[i].getValor()); 
		
		input.close();
	}

}
