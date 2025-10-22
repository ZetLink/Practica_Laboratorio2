#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Alumno: Rojas Ulises Martin

#define CANT_LIBROS 3

typedef struct{	//Estructura libro
	char titulo[50];
	char autor[20];
	float precio;	
} Libro;

int main(int argc, char *argv[]) {
	
	Libro libros[CANT_LIBROS]; //Arreglo de tipo Libros con CANT_LIBROS elementos
	
	//Ingreso de los datos de los libros
	for(int i=0; i<CANT_LIBROS; i++){
		printf("Libro N%d\n", i+1);
		
		printf("Titulo: ");
		fgets(libros[i].titulo, sizeof(libros[i].titulo), stdin);
		fflush(stdin);
		
		printf("Autor: ");
		fgets(libros[i].autor, sizeof(libros[i].autor), stdin);
		fflush(stdin);
			
		printf("Precio: ");
		scanf("%f", &libros[i].precio);
		fflush(stdin);
	}
	
	//Mostrar la informacion de cada libro
	for(int i=0; i<CANT_LIBROS; i++){
		printf("\n--- Libro N%d ---\n", i+1);
		printf("Titulo: %s", libros[i].titulo);
		printf("Autor: %s", libros[i].autor);
		printf("Precio: %.2f", libros[i].precio);
	}
	
	return 0;
}