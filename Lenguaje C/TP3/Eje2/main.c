#include <stdio.h>
#include <stdlib.h>

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	float j=0, k=0;
	float *ptr_j, *ptr_k;
	
	do{
		printf("Ingrese el valor de J: ");
		scanf("%f", &j);
	}while(j <= 0);

	do{
		printf("Ingrese el valor de K: ");
		scanf("%f", &k);
	}while(k <= 0);
	
	ptr_j=&j;
	ptr_k=&k;

	printf("\nDir. Memoria\t\tValorVariable\tValorPuntero\n");;
	printf("%p\t%.2f\t\t%.2f\n", ptr_j, j,*ptr_j);
	printf("%p\t%.2f\t\t%.2f\n", ptr_k, k,*ptr_k);
	
	printf("\n--- Intercambio de Valores ---\n");
	float aux = *ptr_j;
	*ptr_j=*ptr_k;
	*ptr_k=aux;
	
	printf("\nDir. Memoria\t\tValorVariable\tValorPuntero\n");;
	printf("%p\t%.2f\t\t%.2f\n", ptr_j, j,*ptr_j);
	printf("%p\t%.2f\t\t%.2f\n", ptr_k, k,*ptr_k);
	   
	return 0;                               
}