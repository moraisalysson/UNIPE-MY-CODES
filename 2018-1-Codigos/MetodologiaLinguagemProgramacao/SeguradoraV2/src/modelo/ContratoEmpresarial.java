package modelo;


public class ContratoEmpresarial extends Contrato {

	private int numeroVisitas;
	private int numeroFuncionarios;
	private int ramo;
	
	public Float obterValorSeguro() {
		
		Float valorSeguro = obterValorPercentualImovel();
		valorSeguro += obterValorTotalFuncionarios();				
		valorSeguro += obterValorVisitas();
		valorSeguro += obterValorRamo();
		
		return valorSeguro;
	}
	
	
	public float obterValorPercentualImovel() {
		float valor = getValorImovel() * 0.04f;
		return valor;				
	}
	
	public float obterValorTotalFuncionarios() {
		int quantidadeFuncionario = getNumeroFuncionarios();
		float valorCalculado = (quantidadeFuncionario/10) * 0.002f;
		return valorCalculado;
	}
	
	public float obterValorVisitas() {
		int visitas = getNumeroVisitas();
		float valorCalculado = (visitas/200) * 0.003f;
		return valorCalculado;
	}

/* ALTERAR ESSE MÉTODO:
	public float obterValorRamo() {
		if(getRamo().equals(RamoEnum.INDUSTRIA)) 
			return getValorImovel() * 0.01f;
		
		if(getRamo().equals(RamoEnum.COMERCIO))
			return getValorImovel() * 0.005f;		
		return 0.0f;
	}
*/
	
	public int getNumeroVisitas() {
		return numeroVisitas;
	}
	public void setNumeroVisitas(int numeroVisitas) {
		this.numeroVisitas = numeroVisitas;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	//ALTERAR MÉTODOS:
	/*
	public RamoEnum getRamo() {
		return ramo;
	}
	public void setRamo(RamoEnum ramo) {
		this.ramo = ramo;
	}
	*/
}
