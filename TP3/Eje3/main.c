#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	char cadena[20] = "";
	char *ptr_c;
	bool b = false;
	
	printf("Ingrese la cadena: ");
	scanf("%s", cadena);
	ptr_c=&cadena;
	
	int i=0;
	while((cadena[i] != '\0') && (b == false)){ //Recorrer la cadena para verificar si existen valores no numericos
		if(isalpha(cadena[i])){
			b = true;
		}
		i++;
	}
	
	if(b){
		printf("Error: la cadena contiene caracteres no numericos.");
	} else {
	
		int enteroDesdeChar=0;
		int *ptr_edc;
		ptr_edc=&enteroDesdeChar;
		
		i=0;
		int longitud = strlen(ptr_c); //Determinar la longitud de la cantidad de caracteres numericos tiene la cadena
		while(i < longitud){
			*ptr_edc = (*ptr_edc * 10) + (ptr_c[i] - '0');
			i++;
		}
		
		printf("Numero original: %d\n", *ptr_edc);
		printf("Doble del numero: %d\n", (*ptr_edc)*2);
		printf("Numero invertido: ");
		i=longitud-1; //Colocar 'i' en el ultimo numero de la cadena
		while(i >= 0){ //Recorrer de forma inversa la cadena numerica
			printf("%c", ptr_c[i]);
			i--;
		}
	}
	return 0;
}