package br.com.unipe.cc.estrutura.projeto.persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map.Entry;

public class GerarCSV {
	
	 FileWriter writer; 
	 
	public void gerarCSVFile() {
		
		try {
			this.writer = new FileWriter("tabela.csv", false);
			
			writer.append("Algoritmo;100;1.000;5.000;10.000;50.000\n");
			
		}
		
		catch(IOException e) {
	         e.printStackTrace();
	    }
		
	}
	
	public void addDataCSVFile(TreeMap<Integer, Double> mapaMedias, String algoritmo) {
	    
		 try {
			
			 writer.append(String.format("%s;", algoritmo) );
			
	        for(Entry<Integer, Double> media : mapaMedias.entrySet()) {
	        	
	        	writer.append( String.format("%.2f;", media.getValue()) );
	        	
			}
	        
	        writer.append("\n");
	        
	    }
	   
	    catch(IOException e) {
	         e.printStackTrace();
	    }
		 
	}
	
	public void fechar() throws IOException {
		this.writer.append("\nEquipe:;\n"
				+ "Aysson Silva de Morais;\n"
				+ "José Everaldo Gomes;\n"
				+ "Israel Oriente Nunes;");
		
		System.out.println("Arquivo gerado com sucesso."); 
		
		this.writer.flush();
		this.writer.close();
		
	}
}
