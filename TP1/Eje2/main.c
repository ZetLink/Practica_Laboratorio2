#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	int a,b,c;
	
	printf("Ingrese primer numero: ");
	scanf("%d", &a);
	printf("\nIngrese segundo numero: ");
	scanf("%d", &b);
	printf("\nIngrese tercer numero: ");
	scanf("%d", &c);
	
	float promedio = ((float)(a) + (float)(b) + (float)(c))/3;
	printf("\nEl promedio es: %.2f", promedio);
	
	return 0;
}