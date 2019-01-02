package br.com.unipe.metodologia.cc.aula1911.q04;

public class ClasseOla implements Runnable {

	public void run() {
		
		try {
			
			for(int i = 0; i < 10; i++)
				System.out.println( "Olá" );
			
			Thread.sleep(2000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
