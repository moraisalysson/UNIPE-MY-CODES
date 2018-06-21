package models;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Produto[] array_produtos = new Produto[10000];
		Vendedor[] array_vendedores = new Vendedor[300];
		Gerente[] array_gerentes = new Gerente[50];
		Venda[] array_vendas = new Venda[10000];
		MenuPrincipal main_menu = new MenuPrincipal();
		
		main_menu.exibirMenu(array_vendedores, array_gerentes, array_produtos, array_vendas);

	}

}
