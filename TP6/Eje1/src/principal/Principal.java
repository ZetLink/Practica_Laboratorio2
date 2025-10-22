package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Declarar las variables necesarias
        int num1, num2;
        int mayor, menor;
        int resta;
        double division;

        // Solicitar el primer número entero
        System.out.print("Ingrese el primer número entero: ");
        // Leer el primer número
        num1 = sc.nextInt();

        // Solicitar el segundo número entero
        System.out.print("Ingrese el segundo número entero: ");
        // Leer el segundo número
        num2 = sc.nextInt();


        // Determinar cuál es el mayor y cuál el menor
        if (num1 >= num2) {
            // Asignar valores a mayor y menor
            mayor = num1;
            menor = num2;
        } else {
            // Asignar los valores contrarios
            mayor = num2;
            menor = num1;
        }

        // Calcular la resta (mayor - menor)
        resta = mayor - menor;


        // Calcular la división (mayor / menor), solo si el menor es distinto de cero
        if (menor != 0) {
            // Realizar la división (convertir a double si es necesario)
            division = (double)mayor / (double)menor;

            // Mostrar resultados
            System.out.println("\nResultados:");
            System.out.println("Resta (mayor - menor): " + resta);
            System.out.println("División (mayor / menor): " + division);
        } else {
            // Mostrar mensaje si no se puede dividir
            System.out.println("\nResultados:");
            System.out.println("Resta (mayor - menor): " + resta);
            System.out.println("No se puede realizar la división porque el divisor es cero");
        }
        
    }

}
