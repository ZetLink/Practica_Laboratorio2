package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar las variables necesarias
        int cantidadNotas;
        double nota;
        double suma = 0;
        int aprobados = 0;
        int desaprobados = 0;

        // Solicitar la cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        // Leer el valor ingresado por teclado y asignarlo a la variable correspondiente
        cantidadNotas = sc.nextInt();


        // Bucle para ingresar y procesar las notas
        // Debe repetirse tantas veces como cantidad de estudiantes haya
        for (int i = 1; i <= cantidadNotas; i++) {

            // Ingresar una nota válida entre 1 y 10
            do {
                System.out.print("Ingrese la nota del estudiante " + i + " (1 a 10): ");
                // Leer la nota desde teclado
                nota = sc.nextDouble();
            } while (nota < 1 || nota > 10);

            // Acumular la nota para calcular el promedio general
            suma += nota;

            // Contar aprobados (nota ≥ 6) y desaprobados (nota < 6)
            if (nota >= 6) {
                // Incrementar el contador de aprobados
                aprobados++;
            } else {
                // Incrementar el contador de desaprobados
                desaprobados++;
            }
        }

        // Calcular el promedio general
        double promedio = suma / cantidadNotas;

        // Mostrar los resultados
        System.out.println("\nPromedio general: " + promedio);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

}
