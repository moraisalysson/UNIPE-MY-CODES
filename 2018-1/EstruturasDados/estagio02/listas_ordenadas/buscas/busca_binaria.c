//Apenas para listas ORDENADAS
//Mais indicada para listas SEQUENCIAIS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//------------------------------------- FUNÇÕES PADRÃO -------------------------------------

int buscaBinariaRecursiva(int vetor[], int inicio, int fim, int elemento_buscado) {
    int meio = inicio + (fim - inicio) / 2;

    if(fim < inicio) //se TRUE, o elemento não está na lista
        return -1;

    if(vetor[meio] == elemento_buscado)
        return meio; //retona o índice do elemento procurado, quando achado na lista

    if(vetor[meio] < elemento_buscado)
        return buscaBinaria(vetor, meio + 1, fim, elemento_buscado);
        //como o elemento procurado é MAIOR que o do meio, então a busca continua a DIREITA do vetor

    else
        return buscaBinaria(vetor, inicio, meio - 1, elemento_buscado);
        //como o elemento procurado é MENOR que o do meio, então a busca continua a ESQUERDA do vetor
}

int buscaBinariaIterativa(int vetor[], int fim, int elemento_buscado) {
    int inicio = 0;
    int meio;

    while(inicio <= fim) {
        meio = (inicio + fim) / 2;

        if(elemento_buscado == vetor[meio])
            return meio;

        else if(elemento_buscado < vetor[meio])
            fim = meio - 1;

        else
            inicio = meio + 1;
    }

    return -1; //elemento não encontrado
}

//------------------------------------- MAIN -------------------------------------
int main() {
    return 0;
}
