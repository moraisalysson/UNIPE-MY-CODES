#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_ALUNOS 60

typedef struct disciplina { //lista encadeada
    char nome_disciplina[30];
    float nota_final;
    struct disciplina * prox_no;
} t_no_disciplina;

typedef struct aluno {
    char matricula[10];
    t_no_disciplina * lista_disciplinas; //armazena a cabeça da lista das disciplinas
} t_elemento_aluno;

typedef struct alunos { //lista sequencial
    int ultimo_indice;
    t_elemento_aluno vetor_alunos[MAX_ALUNOS];
} t_lista_alunos;

//----------------------------------- FUNÇÕES PARA LISTA SEQUENCIAL (ALUNOS)
t_lista_alunos criarListaAluno() {
	t_lista_alunos lista;

	lista.ultimo_indice = -1;

	return lista;
}

int isCheiaAlunos(t_lista_alunos * lista) {
    return (lista->ultimo_indice == MAX_ALUNOS - 1);
}

int isVaziaAlunos(t_lista_alunos * lista_alunos) {
    return (lista_alunos->ultimo_indice == -1);
}

int deslocaDireita(t_lista_alunos * lista, int posicao) {
    int i = 0;

    for(i = lista->ultimo_indice + 1; i > posicao; i--)
        lista->vetor_alunos[i] = lista->vetor_alunos[i - 1];

    return 1;
}

int inserirDadosAluno(t_lista_alunos * lista, int posicao, t_elemento_aluno dados_aluno) {
    if ( isCheiaAlunos(lista) || (posicao > lista->ultimo_indice + 1) || (posicao < 0) )
        return 0;

    deslocaDireita(lista, posicao);

    lista->vetor_alunos[posicao] = dados_aluno;
    (lista->ultimo_indice)++;

    return 1;
}

int comparaDadosAlunos(t_elemento_aluno dados_aluno1, t_elemento_aluno dados_aluno2) {
    return strcmp(dados_aluno1.matricula, dados_aluno2.matricula);
}

int getPosicaoAluno(t_lista_alunos * lista, t_elemento_aluno dado_aluno) {
    int i;

    for (i = 0; i <= lista->ultimo_indice; i++)
        if (comparaDadosAlunos(lista->vetor_alunos[i], dado_aluno) == 0)
            return i;

    return -1;
}

int deslocaAlunosEsquerda(t_lista_alunos * lista, int posicao) {
    int i;

    for (i = posicao; i < (lista->ultimo_indice); i++)
        lista->vetor_alunos[i] = lista->vetor_alunos[i + 1];

    return 1;
}

int removerDadosAluno(t_lista_alunos * lista, int posicao) {
    if ( (posicao > lista->ultimo_indice) || (posicao < 0) )
        return 0;

    deslocaAlunosEsquerda(lista, posicao);

    (lista->ultimo_indice)--;

    return 1;
}

//----------------------------------- FUNÇÕES PARA LISTA ENCADEADA (DISCIPLINAS)
t_no_disciplina * criaNoDisciplina() {
    t_no_disciplina * no = (t_no_disciplina *) malloc(sizeof(t_no_disciplina)); //no recebe uma área de memória que é um ponteiro para t_nó

    if(no) //se nó for diferente de NULL ou 0:
        no->prox_no = NULL; //o elemento criado será o último da lista

    return no;
}

int isVaziaDisciplinas(t_no_disciplina * lista_disciplinas) {
    return (lista_disciplinas == NULL);
}

t_no_disciplina * getNoDisciplina(t_no_disciplina * lista_disciplinas, int posicao) {
    int index = 0;

    if(posicao < 0)
        return 0; //posição inválida

    while(lista_disciplinas != NULL) { //verifica a lista até o último elemento
        if(index == posicao) //quando chegar na posição, retorna o nó
            return lista_disciplinas;

        lista_disciplinas = lista_disciplinas->prox_no;

        index++;
    }

    return 0; //posição inválida
}

int comparaDisciplinas(t_no_disciplina disciplina01, t_no_disciplina disciplina02) {
    return strcmp(disciplina01.nome_disciplina, disciplina02.nome_disciplina);
}

int getPosicaoDisciplina(t_no_disciplina * lista_disciplinas, t_no_disciplina disciplina) { //verificar adequacao desta função
    int posicao = 0;

    while(lista_disciplinas != NULL) {
        if(comparaDisciplinas(*lista_disciplinas, disciplina) == 0)
            return posicao;

        lista_disciplinas = lista_disciplinas->prox_no;

        posicao++;
    }

    return -1;
}

int inserirDadosDisciplina(t_no_disciplina ** lista_disciplinas, int posicao, t_no_disciplina dados_disciplina) {
    t_no_disciplina * no_aux, * novo_no;

    if(posicao == 0) {  //criando o primeiro nó
        novo_no = criaNoDisciplina();

        if(novo_no == NULL)
            return 0; //erro: memória insuficiente

        strcpy(novo_no->nome_disciplina, dados_disciplina.nome_disciplina);
        novo_no->nota_final = dados_disciplina.nota_final;

        novo_no->prox_no = *lista_disciplinas; //o PROX_NO do novo nó recebe o endereço guardado na lista_disciplinas

        *lista_disciplinas = novo_no; //lista_disciplinas recebe o endereço do novo_no

        return 1;
    }
//inserção após a 1ª posição, em lista não vazia
    no_aux = getNoDisciplina(*lista_disciplinas, posicao - 1); //pega o endereço do nó  da posição anterior a que se quer inserir

    if(no_aux == NULL)
        return 0; //posição inválida

    novo_no = criaNoDisciplina(); //cria o novo nó

    if(novo_no == NULL)
        return 0; //memória insuficiente

    strcpy(novo_no->nome_disciplina, dados_disciplina.nome_disciplina);
    novo_no->nota_final = dados_disciplina.nota_final;

    novo_no->prox_no = no_aux->prox_no; //novo->prox recebe o endereço do nó que virá após ele, que estava armazenado em p
    no_aux->prox_no = novo_no; //e p->prox receberá o enedereço do novo nó

    return 1;
}

