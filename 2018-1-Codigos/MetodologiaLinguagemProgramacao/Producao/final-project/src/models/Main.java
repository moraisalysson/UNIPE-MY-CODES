package models;

public class Main {

	public static void main(String[] args) {
		Produto[] array_produtos = new Produto[2];
		Vendedor[] array_vendedores = new Vendedor[2];
		Menu main_menu = new Menu();
	
		array_vendedores[0] = new Vendedor();
		array_vendedores[1] = new Vendedor();
		array_produtos[0] = new Produto();
		array_produtos[1] = new Produto();
		
		main_menu.exibirMenu(array_vendedores, array_produtos);

	}

}
