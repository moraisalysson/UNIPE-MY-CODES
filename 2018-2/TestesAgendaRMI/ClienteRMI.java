import java.net.MalformedURLException;
import java.rmi.*;

public class ClienteRMI {

	public static void main(String[] args) {
	
		try {
			System.out.println("Cliente iniciado");
			
			Remote obj = Naming.lookup("//127.0.0.1/servidor"); //localiza o recurso na rede
		
			System.out.println("Recurso localizado");

			InterfaceRMI <Contato> agendaRemota = (InterfaceRMI <Contato> ) obj; //casting de Remote para HelloInterface
			
			Contato [] contatos = new Contato[3];
			
			contatos[0] = new Contato();
			contatos[1] = new Contato();
			contatos[2] = new Contato();

			contatos[0].setNome("Aly");
			contatos[0].setnumeroTelefone("111");
			
			contatos[1].setNome("Zé");
			contatos[1].setnumeroTelefone("222");
					
			contatos[2].setNome("Mario");
			contatos[2].setnumeroTelefone("333");

			agendaRemota.addContato(contatos[0]);
			agendaRemota.addContato(contatos[1]);
			agendaRemota.addContato(contatos[2]);
			
			agendaRemota.printContatos();

			System.out.println( agendaRemota.buscarContatoNome("Aly") );
		}

		catch (MalformedURLException | RemoteException | NotBoundException e) { //NotBound = servidor indisponível
		
			e.printStackTrace();
		
		}
		
	}

}
