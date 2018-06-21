package models;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Produto[] array_produtos = new Produto[10000];
		Vendedor[] array_vendedores = new Vendedor[300];
		Gerente[] array_gerentes = new Gerente[50];
		Venda[] array_vendas = new Venda[10000];
		Menu main_menu = new Menu();
		
		main_menu.menuInicial(array_vendedores, array_gerentes, array_produtos, array_vendas);

	}

}
