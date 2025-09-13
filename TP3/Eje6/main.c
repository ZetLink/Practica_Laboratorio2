#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	char cadena[50] = " ";
	char *pc;
	char **ppc;
	
	printf("Ingrese la cadena: ");
	fgets(cadena, sizeof(cadena), stdin);
	cadena[strcspn(cadena,"\n")] = '\0';
	
	pc = &cadena;
	ppc = &pc;
	
	while(**ppc != '\0'){
		if(islower(**ppc)) {
            **ppc = toupper(**ppc);
        }
		(*ppc)++;
	}
	
	printf("Cadena: %s", cadena);
	
	return 0;
}