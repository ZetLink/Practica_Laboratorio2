#include <stdio.h>
#include <stdlib.h>

#define N 3

int main(int argc, char *argv[]) {
	
	int ventas[N][N] = {{45,34,11},
						{9,43,1},
						{21,77,3}};	
	int vg=0;
	
//  Carga
//  for(i=0; i<N; i++){
//      for(j=0; j<N; j++){
//          scanf("%d", &ventas[i][j]);
//      }
//      printf("\n");
//  }

	for(int i=0; i<N; i++){
		int vpp=0;
		for(int j=0; j<N; j++){
			vpp+=ventas[i][j];
			vg+=ventas[i][j];
		}
		printf("\nVentas totales del Producto %d: %d", i+1, vpp);
	}
	for(int i=0; i<N; i++){
		int vpd=0;
		for(int j=0; j<N; j++){
			vpd+=ventas[j][i];
		}
		printf("\nVentas totales del Dia %d: %d", i+1, vpd);
	}
	printf("\nVentas globales: %d", vg);
	
	return 0;
}