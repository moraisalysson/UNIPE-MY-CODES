#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 10

typedef struct contatos {
	char nome[50];
	char numero1[15]; 
	char numero2[15];
} t_contato;

typedef struct agenda {
	t_contato vetor_elementos[MAX];
	int indice_ultimo_elemento; //índice do último elemento da agenda
} t_agenda;


//--------------------------------------------------- FUNÇÕES:

t_agenda criarAgenda() {
	t_agenda agenda;
	
	agenda.indice_ultimo_elemento = -1;
	
	return agenda;
}

int isCheia(t_agenda * agenda) {
	return ( agenda->indice_ultimo_elemento == (MAX - 1) );
}

int inserirContatos(t_agenda * agenda, int indice_da_insercao, t_contato contato) {
	if( isCheia(agenda) || indice_da_insercao > (agenda->indice_ultimo_elemento + 1) || indice_da_insercao < 0 ) {
		return 0;
	}
	
	//deslocaDireita(agenda, indice_da_insercao);
	agenda->vetor_elementos[indice_da_insercao] = contato;
	
	(agenda->indice_ultimo_elemento)++;
	
	return 1;
}

void solicitaDadosNovoContato(t_contato * contato) {
	char resposta_inserir_numero2 = 'n';
	
	printf("--- Novo contato ---");
	
	printf("\nNome: ");
	scanf("%s", contato->nome);
	
	printf("Numero 01: ");
	scanf("%s", contato->numero1);
	
	getchar(); //pegando o /n
	
	printf("Deseja inserir outro numero ('s' ou 'n')? ");
	scanf("%c", &resposta_inserir_numero2);
	
	if(resposta_inserir_numero2 == 's') {
		printf("Numero 02: ");
		scanf("%s", contato->numero2);
	}
	
	puts("");
}

//--------------------------------------------------- MAIN:
int main() {
	t_agenda m_agenda01; //*m de main()
	t_contato m_contato;
	int quant_contatos = 0;
	int i = 0;
	
	m_agenda01 = criarAgenda();
	
	//exibirMenu();
	
	printf("Informe quantos contatos deseja adicionar: ");
	scanf("%d", &quant_contatos);
	
	for(i = 0; i < quant_contatos; i++) {
		solicitaDadosNovoContato(&m_contato);
			
		inserirContatos(&m_agenda01, 0, m_contato);
	}
	
	return 0;
}
