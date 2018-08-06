#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>

typedef struct elemento {
    char nome[50];
    unsigned long int numero;
    int id;
} t_elemento;

typedef struct no {
    t_elemento dado;
    struct no * prox;
} t_no;

typedef t_no * t_lista; //t_lista � um ponteiro para t_n�

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
    while (lista != NULL) {
        if (compara(lista->dado, dado)>=0)
            return n;
        lista = lista->prox;
        n++;
    }

    // lista vazia, ou nao achou elemento, retorna posicao zero
    return n;
}

int inserir(t_lista * lista, t_elemento dado) {
    t_no * p, * novo;
    int posicao = 0;

    posicao = getPosicao(*lista, dado);

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

void exibirAgenda(t_lista agenda) {
    t_no * aux = agenda;

    if(isVazia(agenda)) {
        printf(">> A agenda esta vazia.\n");
        return;
    }

    printf("\nAGENDA: \n");
    while(aux != NULL) {
        printf("ID: %d\n", aux->dado.id);
        printf("Nome: %s\n", aux->dado.nome);
        printf("Telefone: %lu\n\n", aux->dado.numero);
        aux = aux->prox;
    }
}

int readArquivoParaArray(FILE * arquivo, char array[]) {
    int i = 0;

    arquivo = fopen("dados.csv", "r");

    if(arquivo == 0) {
        printf("erro ao abrir o arquivo\n");
        fclose(arquivo);
        return 0;
    }

    printf("arquivo aberto com sucesso\n");

    while ( ! feof(arquivo) ) {
        array[i] = fgetc(arquivo);

        if(array[i] == ';')
            array[i + 1] = '\0';

        if(array[i] == '\n' || array[i] == ' ')
            i--;

        i++;
    }

    fclose(arquivo);

    return 1;
}

int dadosDoArrayParaAgenda(t_lista * agenda, char array[]) {
    t_elemento contato;
    int i = 0, j = 0, itsNome = 1;
    char array_aux[50] = "";

    contato.id = 1;

    if(strlen(array) == 0)
        return 0;

    for(; i <= strlen(array); i++) {
        if(array[i] == ';') {
            if(itsNome) {
                strcpy(contato.nome, array_aux);
                itsNome = 0;
                j = 0;
                i++;

            } else {
                contato.numero = atoi(array_aux);

                inserir(agenda, contato);
                contato.id++;

                itsNome = 1;
                j = 0;
                i++;
            }
        }

        array_aux[j] = array[i];
        array_aux[j + 1] = '\0';
        j++;
    }

    return 1;
}

int arquivoBackupAgenda(FILE * arquivo, t_lista agenda) {
    t_no * aux = agenda;

    arquivo = fopen("backup.csv", "w");

   if(arquivo == 0) {
        printf("erro ao abrir o arquivo\n");
        fclose(arquivo);
        return 0;
    }

    printf("arquivo aberto com sucesso\n");

    while(aux != NULL) {
        fprintf(arquivo, "%d;%s;%lu;\n", aux->dado.id, aux->dado.nome, aux->dado.numero);
        aux = aux->prox;
    }

    fclose(arquivo);

    return 1;
}

int exibirAgendaBacukp(FILE * arquivo) {
    char array[1000] = "";
    int i = 0;

    arquivo = fopen("backup.csv", "r");

   if(arquivo == 0) {
        printf("erro ao abrir o arquivo\n");
        fclose(arquivo);
        return 0;
    }

    printf("\nDados do arquivo de backup (ID; nome; telefone): \n");
    while ( ! feof(arquivo) ) {
        array[i] = fgetc(arquivo);

        printf("%c", array[i]);

        i++;
    }


    return 1;
}

int main() {
    t_lista m_agenda;
    t_elemento m_contato;
    char array_string[1000], array_backup[1000];
    FILE * arquivo, * arquivo_backup;

    readArquivoParaArray(arquivo, array_string);

    dadosDoArrayParaAgenda(&m_agenda, array_string);

    exibirAgenda(m_agenda);

    arquivoBackupAgenda(arquivo_backup, m_agenda);

    exibirAgendaBacukp(arquivo_backup);

    return 0;
}
