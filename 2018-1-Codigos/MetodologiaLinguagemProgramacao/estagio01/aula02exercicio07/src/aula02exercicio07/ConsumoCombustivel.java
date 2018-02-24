<<<<<<< HEAD
//aula 02 - slide 48

package aula02exercicio07;

import java.util.Scanner;

public class ConsumoCombustivel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int distancia_km, gasto_litros;
		
		System.out.print("Informe a distância total percorrida (km): ");
		distancia_km = input.nextInt();

		System.out.print("Informe quantidade de combustível gasta (litros): ");
		gasto_litros = input.nextInt();
		
		System.out.println("Consumo médio = " + getConsumoMedio(distancia_km, gasto_litros) + " km/l");
	}
	
	public static double getConsumoMedio(int distancia, int litros) {
		return distancia / litros;
	}
}
=======
//aula 02 - slide 48

package aula02exercicio07;

import java.util.Scanner;

public class ConsumoCombustivel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int distancia_km, gasto_litros;
		
		System.out.print("Informe a distância total percorrida (km): ");
		distancia_km = input.nextInt();

		System.out.print("Informe quantidade de combustível gasta (litros): ");
		gasto_litros = input.nextInt();
		
		System.out.println("Consumo médio = " + getConsumoMedio(distancia_km, gasto_litros) + " km/l");
	}
	
	public static double getConsumoMedio(int distancia, int litros) {
		return distancia / litros;
	}
}
>>>>>>> 5af0a005f9f9ffe065e14fcb4bb56b12d9ca1185
