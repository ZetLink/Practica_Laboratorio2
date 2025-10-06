#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

#define N 10

int main(int argc, char *argv[]) {
	
	int nums[N] = {};
	int may = INT_MIN, men = INT_MAX;
	int mayP, menP;
	
	for(int i=0; i<N; i++){
		printf("\nNumero N%d: ", i);
		scanf("%d", &nums[i]);
	}
	
	for(int i=0; i<N; i++){
		if(nums[i] > may){
			may = nums[i];
			mayP = i;
		} else if(nums[i] < men){
			men = nums[i];
			menP = i;
		}
	}
	printf("\nNumero mayor: %d - Posicion: %d", may, mayP);
	printf("\nNumero menor: %d - Posicion: %d", men, menP);
	
	return 0;
}