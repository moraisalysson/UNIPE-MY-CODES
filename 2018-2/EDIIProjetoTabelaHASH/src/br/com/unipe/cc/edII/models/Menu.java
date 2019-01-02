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
		int opcao = -1;
		
		do {
			
			System.out.println("----- MENU -----\n");
			
			System.out.println("1 - Inserir novo aluno");
			System.out.println("2 - Buscar aluno");
			System.out.println("3 - Remover aluno");
			System.out.println("4 - Exibir tabela hash");
			System.out.println("0 - Encerrar sistema");
			
			System.out.print("\nInforme a opção desejada: ");
			
			opcao = this.getOpcaoDoUser();
			
			if(opcao == 0) {
				
				System.out.println( "\n>>> Sistema encerrado <<<" );
				
				break;
			
			} 
					
			this.chamadorFuncoes(opcao);
			
		} while( true );
		
		
	
	}
	
	private int getOpcaoDoUser() {
		
		int opcao = -1;
		//boolean continuar = true; 
				
		try {
			
			opcao = Integer.parseInt( this.input.nextLine() );
			
			if(opcao < 0 || opcao > 4)	
				System.out.println( "\n>>> Opção inválida, tente novamente.\n" );
				
		//	continuar = false;
			
		} catch( NumberFormatException e) {
			
			System.out.println( "\n>>> Digite apenas valores inteiros <<<\n" );
			
		} catch( Exception e ) {

			System.out.println( "\n>>> Houve um problema desconhecido, tente novamente <<<\n" );
		
		}
				
		return opcao;
	
	}

	private void chamadorFuncoes(int opcao) {

		switch(opcao) {
			case 1:
				
				this.manipulador.inserirAluno();
				break;
				
			case 2:
				
				this.manipulador.buscarAluno();
				break;
				
			case 3:
				
				this.manipulador.removerAluno();
				break;
				
			case 4:
				
				this.manipulador.exibirTabela();
				break;
								
		}
	}
}
