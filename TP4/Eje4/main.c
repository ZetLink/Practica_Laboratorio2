#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#include <stdbool.h>

#define MAX 50

//Alumno: Rojas Ulises Martin

typedef struct {
    char titulo[30];
    char autor[30];
    int anio;
} Libro;

// Prototipos
void cargarLibros(Libro *arr, int n);
Libro* libroMasAntiguo(Libro *arr, int n);

int main(int argc, char *argv[]) {
	
	int n;
	do{
		printf("Ingrese la cantidad de libros (Maximo 50): ");
    	scanf("%d", &n);		
	}while((n < 1) || (n > MAX));
	while(getchar() != '\n');

    Libro libros[MAX];
    cargarLibros(libros, n);
    Libro *antiguo = libroMasAntiguo(libros, n);
    printf("\nMas antiguo: %s %s %d\n", antiguo->titulo, antiguo->autor, antiguo->anio);
	
	return 0;
}

void cargarLibros(Libro *arr, int n){
	while(n > 0){
		printf("\n---Nuevo Libro---\n");
		
		printf("Titulo: ");
		fgets(arr->titulo, sizeof(arr->titulo), stdin);
		arr->titulo[strcspn(arr->titulo,"\n")] = '\0';
		
		printf("Autor: ");
		fgets(arr->autor, sizeof(arr->autor), stdin);
		arr->autor[strcspn(arr->autor,"\n")] = '\0';
		
		printf("Anio: ");
		scanf("%d", &arr->anio);
		while(getchar() != '\n');
		
		arr++;
		n--;
	}
}

Libro* libroMasAntiguo(Libro *arr, int n){
	Libro *buscado = NULL;
	int antiguo = INT_MAX;
	while(n > 0){
		if(arr->anio <= antiguo){
			antiguo = arr->anio;
			buscado = arr;
		}
		arr++;
		n--;	
	}
	return buscado;
}