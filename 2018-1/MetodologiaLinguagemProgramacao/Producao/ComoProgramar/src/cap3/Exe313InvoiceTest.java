package cap3;

import javax.swing.JOptionPane;

public class Exe313InvoiceTest {

	public static void main(String[] args) {
		String codigo, descricao;
		int quantidade;
		double valor;
		
		codigo = JOptionPane.showInputDialog("Código: ");
		descricao = JOptionPane.showInputDialog("Descrição: ");
		quantidade = Integer.parseInt( JOptionPane.showInputDialog("Quantidade: ") );
		valor = Double.parseDouble( JOptionPane.showInputDialog("Valor unitário: R$ ") );
		
		Exe313Invoice invoice1 = new Exe313Invoice(codigo, descricao, quantidade, valor);
		
		System.out.println(invoice1.getRelatorio());
	}

}
