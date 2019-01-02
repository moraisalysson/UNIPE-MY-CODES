
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Servidor extends UnicastRemoteObject implements ChatInterface {
	
	private static final long serialVersionUID = 1L;
	private ArrayList <String> arrayMensagens;
	
	public Servidor() throws RemoteException {
		
		super(); //o construtor da superclasse lança o RemoteException
		this.arrayMensagens = new ArrayList<>();
	
	}
	
	public void receberMensagem( String msgem ) throws RemoteException {
		
		this.arrayMensagens.add( msgem );
		
	}

	public ArrayList<String> getArrayMensagens() throws RemoteException {
		
		return this.arrayMensagens;
		
	}
		
}
