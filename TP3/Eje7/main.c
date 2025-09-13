#include <stdio.h>
#include <stdlib.h>

#define MAX 10

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	int carrusel[MAX];
    int n;
    int z;
    int i;
	
	//Se pide al usuario la cantidad de elementos a ingresar y solo permite un valor entre 1 y 10
	do{
    	printf("Ingrese la cantidad de carros (max %d): ", MAX);
    	scanf("%d", &n);		
	}while(n < 1 || n > 10);

	//Carga del vector
	i=0;
	while(i < n){
		printf("Carro N%d: ", i+1);
		scanf("%d", &carrusel[i]);
		i++;
	}
	
	//Se pide al usuario la cantidad de veces que se va a rotar el carrusel
    printf("\nIngrese el numero de veces a desplazar: ");
    scanf("%d", &z);

    i=0;
    while(i < z){
    	int *ptr = &carrusel[n-1]; //Se posiciona en el ultimo elemento del vector
        int ultimo = *ptr; //Almacena el valor del ultimo elemento
        
        //Comienza a recorrer desde el final hasta el principio del vector
    	int j=n-1; 
    	while(j > 0){
    		*ptr = *(ptr - 1); //Se reeemplzada el elemento al que apunta el puntero por el anterior
    		ptr--;
    		j--;
		}
		
		//Una vez desplazados todos los numeros, se coloca el ultimo elemento en la primero posicion del vector
    	*ptr = ultimo;
    	i++;
	}

	//Se muestra el vector resultante
    printf("\nCarrusel resultante: ");
    int *ptr_resul = &carrusel[0];
    i=0;
    while(i < n){
    	printf("%d ", *(ptr_resul + i));
    	i++;
	}

    return 0;
}