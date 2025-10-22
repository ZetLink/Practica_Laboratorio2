#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	int a, b, c_primos = 0;
	printf("Ingrese A: ");
	scanf("%d", &a);
	printf("Ingrese B: ");
	scanf("%d", &b);
	
	while(a != b){
		int aux=a, c=0;
		while(aux != 0){
			if(a % aux == 0){
				c++;
			}
			aux--;
		}
		if(c == 2){
			printf("\nNumero Primo: %d", a);
			c_primos++;
		}
		a++;
	}
	printf("\nCantidad de Primos: %d", c_primos);
	
	return 0;
}