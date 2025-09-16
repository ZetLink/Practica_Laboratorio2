#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 50

//Alumno: Rojas Ulises Martin

typedef struct {
    char nombre[30];
    int edad;
    float promedio;
} Estudiante;

// Prototipos
void cargarEstudiantes(Estudiante *arr, int n);
void mostrarEstudiantes(Estudiante *arr, int n);
float calcularPromedioGeneral(Estudiante *arr, int n);

int main(int argc, char *argv[]) {
	
	int n;
	do{
		printf("Ingrese la cantidad de estudiantes (Maximo: 50): ");
    	scanf("%d", &n);		
	}while((n < 1) || (n > MAX));
	while(getchar() != '\n');
	
    Estudiante estudiantes[MAX];
    
    cargarEstudiantes(estudiantes, n);
    mostrarEstudiantes(estudiantes, n);
    float prom = calcularPromedioGeneral(estudiantes, n);
    printf("\nPromedio general: %.2f\n", prom);
	
	return 0;
}

void cargarEstudiantes(Estudiante *arr, int n){
	while(n > 0){
		printf("\n---Datos del Estudiante---\n");
		
		printf("Nombre: ");
		fgets(arr->nombre, sizeof(arr->nombre), stdin);
		arr->nombre[strcspn(arr->nombre,"\n")] = '\0';
		
		printf("Edad: ");
		scanf("%d", &arr->edad);
		while(getchar() != '\n');
		
		printf("Promedio: ");
		scanf("%f", &arr->promedio);
		while(getchar() != '\n');
		
		arr++;
		n--;
	}
}

void mostrarEstudiantes(Estudiante *arr, int n){
	printf("\n---Lista de Estudiantes---\n");
	printf("%-14s%-6s%-10s\n", "Nombre", "Edad", "Promedio");
	while(n > 0){
		printf("%-14s%-6d%-10.2f\n", arr->nombre, arr->edad, arr->promedio);
		arr++;
		n--;
	}
}

float calcularPromedioGeneral(Estudiante *arr, int n){
	float sum = 0;
	int i = 0;
	while(i < n){
		sum += arr->promedio;
		arr++;
		i++;
	}
	return sum/n;
}	