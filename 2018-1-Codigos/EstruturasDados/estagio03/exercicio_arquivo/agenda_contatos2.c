#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#define MAX 100

typedef struct elementos {
    char nome[50];
    int numero_telefone;
} t_elemento;

typedef struct lista {
    t_elemento vetor[MAX];
    int n;
} t_lista;

t_lista criar() {
    t_lista lista;

    lista.n = -1;

    return lista;
}

int isVazia(t_lista * lista) {
    return (lista->n == -1);
}

int isCheia(t_lista * lista) {
    return (lista->n == MAX-1);
}

int getTamanho(t_lista * lista) {
    return lista->n + 1;
}

t_elemento * getElemento(t_lista * lista, int pos) {
    // verifica se pos eh valida
    if ( (pos > lista->n) || (pos < 0) )
        return 0;

    return &(lista->vetor[pos]);
}

int compara(t_elemento dado1, t_elemento dado2) {
    return strcmp(dado1.nome, dado2.nome);
}

int getPosicaoInsercaoOrdenada(t_lista lista, t_elemento dado) {
    int n = 0;

    while (n <= lista.n) {
        if (compara(lista.vetor[n], dado) >= 0)
            return n;

        n++;
    }

    return n;
}


int deslocaDireita(t_lista * lista, int pos) {
    int i;

    for (i=lista->n + 1; i>pos; i--)
        lista->vetor[i] = lista->vetor[i-1];

    return 1;
}

int inserir (t_lista * lista, t_elemento dado) {
    int pos = 0;

    pos = getPosicaoInsercaoOrdenada(*lista, dado);

    if ( isCheia(lista) || (pos > lista->n + 1) || (pos < 0) )
        return 0;

    deslocaDireita(lista, pos);
    lista->vetor[pos] = dado;
    (lista->n)++;

    return 1;
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

int main() {
    t_lista m_agenda;
    t_elemento m_contato;
    char array_string[1000];
    int i = 0;
    FILE * arquivo;

    arquivo = fopen("dados.txt", "r");

    if (arquivo == 0)
        printf("erro ao abrir o arquivo\n");

    else {
        printf("arquivo aberto com sucesso\n");

        while ( ! feof(arquivo) ) {
            array_string[i] = fgetc(arquivo);

            if(array_string[i] == ';')
                array_string[i + 1] = '\0';

            printf("%c", array_string[i]);
            //Sleep(50);
            i++;
        }

        fclose(arquivo);
    }

    strcpy(m_contato.nome, "bob");
    m_contato.numero_telefone = 1;

    inserir(&m_agenda, m_contato);

    for(i = 0; i < m_agenda.n; i++) {
        printf("%s\n", m_agenda.vetor[i].nome);
        printf("%i\n", m_agenda.vetor[i].numero_telefone);
    }

    return 0;
}
