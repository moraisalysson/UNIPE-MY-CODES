#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 10

typedef struct elementos {
	char nome[50];	
} t_elemento;

typedef struct lista {
	t_elemento vetor[MAX];
	int n; //índice do último elemento
} t_lista;


//--------------------------------------------------- FUNÇÕES:

t_lista criar() {
	t_lista lista;
	
	lista.n = -1;
	
	return lista;
}

int isCheia(t_lista * lista) {
    return (lista->n == MAX - 1);
}

int inserir (t_lista * lista, int pos, t_elemento dado) {
    if ( isCheia(lista) || (pos > lista->n + 1) || (pos < 0) )
        return 0;

    //deslocaDireita(lista, pos);
    lista->vetor[pos] = dado;
    (lista->n)++;
    return 1;
}

int compara(t_elemento dado1, t_elemento dado2) {
    return strcmp(dado1.nome, dado2.nome);
}

int getPosicao(t_lista * lista, t_elemento dado) {
    int i;
    for (i=0; i <= lista->n; i++)
        if (compara(lista->vetor[i], dado) == 0)
            return i;

    return -1;
}

int deslocaEsquerda(t_lista * lista, int pos) {
    int i;

    for (i=pos; i<(lista->n); i++)
        lista->vetor[i] = lista->vetor[i+1];

    return 1;
}

int remover (t_lista *lista, int pos) {
    if ( (pos > lista->n) || (pos < 0) )
        return 0;

    deslocaEsquerda(lista, pos);

    (lista->n)--;
    return 1;
}

t_elemento recebeNomes(t_elemento elemento) {
	printf("Escreva um nome: ");
	scanf("%s", elemento.nome);
	
	return elemento;
}

void procuraElementoLista(t_lista * lista, t_elemento elemento) {
	int i = -1;
	
	printf("\nProcurando na lista:\n");
	elemento = recebeNomes(elemento);
	
	i = getPosicao(lista, elemento);
	
	if(i != - 1) {
		printf("Nome encontrado na posicao [%d]\n", i);
	}
	else {
		printf("O nome nao existe na lista\n");
	}
}

void imprimirElementosLista(t_lista * lista) {
	int i = 0;
	
	printf("\nElementos da lista: \n");
	for(i = 0; i <= lista->n; i++) { 
		printf("%s\n", lista->vetor[i].nome);
	}
}

void inserirVariosElementosLista(t_lista * lista, t_elemento elemento, int quantidade_elementos) {
	int i = 0;
	
	for(i = 0; i < quantidade_elementos; i++) {
		elemento = recebeNomes(elemento);
		
		inserir(lista, i, elemento);	
	}
}

//--------------------------------------------------- MAIN:
int main() {
	t_lista lista01;
	t_elemento m_elemento;
	int quant_elementos = 0;	
	
	lista01 = criar();
	
	printf("Informe quantos elementos deseja inserir na lista: ");
	scanf("%d", &quant_elementos);
	
	inserirVariosElementosLista(&lista01, m_elemento, quant_elementos);
	
	imprimirElementosLista(&lista01);
	
	procuraElementoLista(&lista01, m_elemento);
	
	remover(t_lista *lista, int pos) {
	
	return 0;
}
