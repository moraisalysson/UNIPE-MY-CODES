import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServidorMain {

	public static void main(String[] args) {
		
		try {
			
			System.out.println( "Servidor inicializado." );

			Servidor server = new Servidor();
			Naming.rebind("/chatServer", server); //disponibiliza o objeto na rede
			
			System.out.println( "Recurso disponibilizado na rede." );
			
		}
	
		catch( MalformedURLException e ) {
		
			System.out.println( "Erro no servidor (url). Contatar suporte." );
		
		}
		
		catch( RemoteException e ) {
			
			System.out.println( "Erro no servidor (remote). Contactar suporte." );
		
		}

	}

}
