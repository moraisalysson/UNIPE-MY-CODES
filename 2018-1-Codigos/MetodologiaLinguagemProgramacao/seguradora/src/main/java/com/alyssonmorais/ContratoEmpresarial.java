package com.alyssonmorais;

import java.util.Scanner;

/**
 * 
 * @author ALYSSON
 *
 */

public class ContratoEmpresarial extends Contrato {
	private int numero_funcionarios;
	private int numero_visitas_diarias;
	private TipoRamo ramo_atuacao;
	private double valor_seguro;
	
	public int getNumero_funcionarios() {
		return numero_funcionarios;
	}
	
	public void setNumero_funcionarios(int numero_funcionarios) {
		this.numero_funcionarios = numero_funcionarios;
	}
	
	public int getNumero_visitas_diarias() {
		return numero_visitas_diarias;
	}
	
	public void setNumero_visitas_diarias(int numero_visitas_diarias) {
		this.numero_visitas_diarias = numero_visitas_diarias;
	}
	
	public TipoRamo getRamo_atuacao() {
		return ramo_atuacao;
	}
	
	public void setRamo_atuacao(TipoRamo ramo_atuacao) {
		this.ramo_atuacao = ramo_atuacao;
	}
	
	public void setValorSeguro() {
		double soma_valor_seguro = 0.0d;
		
		soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * 1.04d);
		
		soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * ( (this.numero_funcionarios % 10) * 1.002d) );
		
		soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * ( (this.numero_visitas_diarias % 200) * 1.003d) );
		
		if(this.ramo_atuacao == TipoRamo.INDUSTRIA)
			soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * 1.01d);
		
		else if(this.ramo_atuacao == TipoRamo.COMERCIO)
			soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * 1.005d);
	}
	
	public double getValorSeguro() {
		return valor_seguro;
	}
	
	public void cadastroContrato() {
		Scanner input = new Scanner(System.in);
		TipoRamo ramo = TipoRamo.AGROPECUARIA;
		Cliente cliente = new Cliente();
		
		cliente.cadastroCliente();
		
		System.out.println("Informe a quantidade de funcionarios: ");
		this.setNumero_funcionarios( input.nextInt() );

		input.nextLine();  //limpa o buffe
		
		System.out.println("Informe a quantidade de visitas diarias: ");
		this.setNumero_visitas_diarias( input.nextInt() );

		input.nextLine(); //limpa o buffer
		
		System.out.println("Informe o ramo de atuação: ");
		ramo.setCodigo( input.nextInt() );
		
		this.setRamo_atuacao(ramo);
		
		input.nextLine(); //limpa o buffer
		
		System.out.println("Informe o valor do imóvel: ");
		this.setValorImovel( input.nextFloat() );
		
		input.nextLine();
		
		this.setValorSeguro();
		
		input.close();
	}
	
}
