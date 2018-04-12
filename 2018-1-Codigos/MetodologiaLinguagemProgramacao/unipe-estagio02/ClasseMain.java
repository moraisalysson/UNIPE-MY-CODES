import java.util.Scanner;

public class ClasseMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Questao01 q1 = new Questao01();
		Questao02 q2 = new Questao02();
		Questao03 q3 = new Questao03();
		Questao04 q4 = new Questao04();
		Questao05 q5 = new Questao05();
		
//questao01
		int TAM_ARRAY = 300;
		int[] m_array = new int[TAM_ARRAY];
			
		//m_array = q1.populaArray(m_array, 45);		

//questao02
		//q2.imprimeElementosArray(m_array);
		
//questão03
		
		//q3.inputValores();
		//q3.imprimeListaOrdenada();
		//System.out.println("Valor 6 encontrado no índice: " + q3.buscaBinaria(0, 10, 6));
		
//questao04

		//q4.inputStrings();
		//q4.imprimeListaOrdenada();

//questao05
		//q5.inputValores();
		//q5.imprimeListaOrdenada();
		
//questao06
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

	}//fecha main

}//fecha classe
