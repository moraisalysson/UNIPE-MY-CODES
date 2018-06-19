package modelos;

public class VendaMain {

	public static void main(String[] args) {
		Produto[] array_produtos = new Produto[2];
		Vendedor[] array_vendedores = new Vendedor[2];
		int contador_vendedores = 0, contador_produtos = 0;
		
		//array_vendedores[0] = new Vendedor();
		//array_vendedores[1] = new Vendedor();
		
		//contador_vendedores = array_vendedores[0].cadastrarDados(contador_vendedores);
		//contador_vendedores = array_vendedores[1].cadastrarDados(contador_vendedores);
		
		array_produtos[0] = new Produto();
		array_produtos[1] = new Produto();
		
		contador_produtos = array_produtos[0].cadastrarDados(contador_produtos);
		contador_produtos = array_produtos[1].cadastrarDados(contador_produtos);

		
	}

}