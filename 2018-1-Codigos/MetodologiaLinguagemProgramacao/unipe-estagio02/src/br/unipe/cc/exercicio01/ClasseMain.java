package br.unipe.cc.exercicio01;

import java.util.Scanner;

/**
 * @author Morais, Alysson
 */

public class ClasseMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Questao01 q1 = new Questao01();
		Questao02 q2 = new Questao02();
		Questao03 q3 = new Questao03();
		Questao04 q4 = new Questao04();
		Questao05 q5 = new Questao05();
		

		int TAM_ARRAY = 300;
		int[] m_array = new int[TAM_ARRAY];
/**
 * Questão 01: Crie um array de inteiros com 300 posições e preencha todos com o valor 45 		
 */
		m_array = q1.populaArray(m_array, 45);		

/**
 * Questão 02: Imprima todos os valores da questão anterior de 3 formas diferentes.
 */
		q2.imprimeElementosArray(m_array);
		
/**
 * Questão 03: Crie um programa que receba 10 valores e depois permita que seja feita uma pesquisa por tal valor, ordene a lista e faça uma pesquisa Binária de forma que ela retorne o indice se o mesmo existir no array.
 */
		
		q3.inputValores();
		q3.imprimeListaOrdenada();
		System.out.println("Valor 6 encontrado no índice: " + q3.buscaBinaria(0, 10, 6));
		
/**
 * Questão 04: Crie um programa que receba vários 10 nomes e ao final ordene os mesmo em ordem alfabética.
 */

		q4.inputStrings();
		q4.imprimeListaOrdenada();

/**
 * Questão 05: Realize o mesmo procedimento da questão anterior, sendo que o mesmo vai receber uma seqüência numérica de 10 inteiros , e ao final ele vai imprimir  a seqüência de forma ordenada.
 */
		q5.inputValores();
		q5.imprimeListaOrdenada();
		
/**
 * Questão 06: É nescessário desenvolver uma aplicação que salve objetos do tipo usuário, para cada objeto deste tipo deve ser associado uma chave, não é permitido que existam repetições.
 */
		int TAM_ARRAY_Q6 = 5, i = 0;
		String user_cpf = new String();
		boolean equal_cpf = false;
		Questao06[] q6array = new Questao06[TAM_ARRAY_Q6];

		while(i < q6array.length) {		
			equal_cpf = false;
			q6array[i] = new Questao06("000", "vazio"); //instanciando o objeto pra cada índice
			
			System.out.print("Informe o CPF do usuário: ");
			user_cpf = input.nextLine();
		
			for(int j = 0; j < i; j++) {
				if(user_cpf.compareToIgnoreCase( q6array[j].getCpf() ) == 0) { //verifica se o cpf já existe no array
					System.out.printf("%nJá existe!!! Informe um CPF diferente.%n%n");
					equal_cpf = true;
					break;
				}
			}
			
			if(equal_cpf == false) {	//insere dados se o cpf for novo
				q6array[i].setCpf(user_cpf);
				
				System.out.print("Informe o Nome do usuário: ");
				q6array[i].setNome( input.nextLine() );
				
				System.out.println();
				
				i++;
			}
		}
		
		for(i = 0; i < q6array.length; i++)//imprimindo os elementos do array
			System.out.printf("CPF: %s - Nome: %s%n", q6array[i].getCpf(), q6array[i].getNome());

		input.close();
		
	}//fecha main

}//fecha classe