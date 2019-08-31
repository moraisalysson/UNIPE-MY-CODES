package testes;
import adaptadores.AdaptadorPS5ParaXbox2;
import controles.ControlePS5;
import sensores.SensorXbox2;

public class Teste {

	public static void main(String[] args) {
		//target (alvo): interface do domínicio específico que o cliente utiliza
		//adapter (adaptador): adapta a interface Adaptee para a interface Target
		//adaptee (adaptada): interface existente que necessita ser adaptada
		
		//Tem-se um Xbox2, mas deseja-se usar um controle ps5:
        SensorXbox2 adaptee = new SensorXbox2();
        ControlePS5 target = new ControlePS5();
        
        //Cria-se um falso sensor de PS5 que, na verdade, traduz e repassa os comandos para o Xbox em questão:
        AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);
        
        //Conecta-se o controle ao adapter:
        target.Conectar(adapter);
	}

}
