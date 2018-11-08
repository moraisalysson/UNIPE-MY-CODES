package br.com.unipe.cc.edII.models;

import java.util.ArrayList;

public class TabelaHash<T> {
	
	private ArrayList<T> tabela;
	
	public TabelaHash() {
		
		this.tabela = new ArrayList <>();
		
	}
	
	public void addAluno(T aluno) {
		
		Aluno alunoAux = (Aluno) aluno;
		
		int indexAdd = alunoAux.getMatricula() % 11;
				
		this.tabela.add(indexAdd, aluno);
		
	}
	
	public void removerAluno() {
		
	}
	
	public void buscarAluno() {
		
	}
	
	public void exibirTabela() {
		
		Aluno alunoAux = new Aluno();
		
		for(T aluno : this.tabela) {
			
			alunoAux = (Aluno) aluno;
			
			System.out.println( "Nome: " + alunoAux.getNome() );
			System.out.println( "Matrícula: " + alunoAux.getMatricula() );
			System.out.println( "Idade: " + alunoAux.getIdade() + "\n");
		
		}
		
	}
}
