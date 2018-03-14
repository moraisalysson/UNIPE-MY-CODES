#include <stdio.h>
#include <stdlib.h>

typedef struct elemento {
	int idade;
} t_elemento;

typedef struct no { //nó
	t_elemento dado;
	struct no * prox;
} t_no;

int main() {
	
	t_no * m_no = NULL;
	t_no * aux;
	t_no * m_no2 = NULL;
	
	m_no = (t_no *) malloc(sizeof(t_no)); //1º nó
	m_no2 = (t_no *) malloc(sizeof(t_no)); //2º nó
	m_no->dado.idade = 4;
	m_no2->dado.idade = 10;
	
	
	m_no->prox = m_no2;
	m_no2->prox = NULL;
	
	aux = m_no;
	
	while(aux != NULL) {
		printf("%d\n", aux->dado.idade);
		aux = aux->prox;
	}
	
}
