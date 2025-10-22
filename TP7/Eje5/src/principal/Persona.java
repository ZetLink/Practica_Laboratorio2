package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int anioNacimiento;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    
    public void cargarPersona(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nombre: ");
            setNombre(sc.nextLine());
        }while(getNombre().equals(""));
        do{
            System.out.print("Año de Nacimiento: ");
            setAnioNacimiento(sc.nextInt());
        }while(getAnioNacimiento() <= 0);
    }
    
    public void mostrarPersona(){
        System.out.printf("Nombre: %s ... Edad: %d años\n", getNombre(), getAnioNacimiento());
    }
}
