package br.com.unipe.cc.aula2509;

import java.util.Scanner;

import br.com.unipe.cc.aula2409.PessoaFisica;
import br.com.unipe.cc.aula2409.Pet;
import br.com.unipe.cc.aula2509.menus.MainMenu;

public class Main2509 {
	public static void main(String[] args) {
		MainMenu main_menu = new MainMenu();
		Queue <Pet> fila_pets = new Queue <Pet>();
		Queue <PessoaFisica> fila_pessoas = new Queue <PessoaFisica>();
		
		main_menu.printMenu();
		
		Scanner input = new Scanner(System.in);
		String temp = "";
		
		while(true) {
			System.out.print("Add pessoa (0) ou pet (1)? ");
			
			temp = input.nextLine();
			int opcao = Integer.parseInt(temp);
			
			if(opcao == 0) {
				System.out.print("Nome: ");
				String nome = input.nextLine();
				
				System.out.print("CPF: ");
				String cpf = input.nextLine();
				
				System.out.print("Idade: ");
				temp = input.nextLine();
				int idade = Integer.parseInt(temp);
				
				PessoaFisica pessoa = new PessoaFisica(cpf, nome, idade);
				
				fila_pessoas.addElement(pessoa);		
			} 
			
			else if(opcao == 1) {
				System.out.print("Nome do pet: ");
				String nome = input.nextLine();
				
				System.out.print("CPF do dono: ");
				String cpf_dono = input.nextLine();
				
				System.out.print("Idade: ");
				temp = input.nextLine();
				int idade = Integer.parseInt(temp);
				
				Pet pet = new Pet(cpf_dono, nome, idade);
				
				fila_pets.addElement(pet);
			}
			
			System.out.print("Continuar (s ou n)? ");
			String cont = input.nextLine();
			
			if(cont.equalsIgnoreCase("n"))
				break;
		}
		
		
		for(int i = 0; i < fila_pessoas.getSize(); i++) {
			System.out.println("Nome: " + fila_pessoas.getElement(i).getNome());
			System.out.println("CPF: " + fila_pessoas.getElement(i).getCpf());
			System.out.println("Idade: " + fila_pessoas.getElement(i).getIdade());
		}
		
		for(int i = 0; i < fila_pets.getSize(); i++) {
			System.out.println("Nome: " + fila_pets.getElement(i).getNome());
			System.out.println("CPF do dono: " + fila_pets.getElement(i).getCpfDono());
			System.out.println("Idade: " + fila_pets.getElement(i).getIdade());
		}
	
	}
}
