package br.unipe.cc.polimorfismo;

/**
 * 
 * @author Morais, Alysson
 *
 */

public class UsaAcademia {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setCpf("123");
		p.setNome("Alysson Morais");
		
		Funcionario f = new Funcionario();
		f.setRegistro("123");
		f.setNome("Mario");
		f.setCpf("999");

		Aluno a = new Aluno();
		a.setMatricula("100");
		a.setNome("Luigi");
		a.setCpf("666");
		
		Academia academia = new Academia();
		academia.informaNome(a);
		academia.informaNome(p);
		academia.informaNome(f);
		
		p = new Aluno(); //<---- POLIMORFISMO, pois uma PESSOA se transforma em ALUNO, porém, a referência ainda é para PESSOA

		((Aluno)p).getMatricula(); //fazendo um casting (conversão). Convertendo PESSOA para ALUNO
				
	}

}
