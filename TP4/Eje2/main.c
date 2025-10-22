#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 50

//Alumno: Rojas Ulises Martin

typedef struct {
    int codigo;
    char descripcion[30];
    float precio;
} Producto;

// Prototipos
void cargarProductos(Producto *arr, int n);
void mostrarProductos(Producto *arr, int n);
float calcularTotal(Producto *arr, int n);

int main(int argc, char *argv[]) {

	int n;	
	do{
		printf("Ingrese la cantidad de productos (Maximo 50): ");
    	scanf("%d", &n);
	}while((n < 1) || (n > MAX));
    Producto productos[MAX];
    
    cargarProductos(productos, n);
    mostrarProductos(productos, n);
    float total = calcularTotal(productos, n);
    printf("Total: %.2f\n", total);
	
	return 0;
}

void cargarProductos(Producto *arr, int n){
	while(n > 0){
		printf("\n---Producto---\n");
		
		printf("Codigo: ");
		scanf("%d", &arr->codigo);
		while(getchar() != '\n');
		
		printf("Descripcion: ");
		fgets(arr->descripcion, sizeof(arr->descripcion), stdin);
		arr->descripcion[strcspn(arr->descripcion,"\n")] = '\0';
		
		printf("Precio: ");
		scanf("%f", &arr->precio);
		while(getchar() != '\n');		
		
		arr++;
		n--;
	}
}

void mostrarProductos(Producto *arr, int n){
	printf("\n---Lista de Productos---\n");
	printf("%-8s%-14s%-6s\n", "Codigo", "Descripcion", "Precio");
	while(n > 0){
		printf("%-8d%-14s%-6.2f\n", arr->codigo, arr->descripcion, arr->precio);
		
		arr++;
		n--;
	}
}

float calcularTotal(Producto *arr, int n){
	float sum = 0;
	while(n > 0){
		sum += arr->precio;
		arr++;
		n--;
	}
	return sum;
}