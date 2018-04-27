package execptions;

public class ContaNaoEncontradaException extends Exception {
	
	public ContaNaoEncontradaException() {
		super("Conta nao encontrada.");
	}
	
}
