package classes;

public class Principal {

	public static void main(String[] args) {
		Memoria[] memoria_principal = new Memoria[5000];
		RegistradorGeral[] registradores_gerais = new RegistradorGeral[10];
		RegistradorEspecifico reg_acumulador = new RegistradorEspecifico();
		RegistradorEspecifico reg_zero = new RegistradorEspecifico();
		RegistradorEspecifico reg_contador_instrucao = new RegistradorEspecifico();
		RegistradorEspecifico reg_prox_instrucao = new RegistradorEspecifico();
		Menu main_menu = new Menu();
		
		reg_zero.setValor(0);
		
		main_menu.exibirMenuOpcoes();
		
		
		
	}

}
