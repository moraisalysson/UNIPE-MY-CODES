import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorHello extends UnicastRemoteObject implements HelloInterface  { 
	
	private static final long serialVersionUID = 1L;

	public ServidorHello() throws RemoteException {
		
		super(); //o construtor da superclasse lan�a o RemoteException
		
	}
	
	public String helloName(String name) throws RemoteException {
		
		return "Hello " + name;
		
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Servidor inicializado");

			ServidorHello server = new ServidorHello();
			Naming.rebind("/obaoba", server); //disponibiliza o objeto na rede
			
			System.out.println("Recurso disponibilizado na rede.");
		}
	
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		catch(RemoteException e) {
			e.printStackTrace();
		}
	}
	
}
