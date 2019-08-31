package testes;

import adaptadores.AdaptadorXbox2ParaPS5;
import controles.ControleXbox2;
import sensores.SensorPS5;

public class Teste3 {
	public static void main(String[] args) {
		//target (alvo): interface do domínicio específico que o cliente utiliza
		//adapter (adaptador): adapta a interface Adaptee para a interface Target
		//adaptee (adaptada): interface existente que necessita ser adaptada
		
    	//Tem-se um Xbox2 e mas deseja-se usar um controle Nintendo64:
        SensorPS5 adaptee = new SensorPS5();
        ControleXbox2 target = new ControleXbox2();
        
        //Cria-se um falso sensor do Nintendo64 que, na verdade, traduz e repassa os comandos para o Xbox em questão:
        AdaptadorXbox2ParaPS5 adapter = new AdaptadorXbox2ParaPS5(adaptee);
        
        //Conecta-se o controle ao adapter:
        target.Conectar(adapter);

	}
}
