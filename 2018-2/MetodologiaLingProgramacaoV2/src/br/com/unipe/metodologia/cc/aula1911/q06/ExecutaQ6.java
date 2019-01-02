package br.com.unipe.metodologia.cc.aula1911.q06;

public class ExecutaQ6 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(100);
		
		Thread t1 = new Thread( c1 );
		Thread t2 = new Thread( c1 );
		Thread t3 = new Thread( c1 );
		
		t1.start();
		
		t2.start();

		t3.start();
		
		System.out.println( c1.getSaldo() );
		
		System.out.println( c1.getSaldo() );
	}

}
