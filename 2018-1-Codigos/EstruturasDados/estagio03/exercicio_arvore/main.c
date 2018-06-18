#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>

typedef struct elementos {
    int valor;
} t_elemento;

typedef struct no {
    struct no * esq;
    t_elemento dado;
    struct no * dir;
} t_no;

typedef t_no* t_arvore;

void gotoxy(int x, int y) {
  COORD c;
  c.X = x - 1;
  c.Y = y - 1;
  SetConsoleCursorPosition (GetStdHandle(STD_OUTPUT_HANDLE), c);
}

t_no * criar () {
    t_no * no = (t_no*) malloc(sizeof(t_no));

    if (no)
        no->esq = no->dir = NULL;

    return no;
}

int isVazia (t_no * no) {
    return (no == NULL);
}

int compara(t_elemento dado1, t_elemento dado2) {
    if(dado1.valor > dado2.valor)
        return 1;

    if(dado1.valor < dado2.valor)
        return -1;

    return 0;
}

t_no * busca(t_arvore tree, t_elemento dado) {
    if (tree == NULL)
        return NULL;

    if (compara(tree->dado, dado) == 0)
        return tree;

    if (compara(tree->dado, dado) > 0)
        return busca(tree->esq, dado);
    else
        return busca(tree->dir, dado);
}

t_no * buscaSetPai(t_arvore tree, t_elemento dado, t_no ** pai) {

    if (tree == NULL) {
        *pai = NULL;
        return NULL;
    }
    if (compara(tree->dado, dado)==0)
        return tree;

    if (compara(tree->dado, dado)>0) {
        *pai = tree;
        return buscaSetPai(tree->esq, dado, pai);
    }
    else {
        *pai = tree;
        return buscaSetPai(tree->dir, dado, pai);
    }
}

int insereRaiz(t_arvore* tree, t_elemento dado) {
    t_no* novo;

    if (*tree != NULL)
        return 0; // erro: ja existe raiz
    novo = criar();
    if (novo == NULL)
        return 0; // erro: memoria insuficiente
    novo->dado = dado;
    *tree = novo;

    return 1;
}

int inserir (t_arvore *tree, t_elemento item) {
    int ok;
    // se a raiz for nula, entao insere na raiz
    if (*tree == NULL) {
        *tree = criar();
        if (*tree == NULL)
            return 0;
        (*tree)->dado = item;
        return 1;
    }
    if (compara((*tree)->dado, item)<0)
        ok = inserir (&((*tree)->dir), item);
    else
        if (compara((*tree)->dado, item)>0)
            ok = inserir (&((*tree)->esq), item);
        else
            ok = 0;
    return ok;
}

int remover (t_arvore *tree, t_elemento item) {
    t_no *no, // no aponta para o no a ser removido
        *pai, // pai aponta para o pai do no
        *sub, // sub aponta que ira substituir o no no
        *paiSuce, // pai do no sucessor
        *suce; // sucessor do no no
    no = *tree; pai=NULL;
    // procura o no a ser removido, e seta o seu pai.
    no = buscaSetPai(*tree, item, &pai);
    if (no==NULL)
        return 0; // a chave nao existe na arvore, nao conseguiu remover

    // agora iremos ver os dois primeiros casos, o no tem um filho no maximo
    if (no->esq == NULL)
        sub = no->dir;
    else {
        if (no->dir == NULL)
           sub = no->esq;
        else { // caso em que o no tem dois filhos
             paiSuce=no;
             sub = no->dir;
             suce = sub->esq;   // suce eh sempre o filho esq de sub
             while (suce != NULL) {
                   paiSuce = sub;
                   sub = suce;
                   suce = sub->esq;
             }
             // neste ponto, sub eh o sucessor em ordem de no
             if (paiSuce != no) {
                //  no nao e o pai de sub, e sub == paiSuce->esq
                paiSuce->esq = sub->dir;
                // remove o no sub de sua atual posicao e o
                // substitui pelo filho direito de sub
                // sub ocupa o lugar de no
                sub->dir = no->dir;
             }
             // define o filho esquerdo de sub de modo que sub
             // ocupe o lugar de no
             sub->esq = no->esq;
        }
    }
    // insere sub na posicao ocupada anteriormente por no
    if (pai == NULL) // no eh a raiz, nao tem pai
       *tree = sub;
    else
        // verifica se o no eh o filho da esquerda ou da direita
        if (no == pai->esq)
            pai->esq = sub;
        else
            pai->dir = sub;
    free(no); // libera o no
    return 1; // verdadeiro, conseguiu remover

}

