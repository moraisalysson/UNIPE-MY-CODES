package br.com.unipe.edII.cc.projeto.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cartao {
	private Scanner input;
	private int comprimentoCartao;
	private int qtdFrasesCartao;
	private int [][] dadosFrases;
	
	public Cartao() {
		
		this.input = new Scanner(System.in);
		
	}
	
	public void inputDadosCartao() {
		
		this.comprimentoCartao = input.nextInt();
		this.qtdFrasesCartao = input.nextInt();
	
		if( this.comprimentoCartao == 0 && this.qtdFrasesCartao == 0 )
			return;	
		
		this.dadosFrases = new int[this.qtdFrasesCartao][2];
				
		for(int i = 0; i < qtdFrasesCartao; i++) {
			
			int numCaracteresFrase = input.nextInt();
			int qtdEuTeAmo = input.nextInt();
		
			this.dadosFrases[i][0] = numCaracteresFrase;
			this.dadosFrases[i][1] = qtdEuTeAmo;
		
		}
			
	}
	
	public int getComprimentoCartao() {
		return comprimentoCartao;
	}


	public void setComprimentoCartao(int comprimentoCartao) {
		this.comprimentoCartao = comprimentoCartao;
	}


	public int getQtdFrasesCartao() {
		return qtdFrasesCartao;
	}


	public void setQtdFrasesCartao(int qtdFrasesCartao) {
		this.qtdFrasesCartao = qtdFrasesCartao;
	}

	public int[][] getDadosFrases() {
		return dadosFrases;
	}

	public void setDadosFrases(int[][] dadosFrases) {
		this.dadosFrases = dadosFrases;
	}
	
	

}
