
package br.com.analisadorlexico;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalisadorLexicoApp {

  public static void main(String[] args) {

	FileReader arquivoTeste = null;
	
	try {
	
	  arquivoTeste = new FileReader( "programas/ProgramaFuncaoMedia.txt" );
	
	}
	
	catch (FileNotFoundException e) {
	
	  e.printStackTrace();
	
	  return;
	  
	}
	
    AnalisadorLexico analisadorLexico = new AnalisadorLexico( arquivoTeste );
    		
    List<Token> tokens = new ArrayList<Token>();
    List<Token> tokensErros = new ArrayList<Token>();
    
    try {
		
      Token token = analisadorLexico.yylex();
	
      while( token != null ) {
    	  
        if( !token.getTipo().equalsIgnoreCase( TipoToken.ERRO.toString() ) ) {
        	
          tokens.add( token );
          
        } else {
        	
          tokensErros.add( token );
          
        }
        
        token = analisadorLexico.yylex();
        		
      }
      
    }
    
    catch (IOException e) {
	
      e.printStackTrace();
	
    }
    
    System.out.println( "\n   ------- Tokens Gerados ------- \n" );
    
    if( !tokens.isEmpty() ) {
    	
      for(Token token: tokens) {
    	
        System.out.println( "    Token: " + token );
        
      }
    
      System.out.println("\n  Total de tokens: " + tokens.size() );
      
    }
    
    System.out.println( "\n\n  ------- Tokens com Erros ------- \n" );
    
    if( !tokensErros.isEmpty() ) {
    	
      for(Token token: tokensErros) {
    	    	
    	System.out.println( "    Token: " + token );
    	
      }
    	
      System.out.println("\n  Total de Erros: " + tokensErros.size() );
      
    } else {
    	
      System.out.println("\n  Nenhum Erro Léxico foi identificado" );
    	
    }
    
  }
  
}
