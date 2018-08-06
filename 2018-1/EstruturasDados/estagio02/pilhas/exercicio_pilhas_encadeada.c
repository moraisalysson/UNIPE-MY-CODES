#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct elemento {
    char placa[8];
}  t_elemento;

typedef struct no {
    t_elemento dado;
    struct no * prox;
} t_no;

typedef t_no * t_pilha;

t_no * criarNo() {
    t_no * no = (t_no *) malloc(sizeof(t_no));

    if(no)
        no->prox = NULL;

    return no;
}

int isVazia(t_pilha pilha) {
    return (pilha == NULL);
}

int push(t_pilha * pilha, t_elemento dado) {//insere elemento no topo da pilha
    t_no * novo;

    novo = criarNo();

    if(novo == NULL)
        return 0; //erro na alocação de memória

    novo->dado = dado;
    novo->prox = *pilha; //novo nó aponta para o elemento que está abaixo
    *pilha = novo; //topo da pilha passa a ser o novo nó

    return 1;
}

t_elemento pop(t_pilha * pilha) { //remove elemento do topo e retona o elemento
    t_no * aux;
    t_elemento valor = {""};

    if(isVazia(*pilha))
        return valor; //erro: pilha vazia

    aux = *pilha; //aux recebe o endereço do topo da pilha
    valor = (*pilha)->dado;
    *pilha = aux->prox; //topo da pilha passa a ser o t_no que estava abaixo do topo ou NULL
    free(aux); //libera a memória do t_no que continha o topo da pilha e que está sendo removido

    return valor;
}

t_elemento getElementoTopo(t_pilha pilha) {
    t_elemento valor = {""};

    if(isVazia(pilha))
        return valor;

    else
        return pilha->dado;
}

t_pilha criarPilha() {
    t_pilha pilha = NULL;

    return pilha;
}

/* para uso junto com a função menu()
int inserirCarro(t_pilha * pilha) {
    char placa[8] = "";
    t_elemento dado_inserir;

    while(1) {
        printf("Informe o numero da placa ou 'p' para parar: ");
        scanf("%s", placa);

        if(!strcmp(placa, "p"))
            break;

        strcpy(dado_inserir.placa, placa);

        if( push(pilha, dado_inserir) == 0)
            printf("\n>> Erro ao inserir.\n");
    }

    if(! isVazia(*pilha))
        printf("\nPlaca do ultimo carro: %s\n\n", getElementoTopo(*pilha).placa);

    return 1; //inserções ok
}

int retirarCarro(t_pilha * pilha) {
    char continuar[1] = "n";

    printf("--- RETIRADA DE CARROS ---\n");
    while(1) {
        if(isVazia(*pilha)) {
            printf("\n>> Nao ha carros para retirar.\n\n");
            return 0;
        }

        printf("\nPlaca do carro retirado: %s\n", (pop(pilha)).placa);

        printf("\nDeseja retirar outro carro [s / n]? ");
        scanf("%s", continuar);

        if( ! strcmp(continuar, "n"))
            break;
    }

    return 1; //remocoes ok

}

int exibirCarrosBeco(t_pilha pilha) {
    int qtd_carros = 0;

    printf("--- CARROS NO BECO ---\n\n");

    if(isVazia(pilha)) {
        printf(">> Nao ha carros para exibir.\n\n");
        return 0;
    }

    while(pilha != NULL) {
        printf("Placa: %s\n", getElementoTopo(pilha).placa);
        pilha = pilha->prox;
        qtd_carros++;
    }

    printf("\nTotal de carros: %d\n\n", qtd_carros);

    return 1;
}

void menu() {
    int opcao = 0;
    t_pilha pilha = criarPilha();

    while(opcao != 1 || opcao != 2 || opcao != 3){
        printf("--- MENU ---\n");
        printf("1 - Inserir carro\n");
        printf("2 - Retirar carro\n");
        printf("3 - Exibir carros do beco\n");
        printf("0 - Fechar\n");

        printf("Informe sua opcao: ");
        scanf("%d", &opcao);

        getchar();

        if(opcao == 0)
            break;

        switch(opcao) {
            case 1:
                system("cls");
                inserirCarro(&pilha);
                system("pause");
                system("cls");
                break;

            case 2:
                system("cls");
                retirarCarro(&pilha);
                system("pause");
                system("cls");
                break;

            case 3:
                system("cls");
                exibirCarrosBeco(pilha);
                system("pause");
                system("cls");
                break;

            default:
                printf("\n>> Opcao invalida.\n\n");
                system("pause");
                system("cls");
        }
    }
}*/

int entradaCarros(t_pilha * pilha, int qtd_carros) {
    char placa[8] = "";
    t_elemento dado_inserir;

    for( ; qtd_carros > 0; qtd_carros--) {
        printf("Informe o numero da placa do carro: ");
        scanf("%s", placa);

        strcpy(dado_inserir.placa, placa);

        if( push(pilha, dado_inserir) == 0) {
            printf("\n>> Erro ao inserir.\n");
            return 0;
        }
    }

    return 1; //inserções ok
}

int saidaCarross(t_pilha * pilha, int * qtd_carros) {
    for(; *qtd_carros > 0; (*qtd_carros)--) {
        if(isVazia(*pilha)) {
            printf("\n>> Nao ha carros para retirar.\n");
            return 0;
        }

        printf("\nSaida do carro de placa: %s", (pop(pilha)).placa);
    }
}

int main() {
    //menu() versão com menu
    int qtd_carros = 3;

    t_pilha m_pilha = NULL;

    entradaCarros(&m_pilha, qtd_carros); //a)

    printf("\nPlaca do 3o carro: %s\n", getElementoTopo(m_pilha).placa); //b)

    saidaCarross(&m_pilha, &qtd_carros); //c)

    printf("\n\nQuantidade de carros no beco: %d\n", qtd_carros); //d)

    return 0;
}