void exibirPreOrdem(t_arvore tree) {
    if (tree!=NULL) {
        printf("%d ", tree->dado.valor);
        exibirPreOrdem(tree->esq);
        exibirPreOrdem(tree->dir);
    }
}

void exibirInOrdem(t_arvore tree) {
    if (tree!=NULL) {
        exibirInOrdem(tree->esq);
        printf("%d ", tree->dado.valor);
        exibirInOrdem(tree->dir);
    }
}

void exibirPosOrdem(t_arvore tree){
    if (tree!=NULL) {
        exibirPosOrdem(tree->esq);
        exibirPosOrdem(tree->dir);
        printf("%d ", tree->dado.valor);
    }
}

void exibirGraficamente(t_arvore tree, int col, int lin, int desloc) {
    if (tree == NULL)
        return;

    gotoxy(col, lin);

    printf("%d",tree->dado.valor);

    if (tree->esq != NULL)
        exibirGraficamente(tree->esq,col-desloc,lin+2,desloc/2+1);

    if (tree->dir != NULL)
        exibirGraficamente(tree->dir,col+desloc,lin+2,desloc/2+1);
}

void esvaziar(t_arvore *tree) {
    if (*tree == NULL)
        return;
    esvaziar(&(*tree)->esq);
    esvaziar(&(*tree)->dir);
    free(*tree);
    *tree = NULL;
}

void exibirMenu() {
    int i = 0;

    printf("\n");

    for(i = 0; i < 32; i++)
        printf("-");

    printf("\n");

    printf("ALUNO: ALYSSON SILVA DE MORAIS\n");
    printf("DISCIPLINA: ESTRUTUA DE DADOS I\n");
    printf("PROFESSOR: WALACE BONFIM\n");

    for(i = 0; i < 32; i++)
        printf("-");

    printf("\n");

    printf("\n   EDITOR DE ARVORE   \n\n");

    printf("\t1 - INSERIR\n");
    printf("\t2 - REMOVER APENAS UM NO\n");
    printf("\t3 - PESQUISAR\n");
    printf("\t4 - ESVAZIAR A ARVORE\n");
    printf("\t5 - EXIBIR A ARVORE\n");
    printf("\t0 - SAIR\n");
    printf("\n   DIGITE SUA OPCAO: ");
}

int recebeOpcao() {
    int opcao = 0;

    scanf("%d", &opcao);

    switch(opcao) {
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        case 0: printf("\nPrograma encerrado pelo usuario! o/\n\n"); break;
        default:
            printf("\n\rInforme uma opcao valida!\n");
            system("pause");
            system("cls");
    }

    return opcao;
}

void populaArvoreComDadosArquivo(t_arvore * arvore, int array_int[], int qtd_elementos) {
    t_elemento elem_aux;
    int i = 1;

    elem_aux.valor = array_int[0]; //valor que será a raiz

    insereRaiz(arvore, elem_aux);

    while(i < qtd_elementos) {
        elem_aux.valor = array_int[i];
        inserir(arvore, elem_aux);
        i++;
    }
}

void limparBuffer(void) {
    char c;
    while( (c = getchar()) != '\n' && c != EOF);
}

