#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	int a,b,c;
	float promedio;
	
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);

	if(a < 0 || b < 0 || c < 0){
        printf("Error: todos los valores deben ser enteros positivos");
    } else {
        promedio = ((float)(a) + (float)(b) + (float)(c))/3;
        printf("El promedio es: %.2f\n", promedio);
    }

	return 0;
}