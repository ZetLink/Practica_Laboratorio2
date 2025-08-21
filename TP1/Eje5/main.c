#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#define N 50

int main(int argc, char *argv[]) {
	
	char palabra[N];
	printf("Ingrese una palabra: ");
	scanf("%s", palabra);
	
	int tamano=strlen(palabra);
	bool palindromo = true;
	for(int i=0; i<tamano/2; i++){
		if(palabra[i] != palabra[tamano-1-i]){
			palindromo = false;
		}
	}
	if(palindromo){
		printf("La palabra '%s' es palindromo", palabra);
	} else {
		printf("La palabra '%s' no es palindromo", palabra);
	}
	
	
	return 0;
}