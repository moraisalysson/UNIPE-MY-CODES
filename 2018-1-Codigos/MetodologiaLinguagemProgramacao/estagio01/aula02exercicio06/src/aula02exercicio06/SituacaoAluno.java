<<<<<<< HEAD
package aula02exercicio06;

import java.util.Scanner;

public class SituacaoAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Nota 1: ");
		nota1 = input.nextDouble();
		
		System.out.print("Nota 2: ");
		nota2 = input.nextDouble();
	
		System.out.print("Nota 3: ");
		nota3 = input.nextDouble();
		
		media = getMediaNotas(nota1, nota2, nota3);
		
		System.out.println("Situação = " + getSituacao(media));
	}
	
	public static double getMediaNotas(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}
	
	public static String getSituacao(double avarage) {
		if(avarage >= 7.0) {
			return "APROVADO";
		} 
		else if(avarage >= 5.0 && avarage < 7.0) {
			return "RECUPERAÇÃO";
		} 
		else {
			return "REPROVADO";
		}
	}

}
=======
package aula02exercicio06;

import java.util.Scanner;

public class SituacaoAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Nota 1: ");
		nota1 = input.nextDouble();
		
		System.out.print("Nota 2: ");
		nota2 = input.nextDouble();
	
		System.out.print("Nota 3: ");
		nota3 = input.nextDouble();
		
		media = getMediaNotas(nota1, nota2, nota3);
		
		System.out.println("Situação = " + getSituacao(media));
	}
	
	public static double getMediaNotas(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}
	
	public static String getSituacao(double avarage) {
		if(avarage >= 7.0) {
			return "APROVADO";
		} 
		else if(avarage >= 5.0 && avarage < 7.0) {
			return "RECUPERAÇÃO";
		} 
		else {
			return "REPROVADO";
		}
	}

}
>>>>>>> 5af0a005f9f9ffe065e14fcb4bb56b12d9ca1185
