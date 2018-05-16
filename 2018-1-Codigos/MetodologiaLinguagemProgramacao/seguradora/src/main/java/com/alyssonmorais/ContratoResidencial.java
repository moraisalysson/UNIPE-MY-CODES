package com.alyssonmorais;

import java.util.Scanner;

/**
 * 
 * @author ALYSSON
 *
 */

public class ContratoResidencial extends Contrato {
	
	private String endereco;
	private TipoZona tipo_zona;
	private TipoResidencia tipo_residencia;
	private double valor_seguro;
	
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
	public TipoZona getTipo_zona() {
		return tipo_zona;
	}
	
	public void setTipo_zona(TipoZona tipo_zona) {
		this.tipo_zona = tipo_zona;
	}
	
	public TipoResidencia getTipo_residencia() {
		return tipo_residencia;
	}
	
	public void setTipo_residencia(TipoResidencia tipo_residencia) {
		this.tipo_residencia = tipo_residencia;
	}
	
	public void setValorSeguro() {
		double soma_valor_seguro = 0.0d;
		
		soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * 1.02d);
		
		if(this.tipo_zona == TipoZona.URBANA)
			soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * 1.01d);
		
		else if(this.tipo_zona == TipoZona.SUBURBANA)
			soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * 1.005d);
		
		if(tipo_residencia == TipoResidencia.CASA)
			soma_valor_seguro = soma_valor_seguro + (this.valor_seguro * 1.005d);
		
		this.valor_seguro = soma_valor_seguro;
	}
	
	public double getValorSeguro() {
		return valor_seguro;
	}
	
	
	//modificar:
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
