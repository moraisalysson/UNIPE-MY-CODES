import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ClienteMain {

	public static void main(String[] args)  {
		
		try {
			
			Remote obj = Naming.lookup("//127.0.0.1/chatServer"); //localiza o recurso na rede
		
			ChatInterface objRemoto = (ChatInterface) obj; //casting de Remote para ChatInterface
	
			Cliente cliente = new Cliente( objRemoto );
			
			cliente.setNickname();

			LerMensagens lerMensagens = new LerMensagens( objRemoto, cliente );
			
			Thread threadReceber = new Thread( lerMensagens );

			threadReceber.start();

			cliente.enviarMsgem();
			
		} 
		
		catch ( MalformedURLException e ) {
			
			System.out.println( "Erro no cliente (url). Contatar suporte." );
		
		}
		
		catch ( RemoteException e ) {
	
			System.out.println( "Erro no cliente (remote). Contatar suporte." );
		
		}
		
		catch ( NotBoundException e ) { 
			
			System.out.println( "Erro no cliente (servidor indisponivel). Contatar suporte." );
		
		}
		
	}
	
}
