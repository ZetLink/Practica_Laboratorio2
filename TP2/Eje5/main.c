#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <math.h>

//Alumno: Rojas Ulises Martin

typedef struct{
	double a;
	double b;
	double c;
}Polinomio;

int main(int argc, char *argv[]) {
	
	Polinomio poli = {0,0,0};
	double x = 0;
	char op;
	
	do {
		//Se cargan los valores de a,b y c
		printf("Ingrese los coeficientes del polinomio\n");
		do{
			printf("a: ");
			scanf("%lf", &poli.a);
			fflush(stdin);			
		}while(poli.a == 0); //Se fuerza el ingreso de un numero distinto de 0 para evitar obtener una ecuacion invalida o una ecuacion lineal
		do{
			printf("b: ");
			scanf("%lf", &poli.b);
			fflush(stdin);			
		}while(poli.b == 0); //Se fuerza el ingreso de un numero distinto de 0 para evitar obtener una ecuacion invalida o una ecuacion lineal
		printf("c: ");
		scanf("%lf", &poli.c);
		fflush(stdin);
		
		//Se ingresa el valor de X
		printf("Ingrese el valor de X: ");
		scanf("%lf", &x);
		fflush(stdin);
			
		double discriminante = pow(poli.b, 2) - 4 * poli.a * poli.c; //Se obtiene el resultado del discriminante
		//Se evalua si el discriminante es menor que 0
		if (discriminante < 0){
			
			printf("El polinomio no tiene raices reales\n");
			
		} else {
			
			// Se obtienen las raices del polinomio
			double x1 = ((-1 * poli.b) + sqrt(discriminante)) / (2 * poli.a);
			double x2 = ((-1 * poli.b) - sqrt(discriminante)) / (2 * poli.a);
			printf("\nRaices del polinomio: X1=%.2lf - X2=%.2lf\n", x1, x2);
			
			//Se obtiene el resultado de P(X)
			double resultado = poli.a * pow(x, 2) + poli.b * x + poli.c;
			printf("\nP(%.2lf) = %.2lf\n", x, resultado);
		}
		
		//Se le pregunta al usuario si desea continuar y se fuerzan solo dos posibles respuestas
		do {
		    printf("\nContinuar (S/N): ");
	    	scanf(" %c", &op);
	    	op = tolower(op);
		} while(op != 's' && op != 'n'); 
				
	}while(op == 's');
	
	return 0;
}