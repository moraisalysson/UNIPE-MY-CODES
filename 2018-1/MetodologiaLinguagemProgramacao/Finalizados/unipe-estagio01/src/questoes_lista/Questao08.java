package questoes_lista;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Questao08Cliente [] clientes = new Questao08Cliente[5]; 
		int quantidade_dias;
		float valor_tarifa_e_diaria = 0.0f;
		float valor_cliente = 0.0f;
		float valor_diaria = 40.0f;
				
		for(int index_clientes = 0; index_clientes < 5; ++index_clientes) {
			recebeNomeCliente(input, clientes, index_clientes);
			
			recebeQuantDias(input, clientes, index_clientes);
			
			quantidade_dias = clientes[index_clientes].getQuantidadeDiarias();
			
			valor_tarifa_e_diaria = defineTarifa(clientes[index_clientes].getQuantidadeDiarias(), valor_diaria);
			
			clientes[index_clientes].setValorTarifa(valor_tarifa_e_diaria);
			
			valor_cliente = calculaContaCliente(quantidade_dias, valor_tarifa_e_diaria);
			
			clientes[index_clientes].setValorConta(valor_cliente);
		}
		
		exibeArrecadaPousada(clientes, valor_tarifa_e_diaria, valor_diaria);
		
		input.close();
	}
	
	public static void recebeNomeCliente(Scanner input, Questao08Cliente clientes[], int index) {
		clientes[index] = new Questao08Cliente(); //gerando o objeto Cliente para cada índice
		
		System.out.printf("Informe o nome do %dº cliente: ", index + 1);
		clientes[index].setNome( input.nextLine() );
	}
	
	public static void recebeQuantDias(Scanner input, Questao08Cliente clientes[], int index) {
		System.out.printf("Informe a quantidade de dias da estadia: ");
		
		clientes[index].setQuantidadeDiarias( Integer.parseInt(input.nextLine()) );
		
		System.out.println();
	}
	
	public static float defineTarifa(int quant_dias, float valor_diaria) {
		if(quant_dias < 10) {
			return (valor_diaria + 15.0f);
		} else {
			return (valor_diaria + 8.0f);
		}
	}
		
	public static float calculaContaCliente(int quant_dias, float vlr_tarifa) {
		return (float) (quant_dias * vlr_tarifa);
	}	
	
	public static void exibeArrecadaPousada(Questao08Cliente clientes[], float valor_tarifa, float valor_diaria) {
		float total_arrecadado = 0.0f;
		
		for(int index_clientes = 0; index_clientes < 5; ++index_clientes) {
			System.out.printf("%s: %d * %.2f = %.2f%n", 
					clientes[index_clientes].getNome(), 
					clientes[index_clientes].getQuantidadeDiarias(),
					clientes[index_clientes].getValorTarifa(),
					clientes[index_clientes].getValorConta());
			
			total_arrecadado = total_arrecadado + clientes[index_clientes].getValorConta(); 
		}
		
		System.out.printf("Valor total arrecadado: R$ %.2f%n", total_arrecadado);
	}
	
}
