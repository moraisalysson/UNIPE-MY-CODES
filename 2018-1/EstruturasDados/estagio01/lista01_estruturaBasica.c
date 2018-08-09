#define MAX 10

typedef struct elementos {
	char nome[50];	
} t_elemento;

typedef struct lista {
	t_elemento vetor[MAX];
	int n; //índice do último elemento
} t_lista;

//--------------------------------------------------- MAIN:
int main() {

	
	return 0;
}

//--------------------------------------------------- FUNÇÕES:
t_lista criar() {
	t_lista lista;
	
	lista.n = -1;
	
	return lista;
}

t_lista isVazia(t_lista * lista) {
	return (lista->n == -1);
}

int isCheia(t_lista * lista) {
	return (lista->n == (MAX - 1));
}

int getTamanho(t_lista * lista) {
	return lista->n + 1; //índice + 1
}

t_elemento * getElemento(t_elemento * lista, int pos) {
	if((pos > lista->n) || (pos < 0))
		return 0;
	
	return &(lista->vetor[pos]);
}

int getPosicao(t_lista * lista, t_elemento dado) {
	int i;
	
	for(i = 0; i <= lista->n; i++) {
		if(compara(lista->vetor[i], dado) == 0)
			return i;
	}
	
	return -1;
}

int compara(t_elemento dado1, t_elemento dado2) {
	return strcmp(dado1.nome, dado2.nome);
} 

int inserir(t_lista * lista, int pos, t_elemento dado) {
	if(isCheia(lista) || (pos > lista->n + 1) || (pos < 0)) {
		return 0;
	}
	
	deslocaDireita(lista, pos);
	
	lista->vetor[pos] = dado;
	
	(lista->n)++;
	
	return 1;
}

int deslocaDireita(t_lista * lista, int pos) {
	int i;
	
	for(i = lista->n + 1; i > pos; i--) {
		lista->vetor[i] = lista->vetor[i - 1];
	}
	
	return 1;
}

int remover(t_lista * lista, int pos) {
	if((pos > lista->n) || (pos < 0))
		return 0;
		
	deslocaEsquerda(lista, pos);
	
	(lista->n)--;
	
	return 1;
}

int deslocaEsquerda(t_lista * lista, int pos) {
	int i;
	
	for(i = pos; i < (lista->n); i++)
		lista->vetor[i] = lista->vetor[i + 1];
		
	return 1;
}


