package br.unipe.cc.exceptions;

public class ContaCorrente {
	private float valor = 100.0f;
	private String nome = "Alysson";
	private int numeroConta = 123456;
	
	public void sacar(float valorSaque) throws SaldoInsuficienteException {
		
		if(this.valor > valorSaque)
			this.valor -= valorSaque;
		else
			throw new SaldoInsuficienteException();
		
	}
	
	public void buscaCliente(String nomeCliente) throws ClienteNaoEncontradoException {
		
		if(this.nome == nomeCliente)
			System.out.println("Cliente encontrado.");
		
		else
			throw new ClienteNaoEncontradoException();
	}
	
	public void buscaConta(int numeroConta) throws ContaNaoEncontradaException {
		
		if(this.numeroConta == numeroConta)
			System.out.println("Conta nao encontrada.");
		
		else
			throw new ContaNaoEncontradaException();
	}
}
