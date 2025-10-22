#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int calcularFactorial(int n);               // Paso por valor
void calcularSumaAcumulada(int n, int *s); // Paso por referencia

//Alumno: Rojas Ulises Martin

int main(int argc, char *argv[]) {
	
	int numero;
    int factorial;
    int suma = 0;

    // Ingreso de datos
    do{
	    printf("Ingrese un numero entero positivo: ");
    	scanf("%d", &numero);    	
	}while((numero < 0) || (numero > INT_MAX));
	while(getchar() != '\n');

    // Llamada a la función factorial (paso por valor)
    factorial = calcularFactorial(numero);

    // Llamada a la función suma acumulada (paso por referencia)
    calcularSumaAcumulada(numero, &suma);

    // Mostrar resultados
    printf("El factorial de %d es: %d\n", numero, factorial);
    printf("La suma acumulada de %d es: %d\n", numero, suma);
	return 0;
}

// Definición de la función para calcular factorial
int calcularFactorial(int n) {
	int fact = 1;
    while(n > 0){
    	fact*=n;
    	n--;
	}
	return fact;
}

// Definición de la función para calcular suma acumulada
void calcularSumaAcumulada(int n, int *s) {
    while(n > 0){
    	*s+=n;
    	n--;	
	}
}