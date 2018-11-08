package br.com.unipe.metodologia.cc.aula2910;

import java.rmi.Remote;

public interface HelloInterface extends Remote {

	public String helloName(String name);
	
}
