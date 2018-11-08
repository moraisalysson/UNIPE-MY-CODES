package br.com.unipe.cc.edII.models;

import java.util.Scanner;

public class Menu {
	
	private Scanner input;
	ManipuladorTabela manipulador;
		
	public Menu() {
		
		this.input = new Scanner(System.in);
		this.manipulador = new ManipuladorTabela();
		
	}
	
	public void exibirMenu() {
		int opcao = 0;
		
		do {
			
			System.out.println("----- MENU -----\n");
			
			System.out.println("1 - Inserir novo aluno");
			System.out.println("2 - Buscar aluno");
			System.out.println("3 - Remover aluno");
			System.out.println("4 - Exibir tabela hash");
			System.out.println("0 - Encerrar sistema");
			
			System.out.print("\nInforme a opção desejada: ");
			
			opcao = this.getOpcaoDoUser();
			
			if(opcao == 0)
				break;
			
			this.chamadorFuncoes(opcao);
			
		} while( true );
	
	}
	
	private int getOpcaoDoUser() {
		
		int opcao = 0;
		boolean terminate = false; 
		
		while( ! terminate ) {
		
			try {
				
				opcao = Integer.parseInt( this.input.nextLine() );
				terminate = true;
				
			} catch(Exception e) {
				
				e.printStackTrace();
				System.out.println("Houve um problema, tente novamente.");
			
			}
		
		}
		
		return opcao;
	}

	private void chamadorFuncoes(int opcao) {

		switch(opcao) {
			case 1:
				
				this.manipulador.inserirAluno();
				break;
				
			case 2:
				System.out.println(2);
				break;
				
			case 3:
				System.out.println(3);
				break;
				
			case 4:
				this.manipulador.exibirTabela();
				break;
								
		}
	}
}
