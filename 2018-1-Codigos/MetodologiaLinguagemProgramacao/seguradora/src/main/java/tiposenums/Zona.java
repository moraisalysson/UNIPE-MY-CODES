package tiposenums;

/**
 * 
 * @author ALYSSON
 *
 */

public enum Zona {
	
	RURAL (1, "Rural"),
	SUBURBANA (2, "Suburbana"),
	URBANA (3, "Urbana");
	
    private int codigo;
    private String descricao;
    
    private Zona(int codigo, String descricao) {
    	this.codigo = codigo;
    	this.descricao = descricao;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
