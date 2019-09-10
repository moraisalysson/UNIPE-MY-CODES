package componentes;

public class CPU {

	public void freeze() {
		System.out.println("CPU agora está em espera.");
	}
	
	public void jump(long position) {
		System.out.println("Pulando para a posição " + position);
	}
	
	public void execute() {
		System.out.println("CPU em execução");
	}
	
}
