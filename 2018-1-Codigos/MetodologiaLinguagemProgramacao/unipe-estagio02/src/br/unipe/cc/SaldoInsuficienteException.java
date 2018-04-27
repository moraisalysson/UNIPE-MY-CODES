package execptions;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException() {
		super("Sem saldo na conta");
	}
}
