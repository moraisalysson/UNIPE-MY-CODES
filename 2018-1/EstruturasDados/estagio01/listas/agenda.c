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
    t_contato vetor_contatos[MAX];
    int indice_ultimo_contato; //índice do último elemento da agenda
} t_agenda;


//--------------------------------------------------- FUNÇÕES:

t_agenda criarAgenda() {
    t_agenda agenda;

    agenda.indice_ultimo_contato = -1;

    return agenda;
}


int getTamanho(t_agenda * agenda) {
  return agenda->indice_ultimo_contato + 1;
}

int isCheia(t_agenda * agenda) {
    return ( agenda->indice_ultimo_contato == (MAX - 1) );
}

int isVazia(t_agenda * agenda) {
    return (agenda->indice_ultimo_contato == -1);
}

t_contato * getContato(t_agenda * agenda, int indice_contato_procurado) {
  if(indice_contato_procurado > agenda->indice_ultimo_contato) {
    return 0;
  }

  return &(agenda->vetor_contatos[indice_contato_procurado]);
}

int compara(t_contato contato_vetor_agenda, t_contato contato_procurado) {
    return strcmp(contato_vetor_agenda.nome, contato_procurado.nome);
}

int getPosicaoContato(t_agenda * agenda, t_contato contato) {
    int i = 0;

    for(i = 0; i <= agenda->indice_ultimo_contato; i++)
        if(compara(agenda->vetor_contatos[i], contato) == 0)
            return i;

    return -1; //não achou o contato
}

int deslocaDireita(t_agenda * agenda, int indice) {
    int i = 0;

    for(i = agenda->indice_ultimo_contato + 1; i > indice; i--)
        agenda->vetor_contatos[i] = agenda->vetor_contatos[i - 1];

    return 1;
}

int inserirContatos(t_agenda * agenda, int indice_da_insercao, t_contato * contato) {
    if( isCheia(agenda) || indice_da_insercao > (agenda->indice_ultimo_contato + 1) || indice_da_insercao < 0 ) {
        return 0;
    }

    deslocaDireita(agenda, indice_da_insercao);

    agenda->vetor_contatos[indice_da_insercao] = *contato;

    (agenda->indice_ultimo_contato)++;

    return 1;
}

void solicitaDadosNovoContato(t_contato * contato) {
    char resposta_inserir_numero2 = 'n';
    
    printf("--- Novo contato ---");

    printf("\nNome: ");
    scanf("%s", contato->nome);

    printf("Numero 01: ");
    scanf("%s", contato->numero1);

    getchar(); //pegando o \n

    printf("Deseja inserir outro numero ('s' ou 'n')? ");
    scanf("%c", &resposta_inserir_numero2);

    if(resposta_inserir_numero2 == 's') {
        printf("Numero 02: ");
        scanf("%s", contato->numero2);
    } else {
        strcpy(contato->numero2, " ");
    }

    puts("");
}

int deslocaEsquerda(t_agenda * agenda, int indice_contato_removido) {
    int i = 0;

    for(i = 0; i < (agenda->indice_ultimo_contato); i++)
        agenda->vetor_contatos[i] = agenda->vetor_contatos[i + 1];

    return 1;
}

int removerContato(t_agenda * agenda, int indice_contato_remover) {
    if(indice_contato_remover > agenda->indice_ultimo_contato || indice_contato_remover < 0) {
        return 0;
    }

    deslocaEsquerda(agenda, indice_contato_remover);

    (agenda->indice_ultimo_contato)--;

    return 1;
}

int verificaPosicaoContatoParaInserir(t_agenda * agenda, t_contato * contato) {
	int indice = 0;
	
	if(isVazia(agenda))
		return 0;
		
	else {
		while(1) {
			if( strcmp(contato->nome, agenda->vetor_contatos[indice].nome) < 0) {
				return indice;
				break;
			}
			
			indice++;
		}	
	}
	
}

void exibirContatosAgenda(t_agenda * agenda) {
	int i = 0;
	
	printf("\n----- CONTATOS -----\n");
	
    for(i = 0; i < getTamanho(agenda); i++) {
        printf("Nome: %s\n", getContato(agenda, i)->nome);
        printf("Telefone 1: %s\n", getContato(agenda, i)->numero1);
        printf("Telefone 2: %s\n", getContato(agenda, i)->numero2);
        puts("");
    }
}

void escolheOpcaoMenu(t_agenda * agenda, t_contato * contato, int opcao) {

	switch (opcao) {
		case 1:
			solicitaDadosNovoContato(contato);
	
			inserirContatos(agenda, verificaPosicaoContatoParaInserir(agenda, contato), contato); ///<-------- CORRIGIR o incide
			
		break;
			
		case 2:
			printf("\n----- PROCURAR CONTATO -----\n");
		    printf("\nInforme o nome do contato que deseja procurar: ");
		    scanf("%s", contato->nome);
			getPosicaoContato(agenda, *contato) != -1 ? printf("O contato esta na Agenda: \n") : printf("Contato nao encontrado.\n");
			printf("Nome: %s\n", getContato(agenda, getPosicaoContato(agenda, *contato))->nome);
        	printf("Telefone 1: %s\n", getContato(agenda, getPosicaoContato(agenda, *contato))->numero1);
        	printf("Telefone 2: %s\n", getContato(agenda, getPosicaoContato(agenda, *contato))->numero2);
		
		break;
			
		case 3:
			exibirContatosAgenda(agenda);
			
			if(isVazia(agenda))
				printf(">> Lista vazia.\n");
			
		break;
			
		case 4:
		    printf("\n----- REMOVER CONTATO -----\n");
		    printf("Nome do contato que deseja excluir: ");
		    scanf("%s", contato->nome);
		    int posicao_contato = getPosicaoContato(agenda, *contato);
		    removerContato(agenda, posicao_contato) == 1 ? printf("\n>> Contato removido com sucesso.\n\n") : printf("\n>> Contato informado nao existe na agenda.\n\n");
		
		break;
			
		case 5:
			//atualizarContato() {
		    printf("\n----- ATUALIZAR CONTATO -----\n");
		    printf("\nInforme o nome do contato: ");
		    //solicitaDadosNovoContato(&m_contato);
		    //inserirContatos(&m_agenda01, i, m_contato);
		
		break;

	}
}

void exibirMenu(t_agenda * agenda, t_contato * contato) {
	int opcao_escolhida = 0;
	
	while(1) {	
		printf("---- MENU ----\n");
	    printf("1 - Inserir novo contato\n");
	    printf("2 - Procurar contato\n");
	    printf("3 - Exibir lista de contatos\n");
	    printf("4 - Remover contato\n");
	    printf("5 - Atualizar contato\n");
	    printf("6 - Sair\n");
	    printf("\n>> Indique sua opcao: ");
    
		scanf("%d", &opcao_escolhida);
	
		if(opcao_escolhida == 6) {
			printf("\n-- Agenda fechada pelo usuario --\n\n");
			break;
		}
		else if(opcao_escolhida < 1 || opcao_escolhida > 6) {
			printf("\n>> !! Informe uma opcao valida !! <<\n\n");
		} 
		else {
    		escolheOpcaoMenu(agenda, contato, opcao_escolhida);
    		puts("");	
    	}
		
		system("pause");
		system("cls");
	}	
}


//--------------------------------------------------- MAIN:
int main() {
    t_agenda m_agenda01; //*m de main()
    t_contato m_contato;

    m_agenda01 = criarAgenda();
    
	exibirMenu(&m_agenda01, &m_contato);
    
    return 0;
}
