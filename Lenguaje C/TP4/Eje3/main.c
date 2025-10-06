#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>

#define MAX 50

//Alumno: Rojas Ulises Martin

typedef struct {
    char nombre[30];
    char telefono[15];
    char correo[30];
} Contacto;

// Prototipos
void cargarContactos(Contacto *arr, int n);
Contacto* buscarContacto(Contacto *arr, int n, char *nombre);
char* convertirAMinuscula(char *texto);

int main(int argc, char *argv[]) {
    int n;
    char nombreBuscado[30];
    
    do{
    	printf("Ingrese la cantidad de contactos (Maximo 50): ");
    	scanf("%d", &n);
	}while((n < 1) || (n > MAX));
	while(getchar() != '\n');
    Contacto contactos[MAX];
    
    cargarContactos(contactos, n);
    
    printf("\nIngrese el nombre del contacto buscado: ");
	scanf("%s", nombreBuscado);
    Contacto *c = buscarContacto(contactos, n, nombreBuscado);
    
    if (c != NULL) {
        printf("Contacto: %s %s %s\n", c->nombre, c->telefono, c->correo);
    } else {
        printf("No existe\n");
    }
	return 0;
}

void cargarContactos(Contacto *arr, int n){
	while(n > 0){
		printf("\n---Nuevo Contacto---\n");
		
		printf("Nombre: ");
		fgets(arr->nombre, sizeof(arr->nombre), stdin);
		arr->nombre[strcspn(arr->nombre,"\n")] = '\0';
		
		printf("Telefono: ");
		fgets(arr->telefono, sizeof(arr->telefono), stdin);
		arr->telefono[strcspn(arr->telefono,"\n")] = '\0';		
		
		printf("Correo: ");
		fgets(arr->correo, sizeof(arr->correo), stdin);
		arr->correo[strcspn(arr->correo,"\n")] = '\0';
		
		arr++;
		n--;
	}
}

Contacto* buscarContacto(Contacto *arr, int n, char *nombre){
	Contacto *buscado = NULL;
	bool b = false;
	while((n > 0) && !b){
		if(strcmp(convertirAMinuscula(arr->nombre),convertirAMinuscula(nombre)) == 0){
			b = true;
			arr->nombre[0] = toupper(arr->nombre[0]);
			buscado = arr;
		} else {
			arr++;
			n--;	
		}
	}
	return buscado;
}

char* convertirAMinuscula(char *texto){
	int i=0;
	while(texto[i] != '\0'){
		texto[i] = tolower(texto[i]);
		i++;
	}
	return texto;
}
