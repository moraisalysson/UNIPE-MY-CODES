package br.com.unipe.metodologia.cc.aula0511;

public class ClasseExecutavel implements Runnable {

	public void run() {
		
		while(true) {
			
			System.out.println( this.hashCode() );
		
			try {
				
				Trhead.sleep(1000);
				
			} catch(InterruptedExceptio e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ClasseExecetuval ce = new ClasseExecetuval();
		Thread t = new Thread(ce);
		
		t.start();
	}
}
