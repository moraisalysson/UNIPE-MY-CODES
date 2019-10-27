
public class TesteExemplo {

	public static void main(String[] args) {
	
		//Unica u = new Unica();
		
		Unica u1 = Unica.getInstancia();
		u1.setMensagem("Eu sou uma classe única");
		
		Unica u2 = Unica.getInstancia();
		
		if(u1 == u2) {
			System.out.println("u1 e u2 são o mesmo objeto");
			System.out.println(u1);
			System.out.println(u2);
		}

	}

}
