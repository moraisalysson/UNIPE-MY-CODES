package br.com.unipe.metodologia.cc.aula2910;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ClienteHello {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("Cliente iniciado");
		
			Remote obj = Naming.lookup("//127.0.0.1/obaoba"); //localiza o recurso na rede
		
			System.out.println("Recurso localizado em //127.0.0.1/obaoba");

			HelloInterface objRemoto = (HelloInterface) obj; //casting de Remote para HelloInterface
			
			String retorno = objRemoto.helloName("Alysson");

			System.out.println(retorno);
			
		} 
		
		catch (MalformedURLException | RemoteException | NotBoundException e) { //NotBound = servidor indisponível
			e.printStackTrace();
		}
		
	}
	
}
