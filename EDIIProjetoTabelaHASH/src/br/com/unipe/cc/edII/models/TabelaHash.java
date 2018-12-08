package br.com.unipe.cc.edII.models;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class TabelaHash {
	
	private List<Aluno>[] tabela;
	
	public TabelaHash() {
		
		this.tabela = new List[11];
		
		for(int i = 0; i < 11; i++)
			this.tabela[i] = new LinkedList<>();
		
	}
	
	public boolean verificarExistencia(Aluno aluno) {
		
		for(int i = 0; i < this.tabela.length; i++) {
			
			List<Aluno> listaDeAlunos = this.tabela[i];
			
			for(int j = 0; j < listaDeAlunos.size(); j++)
				
				if(listaDeAlunos.get( j ).getMatricula() == aluno.getMatricula() )
					
					return true;
		}
		
		return false;
	}
	
	public Aluno getAlunoPorMatricula(int matricula) {
		
		for(int i = 0; i < this.tabela.length; i++) {
			
			List<Aluno> listaDeAlunos = this.tabela[i];
			
			for(int j = 0; j < listaDeAlunos.size(); j++)
				
				if(listaDeAlunos.get( j ).getMatricula() == matricula )
					
					return listaDeAlunos.get( j );
		}
		
		return null;
	
	}
	
	public boolean addAluno(Aluno aluno) {
				
		if( ! this.verificarExistencia(aluno) ) {
					
			int indexAdd = aluno.getMatricula() % 11;
				
			this.tabela[indexAdd].add( aluno );
		
			System.out.println( "\n>>> Aluno adicionado com sucesso <<<\n" );
			
			return true;
		} 
		
		else {
			
			System.out.println( "\n>>> Matrícula já cadastrada. Tente novamente <<<\n" );
			
			return false;
		
		}
	}
	
	public boolean removerAluno(int matricula) {
		
		Aluno alunoAux = this.getAlunoPorMatricula( matricula );
		
		if( alunoAux != null ) {
			
			int indexRemov = matricula % 11;
				
			this.tabela[indexRemov].remove( alunoAux );
			
			System.out.println( "\n>>> Aluno removido com sucesso <<<\n" );
			
			return true;
		} 
		
		else {
			
			System.out.println( "\n>>> Aluno não encontrado. Tente outro <<<\n" );
			
			return false;
		
		}
	}
	
	public TreeMap<Integer, Aluno> buscarAluno(int matricula) {
		
		TreeMap <Integer, Aluno> dados = new TreeMap<>();
		
		for(int i = 0; i < this.tabela.length; i++ ) {
			
			List<Aluno> listaDeAlunos = this.tabela[i];
			
			for(int j = 0; j < listaDeAlunos.size(); j++)
				
				if( listaDeAlunos.get( j ).getMatricula() == matricula ) {
					
					dados.put(j, listaDeAlunos.get( j ) );
					
					return dados;
				
				}
		}
		
		return null;
		
	}
	
	public boolean isEmpty() {
				
		for(int i = 0; i < this.tabela.length; i++)
			
			if( this.tabela[i].size() != 0 )
								
				return false;
					
		return true;		
	}
	
	public void exibirTabela() {
		
		try {
			
			if( this.isEmpty() )
				System.out.println( "\n>>> Tabela vazia <<<\n");
			
			else {
				for(int i = 0; i < this.tabela.length; i++) {
					
					List<Aluno> listaDeAlunos = this.tabela[i];
					
					if( listaDeAlunos.size() != 0 ) {
						
						System.out.println("\n---------------------");
						System.out.println( "Índice: " + i);
						
						for(int j = 0; j < listaDeAlunos.size(); j++) {
							
							System.out.printf( "\n Nome: %s", listaDeAlunos.get( j ).getNome() );
							System.out.printf( "\n Matrícula: %d", listaDeAlunos.get( j ).getMatricula() );
							System.out.printf( "\n Idade: %d\n", listaDeAlunos.get( j ).getIdade() );
						
						}
					}	
				}
				
				System.out.println();
			}
		} 
		
		catch( Exception e ) {
			System.out.println( ">>> Houve um erro. Tente novamente <<<");	
		}
	} 

} //classe


