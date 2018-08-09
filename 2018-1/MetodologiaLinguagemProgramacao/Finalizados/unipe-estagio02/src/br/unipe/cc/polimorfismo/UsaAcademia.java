package br.unipe.cc.polimorfismo;

/**
 * @author Morais, Alysson
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
		
		p = new Aluno();
		/**
		 * Exemplo de POLIMORFISMO, pois uma PESSOA se transforma em ALUNO, por�m, a refer�ncia ainda � para uma PESSOA
		 */
		
		((Aluno)p).getMatricula(); 
		/**
		 * Fazendo um casting (convers�o). Convertendo PESSOA para ALUNO
		 */
				
	}

}
