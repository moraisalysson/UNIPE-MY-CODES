import java.rmi.RemoteException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {

	private Scanner input;
	private String nickname;
	private ChatInterface servidor;
	private boolean clienteOut; //comunica a Thread se o cliente saiu do chat
	private DateTimeFormatter formatter;
	private Instant agora;
	
	public Cliente( ChatInterface server ) {
	
		this.input = new Scanner(System.in);
		this.servidor = server;
		this.setClienteOut( false );
		
		//explicacoes sobre data/hora: https://stackoverflow.com/questions/25229124/format-instant-to-string
		this.formatter = 
			    DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                .withLocale( Locale.UK )
                .withZone( ZoneId.systemDefault() );
		this.agora = Instant.now();
		
	}

	public void enviarMsgem() throws RemoteException {
		
		String msg = "";
				
		try {
		
			while( true ) {
				
				msg = JOptionPane.showInputDialog( this.getNickname() + ": " );
								
				if( msg == null || msg.equals( "/sair" ) ) {
					
					this.servidor.receberMensagem( "(" + this.formatter.format( agora ) + ") " + this.getNickname() + " saiu do chat." );
					
					this.setClienteOut( true );
					
					break;
			
				}
				
				this.servidor.receberMensagem( "(" + this.formatter.format( agora ) + ") " + this.getNickname() + ": " + msg );
				
			}
		
		} catch( NullPointerException e ) {
						
			this.setClienteOut( true );
			
		}
	
	}
	
	public void setNickname() {
		
		System.out.print("Nickname: ");
		
		this.nickname = input.nextLine();
		
	}
	
	public String getNickname() {
		
		return this.nickname;
		
	}

	public boolean isClienteOut() {
	
		return clienteOut;
	
	}

	private void setClienteOut(boolean clienteOut) {
	
		this.clienteOut = clienteOut;
	
	}

}