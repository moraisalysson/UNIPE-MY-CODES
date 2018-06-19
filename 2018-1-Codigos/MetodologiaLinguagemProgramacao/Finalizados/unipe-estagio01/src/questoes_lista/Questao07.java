package questoes_lista;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float [][] notas = new float[6][2];
		float [] medias = new float[6];
		float media_classe = 0.0f;
		int quantidade_aprovados = 0;
		int quantidade_recuperacao = 0;
		int quantidade_reprovados = 0;
		
		for(int index_aluno = 0; index_aluno < 6; ++index_aluno) {
			for(int index_nota = 0; index_nota < 2; ++index_nota) {
				recebeNotas(notas, index_aluno, index_nota, input);
			}
		
			calculaMedias(medias, notas, index_aluno);
					
			imprimeSituacao(medias, index_aluno);
			
			if(medias[index_aluno] > 7.00) {
				++quantidade_aprovados;
			} 
			else if (medias[index_aluno] > 3.00) {
				++quantidade_recuperacao;
			} 
			else {
				++quantidade_reprovados;
			}
		
		}
		
		media_classe = calculaMediaClasse(medias, media_classe);
		
		exibeRealatorio(quantidade_aprovados, quantidade_recuperacao, quantidade_reprovados, media_classe);	
		
		input.close();
	}
	
	public static boolean verificaFaixaNota(float notas[][], int index_aluno, int index_nota) {
		if(notas[index_aluno][index_nota] >= 0.0 && notas[index_aluno][index_nota] <= 10.0) {
			return true;
		}
		
		return false;
	}
	
	public static void recebeNotas(float notas[][], int index_aluno, int index_nota, Scanner input) {
		
		while(true) {
			System.out.printf("Informe a %dª nota do %dº aluno: ", index_nota + 1, index_aluno + 1);
		
			notas[index_aluno][index_nota] = input.nextFloat();
			
			if(verificaFaixaNota(notas, index_aluno, index_nota)) {
				break;
			} else {
				System.out.println("-> Informe uma nota válida <-");
			}
		}
		
	}
	
	public static void calculaMedias(float medias[], float notas[][], int index_aluno) {	
		medias[index_aluno] = (notas[index_aluno][0] + notas[index_aluno][1]) / 2;
	}
	
	public static float calculaMediaClasse(float medias[], float media_classe) {	
		for(int index_media = 0; index_media < 6; ++index_media) {
		
			media_classe = media_classe + medias[index_media];
		}
		
		return media_classe / 6;
	}
	
	public static void imprimeSituacao(float medias[], int index_aluno) {
		if(medias[index_aluno] > 7.00) {
			
			System.out.printf("%nAluno Aprovado! :D%n%n");
		
		} 
		else if (medias[index_aluno] > 3.00) {
			
			System.out.printf("%nAluno em Recuperacao/Exame :|%n%n");
		
		} 
		else {
			
			System.out.printf("%nAluno Reprovado ;(%n%n");
		
		}
	}
	
	public static void exibeRealatorio(int qnt_aprovados, int qnt_recuperacao, int qnt_reprovados, float media_classe) {
		System.out.printf("Quantidade de aprovados: %d%n", qnt_aprovados);
		System.out.printf("Quantidade em recuperação: %d%n", qnt_recuperacao);
		System.out.printf("Quantidade de reprovados: %d%n", qnt_reprovados);
		System.out.printf("Média da classe: %.1f%n", media_classe);
	}
}	
