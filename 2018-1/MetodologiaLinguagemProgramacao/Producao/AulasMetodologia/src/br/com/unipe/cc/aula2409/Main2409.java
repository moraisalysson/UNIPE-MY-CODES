package br.com.unipe.cc.aula2409;

import java.util.Scanner;

public class Main2409 {

	public static void main(String[] args) {
		ListaPessoas<PessoaFisica> lista_pessoas = new ListaPessoas<PessoaFisica>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Informe um nome: ");
			String nome = input.nextLine();
			
			if(nome.equals("parar"))
				break;			
		}
		
	
		System.out.println("Quantidade de nomes cadastados: " + lista_pessoas.getSize());
	}


}
