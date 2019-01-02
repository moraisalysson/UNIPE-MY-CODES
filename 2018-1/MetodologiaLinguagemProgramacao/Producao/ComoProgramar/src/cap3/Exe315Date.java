package cap3;

public class Exe315Date {
	private int dia;
	private int mes;
	private int ano;
	
	public Exe315Date(int dia, int mes, int ano) {
		if(dia > 0 || mes > 0 || ano > 0) {
			if(dia <= 31)
				this.setDia(dia);
		
			if(mes <= 12)
				this.setMes(mes);
		
		this.setAno(ano);
		}
	}
	
	public String displayDate() {
		return (this.getDia() + "/" + this.getMes() + "/" + this.getAno());
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes > 0 && mes <= 12)
			this.mes = mes;
		
		else
			this.mes = 0;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(dia > 0 && dia <= 31)
			this.dia = dia;
		
		else
			this.dia = 0;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano > 0)
			this.ano = ano;
		
		else
			this.ano = 0;
	}
	
	
}
