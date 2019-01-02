package br.com.unipe.cc.aula2509.menus;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MainMenu {
	private Scanner input = new Scanner(System.in);
	private int opcao;
	
	public MainMenu () {
		this.opcao = -1;
	}

	public void printMenu() {
		System.out.println("--- MENU : PRINCIPAL ---");
		System.out.println( ); //linha em branco
		
		System.out.println("1 - Fila");
		System.out.println("2 - Pilha");
		System.out.println("3 - Deque");
		System.out.println( ); //linha em branco
		
		System.out.print("Escolha sua opção: ");
		this.setOpcao();
		this.callOthersMenus();
	}
	
	public void setOpcao() {
		int opcao_user = 0;
		
		try {
			opcao_user = Integer.parseInt(input.next());
		
			if(opcao_user == 1 || opcao_user == 2 || opcao_user == 3)
				this.opcao = opcao_user;
		
		} catch(InputMismatchException e) {
			System.out.println("Opção inválida.");
			
		} catch(Exception e) {
			System.out.println("Ocorreu um erro.");
		}
	}
	
	public int getOpcao() {
		return this.opcao;
	}
	
	public void callOthersMenus() {
		switch (this.getOpcao()) {
			case 1:
				MenuFila menuFila = new MenuFila();
				menuFila.printMenu();
				break;
			
			case 2:
				break;
				
			case 3:
				break;
		}
	}

}
