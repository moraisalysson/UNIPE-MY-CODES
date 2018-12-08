import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatInterface extends Remote {

	public void receberMensagem(String msgem) throws RemoteException;
	
	public ArrayList<String> getArrayMensagens() throws RemoteException;

}
