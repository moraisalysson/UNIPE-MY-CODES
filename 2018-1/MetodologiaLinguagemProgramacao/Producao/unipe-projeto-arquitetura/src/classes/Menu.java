package classes;

public class Menu {
	
	public void exibirMenuOpcoes() {
		System.out.println(" --- SIMULANDO UM PROCESSADOR --- ");
		
		System.out.printf("Opera��es dispon�veis: \n" +
				"1 - Carregar um valor ou o valor de um endere�o da mem�ria para em um registrador\r\n" + 
				"2 - Carregar um valor de algum registrador para a mem�ria (com o endere�o no registrador Imediato)\r\n" + 
				"3 - AND\r\n" + 
				"4 - OR\r\n" + 
				"5 - NOT\r\n" + 
				"6 - ADD\r\n" + 
				"7 - SUB\r\n" + 
				"8 - MULT\r\n" + 
				"9 - DIV\r\n" + 
				"10 - Pulo se igual\r\n" + 
				"11 - Pulo se n�o igual\r\n" + 
				"12 - Pulo se maior\r\n" + 
				"13 - Pulo se menor\r\n" + 
				"14 - Pulo incondicional\r\n" + 
				"15 - NOP (nenhuma opera��o)\r\n");

	}
	
}
