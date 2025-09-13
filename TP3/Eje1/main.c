#include <stdio.h>
#include <stdlib.h>

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	float x = 0, y = 0;
	float *ptr;
	
	do{
		printf("Ingrese el valor de X: ");
		scanf("%f", &x);		
	}while(x <= 0);
	
	do{
		printf("Ingrese el valor de Y: ");
		scanf("%f", &y);		
	}while(y <= 0);
	
	printf("\nDir. Memoria\t\tValorVariable\tValorPuntero\n");
	ptr=&x;
	printf("%p\t%.2f\t\t%.2f\n", ptr, x,*ptr);
	ptr=&y;
	printf("%p\t%.2f\t\t%.2f\n", ptr, y,*ptr);
	
	return 0;
}