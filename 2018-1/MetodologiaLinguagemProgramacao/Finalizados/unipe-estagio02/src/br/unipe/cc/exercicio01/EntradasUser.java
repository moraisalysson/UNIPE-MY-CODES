package br.unipe.cc.exercicio01;

import java.util.Scanner;

public class EntradasUser {
	
	public int getInteiro(String mensagem) {
		Scanner input = new Scanner(System.in);
		boolean error = true;
		int valor = 0;
		
		while(error) {
			try {
				System.out.print(mensagem);
				
				valor = input.nextInt(); 		
				
				error = false;
			}
			catch(Exception e) {
				System.out.println("Erro! Tente novamente.");
			}
		}
		
		input.close();
		
		return valor;
	}
}
