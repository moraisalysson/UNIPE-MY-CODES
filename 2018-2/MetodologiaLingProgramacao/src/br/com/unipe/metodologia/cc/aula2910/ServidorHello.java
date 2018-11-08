package br.com.unipe.metodologia.cc.aula2910;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorHello extends UnicastRemoteObject implements HelloInterface  { 
	
	private static final long serialVersionUID = 1L;

	public ServidorHello() throws RemoteException {
		
		super(); //o construtor da superclasse lança o RemoteException
		
	}
	
	public String helloName(String name) {
		
		return "Hello " + name;
		
	}
	
	public static void main(String[] args) {
		
		try {
			ServidorHello server = new ServidorHello();
			Naming.rebind("/obaoba", server); //disponibiliza o objeto na rede
		}
	
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		catch(RemoteException e) {
			e.printStackTrace();
		}
	}
	
}
