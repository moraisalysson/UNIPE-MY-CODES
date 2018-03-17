#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct elemento {
    char nome[50];
} t_elemento;

typedef struct no {
    t_elemento dado;
    struct no * prox;
} t_no;

typedef t_no * t_lista; //t_lista é um ponteiro para t_nó

t_no * criaNo();
int isVazia(t_lista lista);
int getTamanho(t_lista lista);
t_no * getNo(t_lista lista, int posicao);
int compara(t_elemento dado1, t_elemento dado2);
int getPosicao(t_lista lista, t_elemento dado);
int inserir(t_lista * lista, int posicao, t_elemento dado);
int remover(t_lista * lista, int posicao);
t_elemento * getElemento(t_lista lista, int posicao);

//------------------------------------------------- MAIN

int main() {
    t_lista p;
    t_lista no_aux;

    p = criaNo();
    p->prox = criaNo();

    strcpy((p->dado).nome, "no 1");
    strcpy(((p->prox)->dado).nome, "no 2");

    printf("Elemento: %s\n", (p->dado).nome);
    printf("Elemento: %s\n", ((p->prox)->dado).nome);

    printf("Tamanho: %d\n", getTamanho(p));

    no_aux = p->prox;

    p->prox = criaNo();
    (p->prox)->prox = no_aux; //adicionando o na 2ª posição

    strcpy(((p->prox)->dado).nome, "no 3");

    printf("Elemento: %s\n", p->dado.nome);
    printf("Elemento: %s\n", p->prox->dado.nome);
    printf("Elemento: %s\n", p->prox->prox->dado.nome);

    printf("Posicao elemento [%s]: %d\n",  p->dado.nome, getPosicao(p, p->dado));
    printf("Posicao elemento [%s]: %d\n",  p->prox->dado.nome, getPosicao(p, p->prox->dado));
    printf("Posicao elemento [%s]: %d\n",  p->prox->prox->dado.nome, getPosicao(p, p->prox->prox->dado));

    printf("Tamanho: %d\n", getTamanho(p));

    return 0;
}

//------------------------------------------------- FUNCTIONS

t_no * criaNo() {
    t_no * no = (t_no *) malloc(sizeof(t_no)); //no recebe uma área de memória que é um ponteiro para t_nó

    if(no) //se nó for diferente de NULL ou 0:
        no->prox = NULL; //o elemento criado será o último da lista

    return no;
}

int isVazia(t_lista lista) {
    return (lista == NULL);
}

int getTamanho(t_lista lista) {
    int n = 0;

    while(lista != NULL) {
        lista = lista->prox;
        n++;
    }

    return n;
}

t_no * getNo(t_lista lista, int posicao) {
    int n = 0;

    if(posicao < 0)
        return 0; //posição inválida

    while(lista != NULL) { //verifica a lista até o último elemento
        if(n == posicao) //quando chegar na posição, retorna o nó
            return lista;

        lista = lista-> prox;
        n++;
    }

    return 0; //posição inválida
}

int compara(t_elemento dado1, t_elemento dado2) {
    return strcmp(dado1.nome, dado2.nome);
}

int getPosicao(t_lista lista, t_elemento dado) {
    int n = 0;

    while(lista != NULL) {
        if(compara(lista->dado, dado) == 0)
            return n;

        lista = lista->prox;
        n++;
    }

    return -1;
}

int inserir(t_lista * lista, int posicao, t_elemento dado) {
    t_no * p, * novo;

    if(posicao == 0) {
        novo = criaNo();

        if(novo == NULL)
            return 0; //erro: memória insuficiente

        novo->dado = dado;
        novo->prox = * lista;
        *lista = novo;

        return 1;
    }

    p = getNo(* lista, posicao - 1);

    if(p == NULL)
        return 0; //posição inválida

    novo = criaNo();

    if(novo == NULL)
        return 0; //memória insuficiente

    novo->dado = dado;
    novo->prox = p->prox;
    p->prox = novo;

    return 1;
}

int remover(t_lista * lista, int posicao) {
    t_no * anterior, * p;

    if(isVazia(*lista))
        return 0; //lista vazia

    if(posicao < 0)
        return 0; //poisção inválida

    if(posicao == 0) {
        p = *lista;
        *lista = p->prox;
    } else {
        anterior = getNo(*lista, posicao - 1);

        if(anterior == NULL)
            return 0;

        p = anterior->prox;

        if(p == NULL)
            return 0;

        anterior->prox = p->prox;
    }

    free(p);

    return 1;
}

t_elemento * getElemento(t_lista lista, int posicao) {
    t_no * no = getNo(lista, posicao);

    if(no != NULL)
        return &(no->dado);

    return NULL;
}
