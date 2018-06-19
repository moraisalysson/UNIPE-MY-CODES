package br.unipe.cc.aula12042018;

public class Principal {

	public static void main(String[] args) {
		Menu menu = new Menu();
		ManipulaValores manipulaValores = new ManipulaValores();
		int opcao = 0;
		int[] vetor = null;
		
		while(true) {
			menu.menu();
			opcao = manipulaValores.obterValor();
			
			switch (opcao) {
			case 1:
				vetor = manipulaValores.inticializarVetor();
				break;
			case 2:
				menu.menuImpressao();
				int tipo = manipulaValores.obterValor();
				manipulaValores.imprimirVetor(vetor, tipo);
				break;
			}
		}
	}
	

}
