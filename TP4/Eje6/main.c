#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

#define MAX 50

//Alumno: Rojas Ulises Martin

typedef struct {
    char nombre[30];
    char equipo[30];
    int goles;
} Jugador;

// Prototipos
void cargarJugadores(Jugador *arr, int n);
Jugador* maximoGoleador(Jugador *arr, int n);

int main(int argc, char *argv[]) {
	
	int n;
	do{
		printf("Ingrese la cantidad de jugadores (Maximo 50): ");
		scanf("%d", &n);
	}while((n < 1) || (n > MAX));
	while(getchar() != '\n');

    Jugador jugadores[MAX];
    
    cargarJugadores(jugadores, n);
    
    Jugador *g = maximoGoleador(jugadores, n);
    printf("Goleador: %s %s %d\n", g->nombre, g->equipo, g->goles);
    
	return 0;
}

void cargarJugadores(Jugador *arr, int n){
	while(n > 0){
		printf("\n---Nuevo Jugador---\n");
		
		printf("Nombre: ");
		fgets(arr->nombre, sizeof(arr->nombre), stdin);
		arr->nombre[strcspn(arr->nombre,"\n")] = '\0';
		
		printf("Equipo: ");
		fgets(arr->equipo, sizeof(arr->equipo), stdin);
		arr->equipo[strcspn(arr->equipo,"\n")] = '\0';
		
		printf("Goles: ");
		scanf("%d", &arr->goles);
		while(getchar() != '\n');
		
		arr++;
		n--;
	}
}

Jugador* maximoGoleador(Jugador *arr, int n){
	Jugador *buscado = NULL;
	int max_goles = INT_MIN;
	while(n > 0){
		if(arr->goles > max_goles){
			max_goles = arr->goles;
			buscado = arr;
		}
		arr++;
		n--;
	}
	return buscado;
}