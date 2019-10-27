package componentes;

public class Memory {
	public void load(long position, byte data[]) {
		System.out.println("Carregando " + data[1] + " na posição de memória " + position + ".");
	}
}
