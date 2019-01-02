package br.com.unipe.metodologia.cc.aula1911.q03;

public class ClasseHola implements Runnable {

	public void run() {
		
		for(int i = 0; i < 5; i++)
			System.out.println( "Hola" );
		
		try {
			
			Thread.sleep(2000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
