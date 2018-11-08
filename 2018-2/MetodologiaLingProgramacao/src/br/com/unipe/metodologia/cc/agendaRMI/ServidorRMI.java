package br.com.unipe.metodologia.cc.agendaRMI;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class ServidorRMI <T> extends UnicastRemoteObject implements InterfaceRMI <T>  { 
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList <T> agenda;
	
	
	public ServidorRMI() throws RemoteException {
		
		super();
		
		this.agenda = new ArrayList<>();
		
	}
	
	private boolean verificarExistenciaContato(T contato) {
		
		Contato contatoExt = (Contato) contato;
		
		for( T contatoAgenda : this.agenda ) {
			
			Contato contatoAux = (Contato) contatoAgenda;
			
			if( contatoAux.getNome().equals( contatoExt.getNome() ) ) {
				
				return true;
				
			}
			
		}
		
		return false;
	}
		
	public boolean addContato(T contato) throws RemoteException {
		
		if( ! this.verificarExistenciaContato(contato) ) { //se contato não existir, add
			
			agenda.add(contato);
			
			return true;
		}
		
		return false;
	}

	public String buscarContatoNome(String nome) throws RemoteException {
				
			for( T contato : this.agenda ) {
				
				Contato contatoAux = (Contato) contato;
				
				if( contatoAux.getNome().equals( nome ) ) { //retorna o contato da lista, caso seja localizado pelo nome
					
					return String.format("Nome: %s\nTelefone: %s", contatoAux.getNome(), contatoAux.getnumeroTelefone() );
					
				}
				
			}
			
		return "Contato não localizado.";
	}

	public String buscarContatoTelefone(String numeroTelefone) throws RemoteException {
	
		for( T contato : this.agenda ) {
			
			Contato contatoAux = (Contato) contato;
			
			if( contatoAux.getnumeroTelefone().equals( numeroTelefone ) ) { //retorna o contato da lista, caso seja localizado pelo telefone
				
				return String.format("Nome: %s\n Telefone: %s", contatoAux.getNome(), contatoAux.getnumeroTelefone() );
				
			}
			
		}
		
		return "Contato não localizado.";
	}

	public void printContatos() throws RemoteException {
				
		for( T contatoAgenda : this.agenda ) {
					
			Contato contatoAux = (Contato) contatoAgenda;
			
				System.out.println("Nome: " + contatoAux.getNome() );
				System.out.println("Telefone: " + contatoAux.getnumeroTelefone() + "\n" );
				
			}
			
	}
		
}