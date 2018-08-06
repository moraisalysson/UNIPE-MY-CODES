#include <stdio.h>
#include <math.h>

int main() {
	int i;
	double x = 1;
	double total = 0;

	printf("Total: %.0f\n", pow(2,64) - 1); //<-- modo 1: fórmula de recursão ((2^n) - 1)

	for(i = 0; i < 64; i++) { //<-- modo 2
		total = total + x; 
		x = x * 2;
	}

	printf("Total: %.0f\n", total);

	return 0;	
}