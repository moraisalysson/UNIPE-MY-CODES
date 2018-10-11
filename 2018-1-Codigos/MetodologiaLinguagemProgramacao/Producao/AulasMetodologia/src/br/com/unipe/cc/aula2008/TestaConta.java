package br.com.unipe.cc.aula2008;

import br.com.unipe.cc.aula2108p2.ListaConta;

public class TestaConta {
	
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca();
		ContaCorrente c2 = new ContaCorrente();
		ListaConta listaDeContas = new ListaConta();
		
		c1.exibirMensagem();
		c2.exibirMensagem();
		c1.setTaxaRendimento(0.05f);
		c2.setTaxaManutencao(1.8f);
		c1.creditar(1000f);
		c2.creditar(3000f);
		
		
		System.out.println("Tamanho: " + listaDeContas.getTamanho());
		
		listaDeContas.add(c1);
		listaDeContas.add(c2);
		
		
		System.out.println("Tamanho: " + listaDeContas.getTamanho());
		System.out.println("Saldo c1 [0]: " + listaDeContas.listarTodos()[0].saldo);
		System.out.println("Saldo c2 [1]: " + listaDeContas.listarTodos()[1].saldo);
		
		c1.debitar(255f);
		c2.debitar(500f);
		
		System.out.println("Saldo c1 [0]: " + listaDeContas.listarTodos()[0].saldo);
		System.out.println("Saldo c1 [1]: " + listaDeContas.listarTodos()[1].saldo);
		
		c1.creditaTaxaRendimento();
		c2.debitarTaxaManutencao();
		
		System.out.println("Saldo c1 [0]: " + listaDeContas.listarTodos()[0].saldo);
		System.out.println("Saldo c1 [1]: " + listaDeContas.listarTodos()[1].saldo);
		
		listaDeContas.remove(0);
		
		System.out.println("Tamanho: " + listaDeContas.getTamanho());
	}
	
}
