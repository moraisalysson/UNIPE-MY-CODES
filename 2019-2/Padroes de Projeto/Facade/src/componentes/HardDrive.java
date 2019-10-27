package componentes;

public class HardDrive {
	
	public byte[] read(long lba, int size) {
		byte[] dados = new byte[5];
		
		dados[1] = (byte) (lba / size);
		
		return dados;
	}
	
}
