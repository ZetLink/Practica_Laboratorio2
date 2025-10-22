#include <stdio.h>
#include <stdlib.h>

#define N 8

int main(int argc, char *argv[]) {
	
	int c=0;
	float sum=0, prom=0;
	
	for(int i=0; i<N; i++){
		float num = 0;
		printf("\nNumero N%d: ", i+1);
		scanf("%f", &num);
		
		if(num > 50){
			sum+=num;
			c++;
		}
	}
	if(sum != 0){
		prom = sum/c;
		printf("\nPromedio: %.2f", prom);
	} else {
		printf("\nNo se ingresaron numeros mayores a 50");
	}
	
	return 0;
}