
public class Unica {
	
	private static Unica instancia;
	private String mensagem;
	
	private Unica() {
	}
	
	public static Unica getInstancia() {
		if(instancia == null) {
			instancia = new Unica();
		}
		return instancia;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String toString() {
		return "Unica{" + "mensagem=" + mensagem + "}";
	}
}
