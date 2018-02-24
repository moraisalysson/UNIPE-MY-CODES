<<<<<<< HEAD
//aula 02 - pág 46

package aula02exercicio05;

import java.util.Scanner;

public class IdadeUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ano_atual,
			ano_nascimento;
		
		System.out.print("Informe o ano atual: ");
		ano_atual = input.nextInt();
		
		System.out.print("Informe seu ano de nascimento: ");
		ano_nascimento = input.nextInt();
		
		System.out.println("Idade: " + getIdade(ano_atual, ano_nascimento));
	}
	
	public static int getIdade(int ano_atual, int ano_nascimento) {
		return ano_atual - ano_nascimento;
	}
}
=======
//aula 02 - pág 46

package aula02exercicio05;

import java.util.Scanner;

public class IdadeUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ano_atual,
			ano_nascimento;
		
		System.out.print("Informe o ano atual: ");
		ano_atual = input.nextInt();
		
		System.out.print("Informe seu ano de nascimento: ");
		ano_nascimento = input.nextInt();
		
		System.out.println("Idade: " + getIdade(ano_atual, ano_nascimento));
	}
	
	public static int getIdade(int ano_atual, int ano_nascimento) {
		return ano_atual - ano_nascimento;
	}
}
>>>>>>> 5af0a005f9f9ffe065e14fcb4bb56b12d9ca1185
