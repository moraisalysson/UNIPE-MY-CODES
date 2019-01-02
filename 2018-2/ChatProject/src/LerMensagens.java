import java.rmi.RemoteException;

public class LerMensagens implements Runnable {

	private ChatInterface servidor;
	private Cliente cliente;
	private int cont;
	
	public LerMensagens( ChatInterface servidor, Cliente cliente ) throws RemoteException {
		
		this.servidor = servidor;
		this.cliente = cliente;
		this.cont = servidor.getArrayMensagens().size();
		
	}
	
	public void run() {
		
		String ultimaMsgem = "";
		
		try {
			
			for(int i = 0; i < servidor.getArrayMensagens().size(); i++) //exibe o historico de msgs
				System.out.println( servidor.getArrayMensagens().get(i) );
			 	 
			while( true ) {
				
				Thread.sleep( 200 ); //para nao inundar a "rede" com milhoes de requisicoes por segundo
						
				if ( servidor.getArrayMensagens().size() > cont ) {

					ultimaMsgem =  servidor.getArrayMensagens().get( servidor.getArrayMensagens().size() - 1 );
					
					System.out.println( ultimaMsgem );

					this.cont++;
					
					if( cliente.isClienteOut() )
						break;
					
				}
				
			}	
		
		} catch ( RemoteException e ) { //por estar usando o servidor
			
			System.out.println( "Erro ao ler mensagens (remote). Contatar suporte." );
			
		} catch ( InterruptedException e ) { //para a Thread.sleep

			System.out.println( "Erro ao ler mensagens (threadSleep). Contatar suporte." );
		
		}
	
	}

}