void opInserirNo(t_arvore * arvore) {
    t_elemento novo_dado;
    int valor = 0, i = 0;

    system("cls");
    printf("\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    printf("INSERCAO DE NOVO NO\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    printf("Digite o valor que deseja inserir: ");
    scanf("%d", &valor);

    limparBuffer();

    novo_dado.valor = valor;

    if(inserir(arvore, novo_dado) == 0) {
        printf("Nao foi possivel inserir o novo valor.\n");
        return;
    }

    system("pause");
    system("cls");
}

void opRemoverNo(t_arvore * arvore) {
    t_elemento no_a_remover;
    int valor = 0, i = 0;

    system("cls");
    printf("\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    printf("REMOCAO DE UM NO\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    printf("Digite o valor que deseja remover: ");
    scanf("%d", &valor);

    limparBuffer();

    no_a_remover.valor = valor;

    if(remover(arvore, no_a_remover) == 0)
        printf("\nNao foi possivel remover o valor ou ele nao existe na arvore.\n\n");

    else
        printf("\nNo removido com sucesso. :)\n\n");

    system("pause");
    system("cls");
}

void opPesquisarValor(t_arvore * arvore) {
   t_elemento no_procurado;
    int valor = 0, i = 0;

    system("cls");
    printf("\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    printf("BUSCANDO UM NO\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    printf("Digite o valor que deseja procurar: ");
    scanf("%d", &valor);

    limparBuffer();

    no_procurado.valor = valor;

    if(busca(*arvore, no_procurado) == NULL)
        printf("\nO valor procurado nao existe na arvore. :(\n\n");

    else
        printf("\nA arvore contem o valor procurado. :)\n\n");

    system("pause");
    system("cls");
}

void opEsvaziarArvore(t_arvore * arvore) {
    esvaziar(arvore);

    printf("\n! ! ! Arvore esvaziada com sucesso ! ! !\n\n");

    system("pause");
    system("cls");
}

void opExibirArvore(t_arvore * arvore) {
    int i = 0;

    system("cls");
    printf("\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    printf("EXIBINDO A ARVORE\n");

    for(i = 0; i < 20; i++)
        printf("-");

    printf("\n");

    if(isVazia(*arvore))
        printf("\nA arvore esta vazia.\n\n");

    printf("\nPRE-ORDEM\n");
    exibirPreOrdem(*arvore);
    printf("\n");

    printf("\nIN-ORDEM\n");
    exibirInOrdem(*arvore);
    printf("\n");

    printf("\nPOS-ORDEM\n");
    exibirPosOrdem(*arvore);
    printf("\n");

    printf("\nGRAFICAMENTE\n");
    exibirGraficamente(*arvore, 15, 17, 3);

    printf("\n\n");
    system("pause");
    system("cls");
}

void callFunctions(int opcao, t_arvore * arvore) {
    switch(opcao) {
        case 1:
            opInserirNo(arvore);
            break;

        case 2:
            opRemoverNo(arvore);
            break;

        case 3:
            opPesquisarValor(arvore);
            break;

        case 4:
            opEsvaziarArvore(arvore);
            break;

        case 5:
            opExibirArvore(arvore);
            break;
    }
}

int dadosArquivoParaArrayChar(FILE * arquivo, char array[]) {
    int i = 0;

    arquivo = fopen("dados.csv", "r");

    if(arquivo == 0) {
        printf("erro ao abrir o arquivo\n");
        fclose(arquivo);
        return 0;
    }

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

int arrayCharParaArrayInt(char array_char[], int array_int[]) {
    int i = 0, j = 0, k = 0;
    char array_aux[50] = "";

    if(strlen(array_char) == 0)
        return 0;

    for(; i <= strlen(array_char); i++) {
        array_aux[j] = array_char[i];

        if(array_char[i] == ';') {
            array_aux[j + 1] = '\0';

            array_int[k] = atoi(array_aux);

            j = 0;
            k++;

        } else
            j++;
    }

    return k;
}

int main() {
    int opcao = -1, array_inteiros[1000], qtd_elementos_array_int = 0;
    char array_char[1000];
    FILE * arquivo;
    t_arvore m_arvore = NULL;

    dadosArquivoParaArrayChar(arquivo, array_char);

    qtd_elementos_array_int = arrayCharParaArrayInt(array_char, array_inteiros);

    populaArvoreComDadosArquivo(&m_arvore, array_inteiros, qtd_elementos_array_int);

    while(opcao != 0) {
        exibirMenu();
        opcao = recebeOpcao();
        callFunctions(opcao, &m_arvore);
    }

    return 0;
}
