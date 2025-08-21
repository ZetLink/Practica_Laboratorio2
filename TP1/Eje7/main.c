#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	int n;
	do{
		printf("Ingrese los n terminos a mostrar (maximo 30): ");
		scanf("%d", &n);
	}while(n > 30);

	int num1=0, num2=1, suma=0;	
	for(int i=0; i<n; i++){
		if(i == 0){
			printf("%d", num1);
		}else if(i == 1){
			printf(",%d", num2);
		}else{
			int num3 = num1 + num2;
			suma+=num3;
			printf(",%d", num3);
			num1 = num2;
			num2 = num3;
		}
	}
	printf("\nSuma total de los n terminos: %d", suma+1);
	
	return 0;
}