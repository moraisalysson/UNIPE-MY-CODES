package br.unipe.cc.exercicio01;

public class Menu {
	
	public void exibirMainMenu() {
		System.out.println("---- MENU ------");
		for(int i = 0; i < 6; i++) {
			System.out.printf("Opção %d - Questão 0%d%n", i + 1, i + 1);
		}
	}
	
	public int informarOpcao() {
		int opcao = 0;
		EntradasUser input = new EntradasUser();
		
		opcao = input.getInteiro("Informe a opção desejada: ");
		
		return opcao;
	}
	
	public void chamaOpcao(int opcao) {
		switch (opcao) {
			case 1:
				Vetor q = new Vetor();
				EntradasUser input = new EntradasUser();
				int tamanho = 0;
				int valor = 0;
				
				tamanho = q.defineTamVetor();
				q.criaVetor(tamanho);
				valor = input.getInteiro("Informe o valor que deseja inicializar o vetor: ");
				q.populaVetor(valor);
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
			
			case 4:
				
				break;
				
			case 5:
				
				break;
	
			case 6:
				
				break;
		}
	}
}
