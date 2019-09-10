
package br.com.analisadorlexico;

public enum TipoToken {

  PALAVRA_RESERVADA ("PR"),
  OPERADOR ("OP"),
  PONTUACAO ("SP"),
  LITERAL_INTEIRO ( "LI" ),
  LITERAL_PONTO_FLUTUANTE ( "LPF" ),
  LITERAL_CHAR ( "LC" ),
  LITERAL_STRING ( "LS" ),
  IDENTIFICADOR ("ID"),
  ERRO ("ERRO");
	
  // Atributos
	
  private String label;
  
  // Construtor
  
  private TipoToken(String label) {
	
    this.label = label;
    
  }
  
  // Métodos
 
  public java.lang.String toString() {
	
    return this.label;

  }
	
}
