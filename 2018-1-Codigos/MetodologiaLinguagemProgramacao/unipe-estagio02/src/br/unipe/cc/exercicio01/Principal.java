package br.unipe.cc.exercicio01;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		ManipulaValores manipulaValores = new ManipulaValores();
		int opcao = 0;
		int[] vetor = null;
		
		
		while(true) {
			menu.menu();
			opcao = manipulaValores.obterValor();
			
			switch (opcao) {
			case 1:
				manipulaValores.inicializarVetor();
				break;
			case 2:
				int tipo = manipulaValores.obterValor();
				manipulaValores.imprimirVetor(vetor, tipo);
				break;
			}
		}
	}
	

}
