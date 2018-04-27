package execptions;

public class Principal {

	public static void main(String[] args) throws ErroChecado, SaldoInsuficienteException, ClienteNaoEncontradoException, ContaNaoEncontradaException {
		ContaCorrente conta = new ContaCorrente();
		
		conta.sacar(50.0f);
		
		conta.buscaCliente("Morais");
		
		conta.buscaConta(0001234);		
		
		ErroChecado erro = new ErroChecado("Erro");
		throw erro;
		
		//System.out.println("Alô"); //trecho de código que nunca será alcançado por causa do throw acima
	}

}
