package cap3;

import javax.swing.JOptionPane;

public class Exe313InvoiceTest {

	public static void main(String[] args) {
		String codigo, descricao;
		int quantidade;
		double valor;
		
		codigo = JOptionPane.showInputDialog("C�digo: ");
		descricao = JOptionPane.showInputDialog("Descri��o: ");
		quantidade = Integer.parseInt( JOptionPane.showInputDialog("Quantidade: ") );
		valor = Double.parseDouble( JOptionPane.showInputDialog("Valor unit�rio: R$ ") );
		
		Exe313Invoice invoice1 = new Exe313Invoice(codigo, descricao, quantidade, valor);
		
		System.out.println(invoice1.getRelatorio());
	}

}
