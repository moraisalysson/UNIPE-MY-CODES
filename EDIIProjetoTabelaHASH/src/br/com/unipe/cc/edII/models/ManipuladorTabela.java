package br.com.unipe.cc.edII.models;

import java.util.Scanner;

public class ManipuladorTabela {
	
	TabelaHash <Aluno> tabela;
	Scanner input;
		
	public ManipuladorTabela() {
		
		this.tabela = new TabelaHash <>();
		this.input =  new Scanner(System.in);
	
	}
	
	public void inserirAluno() {
		
		Aluno aluno = new Aluno();
		
		System.out.println("\n--- Preencha com os dados do aluno ---");
		
		System.out.print("Nome: ");
		aluno.setNome( input.nextLine() );
		
		System.out.print("Matrícula: ");
		aluno.setMatricula( Integer.parseInt( input.nextLine() ) );
		
		System.out.print("Idade: ");
		aluno.setIdade( Integer.parseInt( input.nextLine() ) );
		
		this.tabela.addAluno(aluno);
		
		System.out.println("Aluno inserido com sucesso!\n");
	
	}
	
	public void exibirTabela() {
	
		this.tabela.exibirTabela();
		
	}
	
}