t_no_disciplina * getDisciplina(t_no_disciplina lista_disciplinas, int posicao) {
    t_no_disciplina * no = getNoDisciplina(&lista_disciplinas, posicao);

    if(no != NULL)
        return no;

    return NULL;
}

//------------------------------------ FUNÇÕES EXTRA
void fechaPrograma() {
    //free();
    system("cls");
    printf(">> Programa encerrado pelo usuario.\n");
}

void inserirDados(t_lista_alunos * lista_alunos) {
    t_elemento_aluno aluno_local;
    t_no_disciplina disciplina_local;

    system("cls");

    printf("--- INSERCAO DE DADOS ---\n\n");

    aluno_local.lista_disciplinas = criaNoDisciplina(); //criando o início da lista

    strcpy(aluno_local.matricula, "1520011423");

    strcpy(disciplina_local.nome_disciplina, "estrutura");
    disciplina_local.nota_final = 9.9;

    inserirDadosAluno(lista_alunos, 0, aluno_local);
    inserirDadosDisciplina(&(lista_alunos->vetor_alunos[0].lista_disciplinas), 0, disciplina_local);

    strcpy(disciplina_local.nome_disciplina, "dados");
    disciplina_local.nota_final = 9.0;

    inserirDadosDisciplina(&(lista_alunos->vetor_alunos[0].lista_disciplinas), 0, disciplina_local);

}

void exibirHistoricos(t_lista_alunos lista_alunos) {
    system("cls");

    int index = 0;
    t_no_disciplina * no_auxiliar;

    no_auxiliar = lista_alunos.vetor_alunos[0].lista_disciplinas;

    printf("---- HISTORICOS ----\n\n");

    if(isVaziaAlunos(&lista_alunos))
        printf("~~ SEM HISTORICOS PARA EXIBIR ~~\n\n");

    else {
        while(no_auxiliar->prox_no != NULL) {
            printf("  > DISCIPLINA: %s\n", no_auxiliar->nome_disciplina);
            printf("  > NOTA FINAL: %.1f\n", no_auxiliar->nota_final);
            no_auxiliar = no_auxiliar->prox_no;

            puts("");
        }
    }

    system("pause");
    system("cls");
}

int menu(t_lista_alunos * lista_alunos) {
    int opcao = 0;

    while(1){
        printf("ALUNO: ALYSSON SILVA DE MORAIS\n");
        printf("DISCIPLINA: ESTRUTURA DE DADOS I\n");
        printf("PROFESSOR: WALACE BONFIM\n");

        printf("\n     HISTORICO ESCOLAR     \n\n");

        printf("1 - INSERIR MATRICULAS, DISCIPLINAS E NOTAS\n");
        printf("2 - EXIBIR HISTORICOS\n");
        printf("0 - SAIR\n");

        printf("\nDIGITE SUA OPCAO: ");
        scanf("%d", &opcao);

        switch(opcao) {
            case 0:
                fechaPrograma();
                break;

            case 1:
                inserirDados(lista_alunos);
                break;

            case 2:
                exibirHistoricos(*lista_alunos);
                break;

            default:
                printf("\n>> Informe uma opcao valida.\n\n");
                system("pause");
                system("cls");
        }

        if(opcao == 0)
            break;
    }
}

//---------------------------------------------------- MAIN
int main() {
    t_lista_alunos m_lista_alunos = criarListaAluno();

    menu(&m_lista_alunos);
/*
    m_aluno1.lista_disciplinas = criaNoDisciplina(); //criando o início da lista

    strcpy(m_aluno1.matricula, "1520011423");

    strcpy(m_disciplina1.nome_disciplina, "estrutura");
    m_disciplina1.nota_final = 9.9;

    inserirDadosAluno(&listaAlunos01, 0, m_aluno1);
    inserirDadosDisciplina(&m_aluno1.lista_disciplinas, 0, m_disciplina1);

    strcpy(m_disciplina1.nome_disciplina, "dados");
    m_disciplina1.nota_final = 9.0;

    inserirDadosAluno(&listaAlunos01, 0, m_aluno1);
    inserirDadosDisciplina(&m_aluno1.lista_disciplinas, 0, m_disciplina1);


    printf("%s\n", m_aluno1.lista_disciplinas->nome_disciplina);
    printf("%.1f\n", m_aluno1.lista_disciplinas->nota_final);

    printf("%s\n", m_aluno1.lista_disciplinas->prox_no->nome_disciplina);
    printf("%.1f\n", m_aluno1.lista_disciplinas->prox_no->nota_final);
*/
    return 0;
}
