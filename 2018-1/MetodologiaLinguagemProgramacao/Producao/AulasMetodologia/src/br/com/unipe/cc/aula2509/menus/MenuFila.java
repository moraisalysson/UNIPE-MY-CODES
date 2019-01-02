package br.com.unipe.cc.aula2509.menus;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MenuFila {
	private Scanner input = new Scanner(System.in);
	private int opcao;
	
	public MenuFila () {
		this.opcao = -1;
	}

	public void printMenu() {
		System.out.println("--- MENU : FILA ---");
		System.out.println( ); //linha em branco
		
		System.out.println("1 - Adicionar elemento");
		System.out.println("2 - Remover elemento");
		System.out.println("3 - Get elemento");
		System.out.println("4 - Exibir estrutura");
		System.out.println("5 - Quantidade elementos");
		System.out.println("6 - Esvaziar");
		System.out.println("0 - Voltar");
		
		System.out.println( ); //linha em branco
		
		System.out.print("Escolha sua opção: ");
		this.setOpcao();
	}
	
	public void setOpcao() {
		int opcao_user = 0;
		
		try {
			opcao_user = Integer.parseInt(input.next());
		
			switch (opcao_user) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					this.opcao = opcao_user;
					break;
				default:
					System.out.println("Opção inválida.");
			}
				
		} catch(InputMismatchException e) {
			System.out.println("Digite apenas valores inteiros.");
			
		} catch(Exception e) {
			System.out.println("Ocorreu um erro.");
		}
	}
	
	public int getOpcao() {
		return this.opcao;
	}
	
	public void callQueueMethods() {
		switch (this.opcao) {
			case 0:
				break;
				
			case 1:
				System.out.println("1 - Adicionar elemento");
				break;
			
			case 2:
				System.out.println("2 - Remover elemento");
				break;
				
			case 3:
				System.out.println("3 - Get elemento");
				break;
				
			case 4:
				System.out.println("4 - Exibir estrutura");
				break;
				
			case 5:
				System.out.println("5 - Quantidade elementos");
				break;
				
			case 6:
				System.out.println("6 - Esvaziar");
				break;
		}
	}

}
