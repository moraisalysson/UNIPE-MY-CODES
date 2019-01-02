package br.com.unipe.metodologia.cc.aula1911.q04;

public class ExecutaQ4 {

	public static void main(String[] args) throws InterruptedException {
	
		ClasseOla ola = new ClasseOla();
		ClasseHola hola = new ClasseHola();
		
		Thread tOla = new Thread(ola);
		Thread tHola = new Thread(hola);
			
		tOla.start();
		tOla.join();
		
		tHola.start();
		tHola.join();
		
	}
}

