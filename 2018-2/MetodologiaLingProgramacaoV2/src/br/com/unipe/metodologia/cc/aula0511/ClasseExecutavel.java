package br.com.unipe.metodologia.cc.aula0511;

public class ClasseExecutavel implements Runnable {

	public void run() {
		
		while(true) {
			
			System.out.println( this.hashCode() );
		
			try {
				
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			
			ClasseExecutavel ce = new ClasseExecutavel();
			
			Thread t = new Thread(ce);
			
			t.start();
		}
	}
}