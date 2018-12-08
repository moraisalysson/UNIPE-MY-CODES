package br.com.unipe.cc.edII.models;

import java.util.Scanner;
import java.util.TreeMap;

public class ManipuladorTabela {
	
	TabelaHash tabela;
	Scanner input;
		
	public ManipuladorTabela() {
		
		this.tabela = new TabelaHash();
		this.input =  new Scanner(System.in);
		
	}
	
	public void inserirAluno() {
	
		boolean continuar = true;
		
		while( continuar ) {
			try {
			
				Aluno aluno = new Aluno();
				
				System.out.println("\n--- Preencha com os dados do aluno ---");
				
				System.out.print("Nome: ");
				aluno.setNome( input.nextLine() );
			
				System.out.print("Matrícula: ");
				aluno.setMatricula( Integer.parseInt( input.nextLine() ) );
			
				System.out.print("Idade: ");
				aluno.setIdade( Integer.parseInt( input.nextLine() ) );
					
				this.tabela.addAluno( aluno );
				
				continuar = false;
			} 
			
			catch( NumberFormatException e) {
					
					System.out.println( "\n>>> Digite apenas valores inteiros <<<\n" );
			
			}	
			
			catch( Exception e ) {
	
				System.out.println( "\n>>> Houve um problema desconhecido, tente novamente <<<\n" );
			
			 } 			
		}
	}
	
	public void removerAluno() {
	
		try {
			System.out.println("\n--- Remover Aluno ---");
			
			System.out.print("Matrícula: ");
			int matricula = Integer.parseInt( input.nextLine() );
			
			this.tabela.removerAluno( matricula );
		}
		
		catch( NumberFormatException e) {
			System.out.println( "\n>>> Digite apenas valores inteiros <<<\n" );
		}	
	
		catch( Exception e ) {
			System.out.println( "\n>>> Houve um problema desconhecido, tente novamente <<<\n" );
		}	 
	}
	
	public void buscarAluno() {
		
		try {
			TreeMap <Integer, Aluno> dados = new TreeMap<>();
			
			System.out.println("\n--- Buscar Aluno --	-");
			
			System.out.print("Matrícula: ");
			int matricula = Integer.parseInt( input.nextLine() );
			
			dados = this.tabela.buscarAluno( matricula );
			
			if( dados != null ) {
				
				System.out.println( "\nÍndice: " + dados.lastKey() );
				System.out.println( "Marícula: " + dados.get( dados.lastKey() ).getMatricula() );
				System.out.println( "Nome: " + dados.get( dados.lastKey() ).getNome() );
				System.out.println( "Idade: " + dados.get( dados.lastKey() ).getIdade()  + "\n" );
			
			}
			
			else
				
				System.out.println( " \n>>> Aluno não encontrado <<<\n" );
		}
		
		catch( NumberFormatException e) {
			System.out.println( "\n>>> Digite apenas valores inteiros <<<\n" );
		}	
	
		catch( Exception e ) {
			System.out.println( "\n>>> Houve um problema desconhecido, tente novamente <<<\n" );
		}
		
	}
	
	public void exibirTabela() {
	
		this.tabela.exibirTabela();
		
	}
	
}
