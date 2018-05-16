package com.alyssonmorais;

/**
 * 
 * @author ALYSSON
 *
 */

import java.util.Scanner;

public class Cliente {
	
	private int codigo;
	private String nome;
	private TipoPessoa tipopessoa;
	
	public TipoPessoa getTipopessoa() {
		return tipopessoa;
	}

	public void setTipopessoa(TipoPessoa tipopessoa) {
		this.tipopessoa = tipopessoa;
	}

	public Cliente() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastroCliente() {
		Scanner input = new Scanner(System.in);
		TipoPessoa tipoPessoa = TipoPessoa.FISICA; //inicializando o tipo
		
		System.out.println("Informe o nome do cliente: ");
		this.setNome( input.nextLine() );
		
		input.nextLine(); //limpa o buffer
		
		System.out.println("Pessoa Fisica ou Pessoa Juridica: ");
		tipoPessoa.setTipo( input.nextLine() );
		
		input.nextLine(); //limpa o buffer
		
		this.setTipopessoa(tipoPessoa);
		
		input.close();
	}


}
