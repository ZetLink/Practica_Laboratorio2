#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 50

//Alumno: Rojas Ulises Martin

typedef struct {
    char marca[20];
    char modelo[20];
    int anio;
} Vehiculo;

// Prototipos
void cargarVehiculos(Vehiculo *arr, int n);
void mostrarVehiculos(Vehiculo *arr, int n);
int contarPosteriores2015(Vehiculo *arr, int n);

int main(int argc, char *argv[]) {
	
	int n;
	do{
		printf("Ingrese la cantidad de vehiculos (Maximo 50): ");
    	scanf("%d", &n);		
	}while((n < 1) || (n > MAX));
	while(getchar() != '\n');

    Vehiculo vehiculos[MAX];
    
    cargarVehiculos(vehiculos, n);
    
    mostrarVehiculos(vehiculos, n);
    int c = contarPosteriores2015(vehiculos, n);
    printf("\nPosteriores a 2015: %d\n", c);
	return 0;
}

void cargarVehiculos(Vehiculo *arr, int n){
	while(n > 0){
		printf("\n---Nuevo Auto---\n");
		
		printf("Marca: ");
		fgets(arr->marca, sizeof(arr->marca), stdin);
		arr->marca[strcspn(arr->marca,"\n")] = '\0';
		
		printf("Modelo: ");
		fgets(arr->modelo, sizeof(arr->modelo), stdin);
		arr->modelo[strcspn(arr->modelo,"\n")] = '\0';
		
		printf("Anio: ");
		scanf("%d", &arr->anio);
		while(getchar() != '\n');
		
		arr++;
		n--;
	}
}

void mostrarVehiculos(Vehiculo *arr, int n){
	printf("\n---Listado de Vehiculos---\n");
	printf("\n%-20s %-20s %-6s\n", "Marca", "Modelo", "Anio");
	while(n > 0){
		printf("%-20s %-20s %-6d\n", arr->marca, arr->modelo, arr->anio);
		arr++;
		n--;
	}
}

int contarPosteriores2015(Vehiculo *arr, int n){
	int cont = 0;
	while(n > 0){
		if(arr->anio > 2015){
			cont++;
		}
		arr++;
		n--;
	}
	return cont;
}