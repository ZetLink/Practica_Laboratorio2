#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Alumno: Rojas Ulises Martin

#define CANT_PRODUCTOS 2

typedef struct{ //Estructura producto
	int codigo;
	char nombre_prod[20];
	float precio;
	int cant_vendida_dia;	
}Producto;

int main(int argc, char *argv[]) {
	
	Producto productos[CANT_PRODUCTOS]; //Arreglo de elementos Productos
	float ganancia_del_dia = 0;
	
	//Ingresar los productos
	for(int i=0; i<CANT_PRODUCTOS; i++){
		printf("Producto N%d\n", i+1);
		
		printf("Codigo: ");
		scanf("%d", &productos[i].codigo);
		fflush(stdin);
		
		printf("Nombre: ");
		fgets(productos[i].nombre_prod, sizeof(productos[i].nombre_prod), stdin);
		productos[i].nombre_prod[strcspn(productos[i].nombre_prod, "\n")] = '\0';
		fflush(stdin);
		
		printf("Precio: ");
		scanf("%f", &productos[i].precio);
		fflush(stdin);
		
		printf("Cantidad vendida en el dia: ");
		scanf("%d", &productos[i].cant_vendida_dia);
		fflush(stdin);
	}
	
	printf("\n");
	
	//Calcular y mostrar la ganancia individual de cada producto
	for(int i=0; i<CANT_PRODUCTOS; i++){
		float cvd = productos[i].precio * (float)(productos[i].cant_vendida_dia); //Variable para almacenar la cantidad vendida por dia
		printf("Codigo: %d - Producto: %s - Cantidad vendida en el dia: %.2f\n", productos[i].codigo, productos[i].nombre_prod, cvd);
		ganancia_del_dia+=cvd;
	}
	
	printf("\n");
	
	//Calcular y mostrar la ganancia total del dia
	printf("Ganancia total del dia: $%.2f", ganancia_del_dia);
	
	return 0;
}