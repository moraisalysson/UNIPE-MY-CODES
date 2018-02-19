//aula 02 - slide 45

package aula02exercicio04;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		int idade;
		String nome;
	
		System.out.print("Digite seu nome: ");
		nome = input.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = input.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
