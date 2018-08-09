package integrador;

public class Pontos {
	private int recebidos;
	private int trocados;
	private int saldoPontos;
	Coletor coletor = new Coletor();
	
	public int getRecebidos() {
		return recebidos;
	}
	
	public void setRecebidos() { //valores hipotéticos
		if(this.coletor.identificaMaterial() == 0)
			this.recebidos = 0;
		
		else if(this.coletor.identificaMaterial() == 1)
			this.recebidos = 50; //Metal
		
		else if(this.coletor.identificaMaterial() == 2)
			this.recebidos = 10; //Papel
		
		else if(this.coletor.identificaMaterial() == 3)
			this.recebidos = 20; //Plástico
		
		else if(this.coletor.identificaMaterial() == 1)
			this.recebidos = 30; //Vidro
	}
	
	public int getTrocados() {
		return trocados;
	}

	public void setTrocados(int trocados) {
		this.trocados = trocados;
	}	

	public int getSaldoPontos() {
		return saldoPontos;
	}

	public void setSaldoPontos() {
		this.saldoPontos = this.recebidos - this.trocados;
	}
	
}
