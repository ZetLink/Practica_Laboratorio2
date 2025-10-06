#include <stdio.h>
#include <stdlib.h>

#define NUM_EMPLEADOS 2
#define NUM_DIAS 5

typedef struct {
	char nombre[30];
	int legajo;
	int horas[NUM_DIAS];
} Empleado;

int main(int argc, char *argv[]) {

	Empleado empleados[NUM_EMPLEADOS];

	for(int i=0; i<NUM_EMPLEADOS; i++) {
		printf("Datos empleado N%d\n", i+1);

		//Carga del nombre del empleado
		printf("Nombre: ");
		scanf("%s", empleados[i].nombre);
		fflush(stdin);
		
		//Carga del legajo del empleado
		printf("Legajo: ");
		scanf("%d", &empleados[i].legajo);
		fflush(stdin);

		//Carga de las horas por dia del empleado
		for(int j=0; j<NUM_DIAS; j++) {
			printf("Dia N%d: ", j+1);
			scanf("%d", &empleados[i].horas[j]);
			fflush(stdin);
		}
	}

	for(int i=0; i<NUM_EMPLEADOS; i++) {
		int ht = 0; //Variable que almacena la suma de horas totales trabajadas
		printf("\n---Datos del empleado N%d---\n", i+1);
		printf("Nombre\tLegajo\tDia1\tDia2\tDia3\tDia4\tDia5\tPromedio Horas\n");

		//Mostrar los datos datos de cada empleado
		printf("%s\t%d\t", empleados[i].nombre, empleados[i].legajo);
		for(int j=0; j<NUM_DIAS; j++) {
			printf("%d\t", empleados[i].horas[j]);
			ht += empleados[i].horas[j];
		}
		//Calcular y mostrar el promedio de horas
		printf("%.2f", (float)(ht)/NUM_DIAS);
		printf("\n");
	}

	return 0;
}