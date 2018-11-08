
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServidorMain {

	public static void main(String[] args) {
			
		try {
			System.out.println("Servidor inicializado");
	
			ServidorRMI server = new ServidorRMI();
			Naming.rebind("/servidor", server); //disponibiliza o objeto na rede
			
			System.out.println("Recurso disponibilizado na rede.");
		}
	
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		catch(RemoteException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}


}
