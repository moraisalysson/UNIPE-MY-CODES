/*package modelos;

import java.util.InputMismatchException;

public class Temporaria {

	public void cadastrarDados() {
		boolean itsNumber = false;
		int testa_numero = 0, codigo = 0;
		String nome_temp = "";
		
		System.out.print("Informe o nome do vendedor: ");
		nome_temp = input.nextLine();
		
		System.out.print("Precione ENTER para continuar. "); //necessário para não achar que o programa parou (limpeza do buffer abaixo)
		while( ! itsNumber) {
			try {
				input.nextLine(); //limpa o buffer. fica aguardando alguma entrada do user na primeira iteração.
				
				System.out.print("Informe o código do vendedor: ");
				codigo = input.nextInt();
				itsNumber = true;
				
			} catch (NumberFormatException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");
				itsNumber = false;
				
			} catch (InputMismatchException ex) {
				System.out.printf("    -> Digite apenas valores inteiros.\n");
				itsNumber = false;
			}
		
		}
	}

	
}
*/