#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	int n;
	do{
		printf("Ingrese los n terminos a mostrar (maximo 30): ");
		scanf("%d", &n);
	}while(n > 30);

	printf("Serie de Fibonacci:\n");
	long num1=0, num2=1, suma=0;	
	for(int i=0; i<n; i++){
		if(i == 0){
			printf("%ld", num1);
		}else if(i == 1){
			printf(" %ld", num2);
		}else{
			long num3 = num1 + num2;
			suma+=num3;
			printf(" %ld", num3);
			num1 = num2;
			num2 = num3;
		}
	}
	printf("\nSuma total de los n terminos: %ld", suma+1);
	
	return 0;
}