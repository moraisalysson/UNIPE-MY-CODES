package componentes;

public class CPU {

	public void freeze() {
		System.out.println("CPU agora est� em espera.");
	}
	
	public void jump(long position) {
		System.out.println("Pulando para a posi��o " + position);
	}
	
	public void execute() {
		System.out.println("CPU em execu��o");
	}
	
}
