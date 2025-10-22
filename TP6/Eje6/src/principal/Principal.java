package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables necesarias
        String nombre;
        int anioNacimiento;
        int edad;
        final int ANIO_ACTUAL = 2025;

        // Solicitar el nombre de la persona
        System.out.print("Ingrese el nombre de la persona: ");
        // Leer el nombre desde teclado
        nombre = sc.nextLine();

        // Solicitar el año de nacimiento
        System.out.print("Ingrese el año de nacimiento: ");
        // Leer el año desde teclado
        anioNacimiento = sc.nextInt();

        // Calcular la edad actual (año actual - año de nacimiento)
        edad = ANIO_ACTUAL - anioNacimiento;

        // Mostrar el nombre y la edad calculada
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad + " años");

        // Determinar si la persona es mayor o menor de edad
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }

}
