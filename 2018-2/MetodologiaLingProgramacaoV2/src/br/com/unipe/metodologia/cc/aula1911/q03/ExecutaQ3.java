package br.com.unipe.metodologia.cc.aula1911.q03;

public class ExecutaQ3 {

	public static void main(String[] args) {
	
		ClasseOla ola = new ClasseOla();
		ClasseHola hola = new ClasseHola();
		
		Thread tOla = new Thread(ola);
		Thread tHola = new Thread(hola);
			
		tOla.start();
		tHola.start();
			
	}
}

