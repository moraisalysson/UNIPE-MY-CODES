package br.com.unipe.cc.aula2409;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main0110 {

	public static void main(String[] args) {
		Set <PessoaFisica> pessoas = new TreeSet<PessoaFisica>();
		
		PessoaFisica p1 = new PessoaFisica("111", "Fulano", 49);
		PessoaFisica p2 = new PessoaFisica("222", "Beltrano", 25);
		PessoaFisica p3 = new PessoaFisica("333", "Cicrano", 25);
		PessoaFisica p4 = new PessoaFisica("111", "Deitel", 98);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		for(PessoaFisica ps: pessoas) 
			System.out.println(ps.getCpf());
	}

}
