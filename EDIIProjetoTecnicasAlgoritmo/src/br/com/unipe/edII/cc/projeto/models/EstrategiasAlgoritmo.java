package br.com.unipe.edII.cc.projeto.models;

public class EstrategiasAlgoritmo {
	
	public void sortDecrescente(int [][] matrizDados) {
		int aux0 = 0;
		int aux1 = 0;
		boolean swap;
				
		do {
			swap = false;
			
			for(int i = 0; i < matrizDados.length - 1; i++) {
				
				if( matrizDados[i][1] < matrizDados[i + 1][1] ) {
					
					aux0 = matrizDados[i][0];
					aux1 = matrizDados[i][1];
					
					matrizDados[i][0] = matrizDados[i + 1][0];
					matrizDados[i][1] = matrizDados[i + 1][1];
					
					matrizDados[i + 1][0] = aux0;
					matrizDados[i + 1][1] = aux1;
					
					swap = true;
				
				}
			}
			
		} while(swap);
		
	}

	public void sortDecrescenteProporcional(int [][] matrizDados) {
		int aux0 = 0;
		int aux1 = 0;
		boolean swap;
				
		do {
			swap = false;
			
			for(int i = 0; i < matrizDados.length - 1; i++) {
				
				if( matrizDados[i][0]/matrizDados[i][1] > matrizDados[i + 1][0]/matrizDados[i + 1][1] ) {
					
					aux0 = matrizDados[i][0];
					aux1 = matrizDados[i][1];
					
					matrizDados[i][0] = matrizDados[i + 1][0];
					matrizDados[i][1] = matrizDados[i + 1][1];
					
					matrizDados[i + 1][0] = aux0;
					matrizDados[i + 1][1] = aux1;
					
					swap = true;
				
				}
			}
			
		} while(swap);
		
	}
	
	public int contadorGuloso(Cartao cartao) {
		
		int contadorTeAmo = 0;
		int comprimentoAux = cartao.getComprimentoCartao();
		
		for(int i = 0; i < cartao.getDadosFrases().length; i++) {
			
			if(cartao.getDadosFrases()[i][0] <= comprimentoAux) {
				
				contadorTeAmo += cartao.getDadosFrases()[i][1];
				comprimentoAux -= cartao.getDadosFrases()[i][0];
			
			}
				
		}
		
		return contadorTeAmo;
	}
	
	public int cartao_dp(Cartao cartao) {

		int n = cartao.getQtdFrasesCartao() + 1;
		int w = cartao.getComprimentoCartao() + 1;
		
		int [][] matriz = new int[n][w];
		
		for(int i = 0; i <= w; i++) 
			matriz[0][i] = 0;
			
		for(int i = 1; i <= n; i++)
			matriz[i][0] = 0;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j <= w; j++) {
				
				if( cartao.getDadosFrases()[i][0] <= w ) { //cartao.getDadosFrases()[i][0] = percorre tam das frases
					
					if( cartao.getDadosFrases()[0][i] + matriz[ i - 1 ][ j - cartao.getDadosFrases()[i][0] ] 
							> matriz[ i-1 ][ j ] )
						
						matriz[i][j] = cartao.getDadosFrases()[0][i] + matriz[ i - 1 ][ j - cartao.getDadosFrases()[i][0] ];
					
					else
						
						matriz[i][j] = matriz[ i - 1 ][ j ];
				}		
				
				else
					
					matriz[i][j] = matriz[ i - 1 ][ j ];
				
			}
			
		}
		
		return matriz[n][w];
	}
	
	
	public int contadorDinamico(Cartao cartao) {
		
		int contadorTeAmo = 0;
		
		
		
		return contadorTeAmo;
	}
	
	
}
