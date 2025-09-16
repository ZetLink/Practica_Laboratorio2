#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

//Alumno: Rojas Ulises Martin

void cargarArreglo(int *arr, int n);
void mostrarArreglo(int *arr, int n, char *mensaje);
void normalizar(int *arr, int n);

int main(int argc, char *argv[]) {
	
	int n;
	do{
	    printf("Ingrese cantidad de notas: ");
    	scanf("%d", &n);		
	}while((n < 1) || (n > INT_MAX));
	while(getchar() != '\n');

    int arr[n];
    
    cargarArreglo(arr, n);
    
    mostrarArreglo(arr, n, "\nAntes:");

    normalizar(arr, n);

	mostrarArreglo(arr, n, "\nDespues:");
	
	return 0;
}

void cargarArreglo(int *arr, int n){
	printf("\n---Ingrese las %d notas---\n", n);
	int i=0;
	while(i < n){
		do{
			printf("Nota N%d: ", i+1);
			scanf("%d", &arr[i]);
		}while((arr[i] < 0) || (arr[i] > 100));
		while(getchar() != '\n');
		i++;
	}
}

void mostrarArreglo(int *arr, int n, char *mensaje){
	printf("%s", mensaje);
	int i=0;
	while(i < n){
		printf(" %d", arr[i]);
		i++;
	}
}

void normalizar(int *arr, int n){
	int i=0;
	while(i < n){
		arr[i] = arr[i]/10;
		i++;
	}
}