package models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ManipuladorArquivo {
	
//ESCREVER/SALVAR:
	
    public static boolean salvaVendedor(Vendedor vendedor) throws IOException {
    	boolean sucess = false;
    	try {
    		FileWriter arquivo_vendedores = new FileWriter("arquivo_vendedores.txt", true); // true: indica q quer escrever no final do arquivo
    		BufferedWriter bw = new BufferedWriter(arquivo_vendedores);  	
	    	
	    	bw.write(vendedor.getCodigo() + ",");
	    	bw.write(vendedor.getNome() + ",");
	    	bw.write(vendedor.getEndereco() + ";\n");
	    	
	    	bw.close();
    		sucess = true;
			
		} catch(Exception ex) {
			System.out.println("Falha na gravação dos dados. Contate o suporte técnico.");
			sucess = false;
		}
    	
    	return sucess;
    }
 
    public static boolean salvaGerente(Gerente gerente) throws IOException {
    	boolean sucess = false;
    	
    	try {
    		FileWriter arquivo_gerentes = new FileWriter("arquivo_gerentes.txt", true); // true: indica q quer escrever no final do arquivo
    		BufferedWriter bw = new BufferedWriter(arquivo_gerentes);  	
	    	
	    	bw.write(gerente.getCodigo() + ",");
	    	bw.write(gerente.getNome() + ",");
	    	bw.write(gerente.getEndereco() + ";\n");
	    	
	    	bw.close();
    		sucess = true;
			
		} catch(Exception ex) {
			System.out.println("Falha na gravação dos dados. Contate o suporte técnico.");
			sucess = false;
		}
    	
    	return sucess;
    }
 
    public static boolean salvaProduto(Produto produto) throws IOException {
    	boolean sucess = false;
    	try {
    		FileWriter arquivo_produtos = new FileWriter("arquivo_produtos.txt", true); // true: indica q quer escrever no final do arquivo
    		BufferedWriter bw = new BufferedWriter(arquivo_produtos);  	
	    	
	    	bw.write(produto.getCodigo() + ",");
	    	bw.write(produto.getDescricao() + ",");
	    	bw.write(produto.getValorVenda() + ",");
	    	bw.write(produto.getValorCusto() + ";");
	    	
	    	bw.close();
    		sucess = true;
			
		} catch(Exception ex) {
			System.out.println("Falha na gravação dos dados. Contate o suporte técnico.");
			sucess = false;
		}
    	
    	return sucess;
    }
 
    public static boolean salvaVenda(Venda venda) throws IOException {
    	boolean sucess = false;
    	try {
    		FileWriter arquivo_vendas = new FileWriter("arquivo_vendas.txt", true); // true: indica q quer escrever no final do arquivo
    		BufferedWriter bw = new BufferedWriter(arquivo_vendas);  	
	    	
	    	bw.write(venda.getCodigo() + ",");
	    	bw.write(venda.getProduto() + ",");
	    	bw.write(venda.getVendedor() + ",");
	    	bw.write(venda.getQuantidadeItens() + ",");
	    	bw.write(venda.getDesconto() + ",");
	    	bw.write(venda.getValor() + ";");
	    	
	    	bw.close();
    		sucess = true;
			
		} catch(Exception ex) {
			System.out.println("Falha na gravação dos dados. Contate o suporte técnico.");
			sucess = false;
		}
    	
    	return sucess;
    }

//LEITURA:
    
    public static void leitor() throws IOException {

    }
}

