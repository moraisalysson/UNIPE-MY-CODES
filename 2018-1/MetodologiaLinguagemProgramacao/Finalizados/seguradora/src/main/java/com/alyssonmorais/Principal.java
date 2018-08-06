package com.alyssonmorais;


import modelo.Cliente;
import modelo.ContratoResidencial;
import modelo.Seguradora;
import tiposenums.TipoPessoa;
import tiposenums.TipoResidencia;
import tiposenums.Zona;

public class Principal {

	public static void main(String[] args) {
		
		
		Seguradora seguradora = new Seguradora();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("Nathalie");
		cliente.setTipoPessoa(TipoPessoa.FISICA);
		
		seguradora.cadastraCliente(cliente);
		
		cliente = new Cliente();
		cliente.setCodigo(2);
		cliente.setNome("Nora");
		cliente.setTipoPessoa(TipoPessoa.JURIDICA);
		
		seguradora.cadastraCliente(cliente);
		
		seguradora.listarClientes();
		
		
		ContratoResidencial contratoResidencial = new ContratoResidencial();
		contratoResidencial.setCliente(cliente);
		contratoResidencial.setEndereco("Rua X");
		contratoResidencial.setValorImovel(45.65f);
		contratoResidencial.setTipoResidencial(TipoResidencia.CASA);
		contratoResidencial.setZona(Zona.URBANA);
		
		seguradora.cadastrarContrato(contratoResidencial);
		
		contratoResidencial = new ContratoResidencial();
		contratoResidencial.setCliente(cliente);
		contratoResidencial.setEndereco("Alameda dos Anjos");
		contratoResidencial.setValorImovel(100.65f);
		contratoResidencial.setTipoResidencial(TipoResidencia.APARTAMENTO);
		contratoResidencial.setZona(Zona.SUBURBANA);
		
		seguradora.cadastrarContrato(contratoResidencial);
		
		seguradora.listarContratos();
		
	}
}