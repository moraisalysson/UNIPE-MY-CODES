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

typedef t_no * t_lista; //t_lista � um ponteiro para t_n�

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
    t_lista m_lista;
    t_elemento m_dado;
    int posicao = 0;

    m_lista = criaNo();
//guarguar 3 nomes:
    strcpy(m_dado.nome, "alysson");
    inserir(&m_lista, 0, m_dado);

    strcpy(m_dado.nome, "silva");
    inserir(&m_lista, 1, m_dado);

    strcpy(m_dado.nome, "morais");
    inserir(&m_lista, 2, m_dado);

//mostrar os nomes:
    printf("Nome [pos: 0]: %s\n", (getElemento(m_lista, 0))->nome);
    printf("Nome [pos: 1]: %s\n", (getElemento(m_lista, 1))->nome);
    printf("Nome [pos: 2]: %s\n", (getElemento(m_lista, 2))->nome);

//buscar e mostrar um nome:
    printf("Informe a posicao para procurar: ");
    scanf("%d", &posicao);

    printf("Nome procurado: %s\n", (getElemento(m_lista, posicao))->nome);

//remover um elemento:
    printf("Informe o nome para apagar: ");
    scanf("%d", m_dado.nome);

    posicao = getPosicao(m_lista, m_dado);

    remover(&m_lista, posicao - 1);

    printf("Nome [pos: 0]: %s\n", (getElemento(m_lista, 0))->nome);
    printf("Nome [pos: 1]: %s\n", (getElemento(m_lista, 1))->nome);
    printf("Nome [pos: 2]: %s\n", (getElemento(m_lista, 2))->nome);


    return 0;
}

//------------------------------------------------- FUNCTIONS

t_no * criaNo() {
    t_no * no = (t_no *) malloc(sizeof(t_no)); //no recebe uma �rea de mem�ria que � um ponteiro para t_n�

    if(no) //se n� for diferente de NULL ou 0:
        no->prox = NULL; //o elemento criado ser� o �ltimo da lista

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
        return 0; //posi��o inv�lida

    while(lista != NULL) { //verifica a lista at� o �ltimo elemento
        if(n == posicao) //quando chegar na posi��o, retorna o n�
            return lista;

        lista = lista-> prox;
        n++;
    }

    return 0; //posi��o inv�lida
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
            return 0; //erro: mem�ria insuficiente

        novo->dado = dado;
        novo->prox = *lista;
        *lista = novo;

        return 1;
    }
//inser��o ap�s a 1� posi��o, em lista n�o vazia
    p = getNo(* lista, posicao - 1); //pega o endere�o do n�  da posi��o anterior a que se quer inserir

    if(p == NULL)
        return 0; //posi��o inv�lida

    novo = criaNo(); //cria o novo n�

    if(novo == NULL)
        return 0; //mem�ria insuficiente

    novo->dado = dado;
    novo->prox = p->prox; //novo->prox recebe o endere�o do n� que vir� ap�s ele, que estava armazenado em p
    p->prox = novo; //e p->prox receber� o enedere�o do novo n�

    return 1;
}

int remover(t_lista * lista, int posicao) {
    t_no * anterior, * p;

    if(isVazia(*lista))
        return 0; //lista vazia

    if(posicao < 0)
        return 0; //pois��o inv�lida

    if(posicao == 0) {
        p = *lista; //recebe o endere�o armazenado em lista
        *lista = p->prox; //lista recebe o endere�o do pr�ximo n� da pr�pria lista
    } else {
        anterior = getNo(*lista, posicao - 1); //pega-se o ENDERE�O do n� da posi��o anterior a que se quer remover

        if(anterior == NULL)
            return 0;

        p = anterior->prox; //p recebe o endere�o do n� que se quer remover

        if(p == NULL)
            return 0;

        anterior->prox = p->prox; //anterior recebe o endere�o do n� que vinha depois do elemento removido
        //as altera��o s�o feitas diretamente nos N�S (refer�ncia)
    }

    free(p); //liberando a mem�ria do n� que foi removido

    return 1;
}

t_elemento * getElemento(t_lista lista, int posicao) {
    t_no * no = getNo(lista, posicao);

    if(no != NULL)
        return &(no->dado);

    return NULL;
}
