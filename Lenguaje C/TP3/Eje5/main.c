#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	char cadena[50] = " ";
	char *ptr_c;
	
	printf("Ingrese la cadena: ");
	fgets(cadena, sizeof(cadena), stdin);
	cadena[strcspn(cadena, "\n")] = '\0';
	
	ptr_c = &cadena;
	ptr_c += strlen(cadena) - 1; //Se posiciona en el ultimo caracter del string
	printf("Cadena invertida: ");
	while(ptr_c >= cadena){ //Recorre cada caracter hasta que la direccion a la que apunta el puntero sea la misma que la de la cadena
		printf("%c", *ptr_c);
		ptr_c--;
	}
	
	return 0;
}