package models;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		Produto[] array_produtos = new Produto[1000000];
		Vendedor[] array_vendedores = new Vendedor[3000000];
		Gerente[] array_gerentes = new Gerente[1000000];
		Venda[] array_vendas = new Venda[1000000];
		MenuPrincipal main_menu = new MenuPrincipal();
		
		main_menu.exibirMenu(array_vendedores, array_gerentes, array_produtos, array_vendas);

	}

}
