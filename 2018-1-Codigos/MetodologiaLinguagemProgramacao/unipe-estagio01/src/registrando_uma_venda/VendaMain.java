package registrando_uma_venda;

public class VendaMain {

	public static void main(String[] args) {
		Produto produto_sem_desconto = new Produto("001", "Notebook", 1500.00, 800, false);
		Vendedor vendedor01 = new Vendedor("Alysson", "Rua Tal", "001");
		Venda venda01 = new Venda();
		
		Produto produto_com_desconto = new Produto("002", "Monitor", 100.00, 80.00, true);
		Vendedor vendedor02 = new Vendedor("Morais", "Rua Tal 2", "001");
		Venda venda02 = new Venda();

		Venda venda03 = new Venda();
		
		venda01.setVendedor(vendedor01);
		venda01.setProduto(produto_sem_desconto);
		venda01.setQuantidadeItens(2);
		System.out.printf("Comissão do vendendor: %.2f %% %n%n", vendedor01.getComissao() * 100);
		venda01.imprimir();
		
		venda02.setVendedor(vendedor02);
		venda02.setProduto(produto_com_desconto);
		venda02.setQuantidadeItens(3);
		venda02.setDesconto(0.10);
		System.out.printf("Comissão do vendendor: %.2f %% %n", vendedor02.getComissao() * 100);
		venda02.imprimir();
		
		venda03.setVendedor(vendedor02);
		venda03.setProduto(produto_com_desconto);
		venda03.setQuantidadeItens(2);
		venda03.setDesconto(0.30);
		System.out.printf("Comissão do vendendor: %.2f %% %n", vendedor02.getComissao() * 100);
		venda03.imprimir();
	}

}