package br.com.unipe.metodologia.cc.agendaRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceRMI <T> extends Remote {
	
	public boolean addContato(T contato) throws RemoteException;
	public String buscarContatoNome(String nome) throws RemoteException;
	public String buscarContatoTelefone(String telefone) throws RemoteException;
	public void printContatos() throws RemoteException;

}
	
