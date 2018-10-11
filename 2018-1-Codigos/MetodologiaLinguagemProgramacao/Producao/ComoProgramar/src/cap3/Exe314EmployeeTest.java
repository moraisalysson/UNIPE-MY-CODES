package cap3;

import java.util.Scanner;

public class Exe314EmployeeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome 1: ");
		String nome = input.nextLine();
		
		System.out.print("Sobrename 1: ");
		String sobrenome = input.nextLine();
		
		System.out.print("Salário mensal 1: ");
		double salarioMensal = input.nextDouble();
		
		input.nextLine(); //limpa o buffer
		
		Exe314Employee employee1 = new Exe314Employee(nome, sobrenome, salarioMensal);
		
		System.out.print("Nome 2: ");
		nome = input.nextLine();
		
		System.out.print("Sobrename 2: ");
		sobrenome = input.nextLine();
		
		System.out.print("Salário mensal 2: ");
		salarioMensal = input.nextDouble();
		
		Exe314Employee employee2 = new Exe314Employee(nome, sobrenome, salarioMensal);
		
		System.out.printf("Salário anual %s: R$ %.2f\n", employee1.getNome(), employee1.getSalarioMensal() * 12);
		System.out.printf("Salário anual %s: R$ %.2f\n", employee2.getNome(), employee2.getSalarioMensal() * 12);
		
		double salarioAtualizado = employee1.getSalarioMensal() * 1.10;
		employee1.setSalarioMensal(salarioAtualizado);
		
		salarioAtualizado = employee2.getSalarioMensal() * 1.10;
		employee2.setSalarioMensal(salarioAtualizado);
		
		System.out.printf("Salário anual %s (+ 10%%): R$ %.2f\n", employee1.getNome(), employee1.getSalarioMensal() * 12);
		System.out.printf("Salário anual %s (+ 10%%): R$ %.2f\n", employee2.getNome(), employee2.getSalarioMensal() * 12);
		
		input.close();
	}

}
