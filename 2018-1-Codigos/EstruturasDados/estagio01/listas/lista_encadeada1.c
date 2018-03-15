#include <stdio.h>
#include <stdlib.h>

typedef struct elementos {
	char nome[50];
} t_elemento;

typedef struct no {
	t_elemento dado;
	struct no * prox;
} t_no;

typedef t_no * t_lista;	

t_no * criaNo() {
	t_no * no = (t_no *) malloc(sizeof(t_no));
	
	if(no)
		no->prox = NULL;

	return no;		
}

t_no * getNo(t_lista lista, int pos) {
    // Retorna 0 se posicao invalida. Do contrario, retorna o elemento
    int n = 0;

    if (pos<0)
        return 0; // erro: posicao invalida

    while (lista != NULL) {
        if (n==pos)
            return lista;
        lista = lista->prox;
        n++;
    }
    return 0; // erro: posicao invalida
}


int main() {
	t_lista m_No; //ponteiro para um t_no
	t_lista no_aux; //ponteiro para um t_no
	t_lista ultimo_no; //ponteiro para um t_no
	int i = 1;
	
	m_No = criaNo(); //aloca e retorna o endereço alocado 1º nó
	ultimo_no = m_No; //como só existe um único nó, então ele também é o último
	
	while(i <= 5) {
		no_aux = criaNo(); //aloca uma memória para o próximo t_no, que é, temporariamente, chamado de auxiliar
		ultimo_no->prox = no_aux; //o último nó sempre recebe o endereço alocado do nó criado
		ultimo_no = no_aux; //
		
		i++;
	}
	 
	
	return 0;
}
