#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

//Alumno: Rojas Ulises Martin

int contarVocales(char *cadena);

int main(int argc, char *argv[]) {
	
	char texto[100];
    printf("Ingrese una cadena: ");
    fgets(texto, sizeof(texto), stdin);
    texto[strcspn(texto,"\n")] = '\0';

    int total = contarVocales(texto);

    printf("Cantidad de vocales: %d\n", total);
	
	return 0;
}

int contarVocales(char *cadena) {
	int cont = 0;
	int i=0;
	while(cadena[i] != '\0'){
		char letra = tolower(cadena[i]);
		if((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')){
			cont++;
		}
		i++;
	}
	return cont;
}