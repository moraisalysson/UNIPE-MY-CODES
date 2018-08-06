package registrando_uma_venda;

public class VendaMain {

	public static void main(String[] args) {
		Produto[] array_produtos = new Produto[2];
		array_produtos[0] = new Produto("001", "Notebook", 1500.00, 800, false); //sem desconto
		array_produtos[1] = new Produto("002", "Monitor", 100.00, 80.00, true); //com desconto
		
		Vendedor[] array_vendedores = new Vendedor[2];
		array_vendedores[0] = new Vendedor("Alysson", "Rua Tal", "001");
		array_vendedores[1] = new Vendedor("Morais", "Rua Tal 2", "002");
		
		Venda[] array_vendas = new Venda[3];
		array_vendas[0] = new Venda();
		array_vendas[1] = new Venda();
		array_vendas[2] = new Venda();
		
//1ª venda:		
		array_vendas[0].setVendedor(array_vendedores[0]);
		array_vendas[0].setProduto(array_produtos[0]);
		array_vendas[0].setQuantidadeItens(2);
		array_vendas[0].imprimir();
		
//2ª venda:		
		array_vendas[1].setVendedor(array_vendedores[1]);
		array_vendas[1].setProduto(array_produtos[1]);
		array_vendas[1].setQuantidadeItens(3);
		array_vendas[1].setDesconto(0.10);
		array_vendas[1].imprimir();
		
//3ª venda		
		array_vendas[2].setVendedor(array_vendedores[1]);
		array_vendas[2].setProduto(array_produtos[1]);
		array_vendas[2].setQuantidadeItens(2);
		array_vendas[2].setDesconto(0.30);
		array_vendas[2].imprimir();

	}

}