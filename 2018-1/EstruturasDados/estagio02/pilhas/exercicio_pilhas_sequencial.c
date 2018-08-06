#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#define MAX_CARROS 3
#define TAM_PLACA 9

typedef struct carro {
    char placa[TAM_PLACA];
}  t_carro;

typedef struct beco {
    t_carro vetor[MAX_CARROS];
    int topo;
} t_beco;

t_beco criarBeco() {
	t_beco beco;

	beco.topo = -1;

	return beco;
}

int itsVazio(t_beco beco) {
	return (beco.topo == -1);
}

int itsCheio(t_beco beco) {
	return (beco.topo == (MAX_CARROS - 1));
}

t_carro getCarroTopo(t_beco beco) {
	t_carro vazio = {""};

	if(itsVazio(beco))
		return vazio;

	return beco.vetor[beco.topo];
}

t_carro pop(t_beco * beco) {
	t_carro vazio = {""};

	if(itsVazio(*beco))
		return vazio;

	return beco->vetor[(beco->topo)--];
}

int push(t_beco * beco, t_carro novo_carro) {
	if( itsCheio(*beco) )
		return 0;

	beco->vetor[++beco->topo] = novo_carro;

	return 1;
}

int formataPlaca(char placa[]) {
    char aux[1] = "";
    int i = strlen(placa);

    for(; i > 2; i--) {
        aux[0] = placa[i];
        placa[i + 1] = aux[0];
    }

    placa[3] = '-';
}

int entradaCarros(t_beco * beco) {
	int qtd_carros_beco = MAX_CARROS;
	char placa[TAM_PLACA] = "";
    t_carro novo_carro;

    for(; qtd_carros_beco > 0; qtd_carros_beco--) {
        while(1) {
            printf("Informe a placa do carro (ex.: oex2806): ");
            scanf("%s", placa);

            if(strlen(placa) < 7 || strlen(placa) > 7)
                printf("\n>> Informe uma placa com ate 7 caraceteres!\n\n");

            else
                break;

            getchar();
        }

        formataPlaca(placa);

        strcpy(novo_carro.placa, strupr(placa));

        if( push(beco, novo_carro) == 0 ) {
            printf("\n>> Erro ao inserir.\n");
            return 0;
        }
	}

    return 1; //inserção OK
}

int saidaCarros(t_beco * beco) {
	int qtd_carros_beco = beco->topo + 1, i = 0;

	for(; qtd_carros_beco > 0; qtd_carros_beco--) {
    	if( itsVazio(*beco))  {
        	printf("\n>> Nao ha carros no beco.\n");
        	return 0;
        }

        printf("\nSaida do %do carro, placa: %s\n", qtd_carros_beco, pop(beco).placa );

        for(i = 0; i < 3; i++) {
            printf(".\n");
            Sleep(300);
        }
    }
}

int main() {
    t_beco m_beco = criarBeco();

    entradaCarros(&m_beco); //letra a)

    printf("\nPlaca do 3o carro do beco: %s\n", getCarroTopo(m_beco).placa); //letra b)

    saidaCarros(&m_beco); //letra c)

    printf("\n\nQuantidade de carros no beco: %d\n", m_beco.topo + 1); //letra d)

    return 0;
}
