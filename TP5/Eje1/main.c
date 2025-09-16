#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

//Alumno: Rojas Ulises Martin

void cargarArreglo(int *arr, int n);
void mostrarArreglo(int *arr, int n, char *mensaje);
void rotarDerecha(int *arr, int n);

int main(int argc, char *argv[]) {
	
	int n;
	do{
	    printf("Ingrese cantidad de elementos: ");
    	scanf("%d", &n);		
	}while((n < 1) || (n > INT_MAX));
	while(getchar() != '\n');

    int arr[n];
    
    cargarArreglo(arr, n);
    
    mostrarArreglo(arr, n, "\nAntes de rotar:");

    rotarDerecha(arr, n);

	mostrarArreglo(arr, n, "\nDespues de rotar:");
	
	return 0;
}

void cargarArreglo(int *arr, int n){
	printf("\n---Ingrese los %d elementos---\n", n);
	int i=0;
	while(i < n){	
		printf("Elemento N%d: ", i+1);
		scanf("%d", &arr[i]);
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

void rotarDerecha(int *arr, int n) {
	int *ptr = &arr[n-1]; //Se posiciona en el ultimo elemento del vector
    int ultimo = *ptr; //Almacena el valor del ultimo elemento
       
    //Comienza a recorrer desde el final hasta el principio del vector
    int i=n-1; 
    while(i > 0){
    	*ptr = *(ptr - 1); //Se reeemplaza el elemento al que apunta el puntero por el anterior
    	ptr--;
    	i--;
	}
		
	//Una vez desplazados todos los numeros, se coloca el ultimo elemento en la primero posicion del vector
    *ptr = ultimo;
}