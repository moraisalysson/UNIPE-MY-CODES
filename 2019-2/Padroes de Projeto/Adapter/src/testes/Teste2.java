package testes;
import adaptadores.AdaptadorNintendo64ParaXbox2;
import controles.ControleNintendo64;
import sensores.SensorXbox2;

public class Teste2 {

	public static void main(String[] args) {
		//target (alvo): interface do domínicio específico que o cliente utiliza
		//adapter (adaptador): adapta a interface Adaptee para a interface Target
		//adaptee (adaptada): interface existente que necessita ser adaptada
		
    	//Tem-se um Xbox2 e mas deseja-se usar um controle Nintendo64:
        SensorXbox2 adaptee = new SensorXbox2();
        ControleNintendo64 target = new ControleNintendo64();
        
        //Cria-se um falso sensor do Nintendo64 que, na verdade, traduz e repassa os comandos para o Xbox em questão:
        AdaptadorNintendo64ParaXbox2 adapter = new AdaptadorNintendo64ParaXbox2(adaptee);
        
        //Conecta-se o controle ao adapter:
        target.Conectar(adapter);

	}

}
