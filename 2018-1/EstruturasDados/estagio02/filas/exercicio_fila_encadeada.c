#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TAM_NOME 30

typedef struct pessoa {
    char nome[TAM_NOME];
} t_pessoa;

typedef struct no {
    t_pessoa pessoa;
    struct no * prox;
} t_no;

typedef struct fila {
    int qnt_elementos;
    t_no * inicio;
    t_no * fim;
} t_fila;


t_fila * criarCabeca() {
    t_fila * fila = (t_fila *) malloc(sizeof(t_fila));

    if(fila) {
        fila->inicio = NULL;
        fila->qnt_elementos = 0;
        fila->fim = NULL;
    }

    return fila;
}

t_no * criarNo() {
    t_no * no = (t_no *) malloc((sizeof(t_no)));

    if(no)
        no->prox = NULL;

    return no;
}

int filaItsVazia(t_fila fila) {
    return fila.qnt_elementos == 0;
}

int inserirPessoa(t_fila * fila, t_pessoa pessoa_nova) {
    t_no * novo = criarNo();

    if(novo == NULL)
        return 0;

    novo->pessoa = pessoa_nova;

    if(filaItsVazia(*fila))
        fila->inicio = novo;

    else
        (fila->fim)->prox = novo;

    fila->fim = novo;
    fila->qnt_elementos++;

    return 1;
}

t_pessoa removerPessoa(t_fila * fila) {
    t_pessoa pessoa_remover = {""};
    t_no * aux;

    if(filaItsVazia(*fila))
        return pessoa_remover;

    pessoa_remover = (fila->inicio)->pessoa;

    if(fila->inicio == fila->fim)
        fila->fim = NULL;

    aux = fila->inicio; //para liberar a memória do nó que saiu

    fila->inicio = (fila->inicio)->prox;

    free(aux);

    --(fila->qnt_elementos);

    return pessoa_remover;
}

void exibirFila(t_fila fila) {
    t_no * aux = fila.inicio;
    int i = 0;

    if(filaItsVazia(fila)) {
        printf(">> A fila esta vazia.\n");
        return;
    }

    printf("\nFILA: \n");
    while(aux != NULL) {
        printf("%do = %s\n", i + 1, aux->pessoa.nome);
        aux = aux->prox;
        i++;
    }

}

int entramPessoas(t_fila * fila) {
    int i = 0;
    t_pessoa nova_pessoa;

    printf("--- ENTRANDO PESSOAS NA FILA ---\n");
    for(; i < 4; i++) {
        printf("\n%do da fila: ", i + 1);
        scanf("%s", nova_pessoa.nome);

        getchar();

        inserirPessoa(fila, nova_pessoa);

        exibirFila(*fila);
    }

    system("pause");
    system("cls");

    return 1;
}

int saemPessoas(t_fila * fila) {
    int i = 0;
    t_pessoa nova_pessoa;

    if(filaItsVazia(*fila)) {
        printf(">> Nao ha pessoas para execluir.\n");
        return 0;
    }

    printf("--- SAINDO PESSOAS DA FILA ---\n\n");
    for(; i < 3; i++) {
        printf("Pessoa que esta saindo da fila: %s\n", removerPessoa(fila).nome);

        exibirFila(*fila);
    }

    system("pause");
    system("cls");

    return 1;
}


int main() {

    t_fila * main_fila = criarCabeca(); //a) criar fila

    entramPessoas(main_fila); //b) entram 4 pessoas e a cada entrada mostrar as pessoas da fila na ordem "da primeira até a última"

    saemPessoas(main_fila); //c) saem 3 pessoas e a cada saída mostrar as pessoas da fila na ordem "da primeira até a última"

    entramPessoas(main_fila); //d) entram mais 4 pessoas e a cada entrada mostrar as pessoas da fila na ordem "da primeira até a última"

    return 0;
}
