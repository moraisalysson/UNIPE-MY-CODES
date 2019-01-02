package br.com.unipe.edII.cc.projeto.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.unipe.edII.cc.projeto.models.*;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<CasosTeste> arrayCasos = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		EstrategiasAlgoritmo estrategias = new EstrategiasAlgoritmo();
				
		while(true) {
		
			CasosTeste caso = new CasosTeste();
			
			caso.setNumeroDoCaso( arrayCasos.size() + 1 ); //add número a cada instância de 'caso'
			
			Cartao cartao = new Cartao();
			
			cartao.inputDadosCartao(); //recebe os dados do teclado
		
			if( cartao.getComprimentoCartao() == 0 && cartao.getQtdFrasesCartao() == 0 )
				break;
			
			estrategias.sortDecrescenteProporcional( cartao.getDadosFrases() ); //ordenando a matriz de dados
					
			caso.setQtdGulosa( estrategias.contadorGuloso(cartao) ); //faz a contagem e add o retorno ao caso
			caso.setQtdDinamica( estrategias.contadorGuloso(cartao) ); //faz a contagem e add o retorno ao caso
			
			arrayCasos.add(caso); 
			
			System.out.println();
		
		}
	
		for(int i = 0; i < arrayCasos.size(); i++) {
			
			System.out.printf("\nTeste %d\n", arrayCasos.get(i).getNumeroDoCaso() );
			
			System.out.printf("Solução Gulosa: %d\n", arrayCasos.get(i).getQtdGulosa() );
			System.out.printf("Solução Programação Dinâmica: %d\n", arrayCasos.get(i).getQtdDinamica() );
			
		}
		
	}

}
