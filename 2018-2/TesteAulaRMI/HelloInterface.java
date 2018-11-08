package br.com.unipe.metodologia.cc.aula2910;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {

	public String helloName(String name) throws RemoteException;
	
}
