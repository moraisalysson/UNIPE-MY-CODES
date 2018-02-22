#include <stdio.h>

typedef struct comodo {
	char nome[15];
	float lado1;
	float lado2;
	float area;
} t_comodo;

typedef struct casa {
	t_comodo comodos[5];
} t_casa;

int main() {
	t_casa casa1;
	int i = 0;
	double area_total = 0;
	
	for(i = 0; i <= 4; i++) {
		printf("\nNome do comodo: ");
		scanf("%s", casa1.comodos[i].nome);
		
		printf("Lado 1: ");
		scanf("%f", &casa1.comodos[i].lado1);
		
		printf("Lado 2: ");
		scanf("%f", &casa1.comodos[i].lado2);
		
		casa1.comodos[i].area = casa1.comodos[i].lado1 * casa1.comodos[i].lado2;
		
		area_total = area_total + casa1.comodos[i].area;
	}
	
	printf("Area total da casa: %.2f\n", area_total);
	
	return 0;
}
