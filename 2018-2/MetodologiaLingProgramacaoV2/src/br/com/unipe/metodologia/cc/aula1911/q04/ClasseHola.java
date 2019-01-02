package br.com.unipe.metodologia.cc.aula1911.q04;

public class ClasseHola implements Runnable {

	public void run() {
				
		try {
			
			for(int i = 0; i < 5; i++)
				System.out.println( "Hola" );
			
			Thread.sleep(2000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
