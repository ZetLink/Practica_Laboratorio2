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
	fgets(cadena, sizeof(cadena), stdin);
	cadena[strcspn(cadena,"\n")] = '\0'; //Busca el caracter '\n' cuando lo encuentra lo remplaza por '\0', para eliminar el salto de linea que guarda fgets al final de la cadena
	
	ptr_c=&cadena[0];
	while((*ptr_c != '\0') && (b == false)){ //Recorrer la cadena para verificar si existen valores no numericos
		if(isalpha(*ptr_c)){
			b = true;
		}
		ptr_c++;
	}
	
	if(b){
		printf("Error: la cadena contiene caracteres no numericos.");
	} else {
	
		int enteroDesdeChar=0;
		int *ptr_edc;
		ptr_edc=&enteroDesdeChar;
		
		int i=0; //Cuenta la cantidad de numeros que tiene la cadena
		ptr_c=&cadena[0];
		while(*ptr_c != '\0'){
			//printf("Valor: %d | Valor Restando 0: %d\n", *ptr_c, *ptr_c - '0');
			*ptr_edc = (*ptr_edc * 10) + (*ptr_c - '0'); //*ptr_c - '0': Al representarse como entero se obtiene su valor ASCII, si se le resta el valor 0 en ASCII obtenemos el valor del numero buscado
			ptr_c++;
			i++;
		}
		
		printf("Numero original: %d\n", *ptr_edc);
		printf("Doble del numero: %d\n", (*ptr_edc)*2);
		ptr_c--; //Vuelve al ultimo numero de la cadena
		printf("Numero invertido: ");
		while(i > 0){ //Recorrer de forma inversa la cadena numerica
			printf("%c", *ptr_c);
			ptr_c--;
			i--;
		}
	}
	return 0;
}