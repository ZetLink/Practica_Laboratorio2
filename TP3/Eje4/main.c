#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	char cadena[50] = " ";
	char *ptr_c;
	int i = 0;
	
	printf("Cadena: ");
	fgets(cadena, sizeof(cadena), stdin);
	cadena[strcspn(cadena, "\n")] = '\0'; //Recorre el string buscando el caracter '\n' y lo remplaza por '\0', para eliminar el salto de linea que guarda fgets al final del string
	
	ptr_c = &cadena;

	bool isograma = true;
	while(*ptr_c != '\0'){ //Recorre la cadena utilizando el puntero
		if(isblank(*ptr_c)){ //Si el caracter al que encuentra apuntando el puntero es un espacio lo saltea
			ptr_c++;
		}
		if(isupper(*ptr_c)){ //Si el caracter al que encuentra apuntando el puntero es una masyuscula lo combierte a minuscula
			*ptr_c = tolower(*ptr_c);
		}
		char *letra = ptr_c + 1;
		while(*letra != '\0'){
			if(*ptr_c == *letra){
				isograma = false;
			}
			letra++;
		}
		ptr_c++;
	}
	
	if(isograma){
		printf("La palabra: %s es isograma", cadena);
	} else {
		printf("La palabra: %s no es isograma", cadena);
	}
	
	return 0;
}