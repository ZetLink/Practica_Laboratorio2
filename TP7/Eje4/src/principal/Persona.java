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

    Scanner sc = new Scanner(System.in);
    
    private void setNombre() {
        String sAux = "";
        do{
            System.out.print("Nombre: ");
            sAux = sc.nextLine();
            if(sAux.equals("")){
                System.out.println("Error: No se permite un String vacio.");
            }
        }while(sAux.equals(""));
        this.nombre = sAux;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    private void setAnioNacimiento() {
        int iAux = -1;
        do{
            System.out.print("Año de Nacimiento: ");
            iAux = sc.nextInt();
            if(iAux <= 0){
                System.out.println("Error: Ingrese un numero mayor a 0.");
            }
        }while(iAux <= 0);
        this.anioNacimiento = iAux;
    }
    
    public void cargarPersona(){
        setNombre();
        setAnioNacimiento();
    }
    
    public void mostrarPersona(){
        final int ANIO = 2025;
        System.out.printf("Nombre: %s ... Edad: %d años\n", getNombre(), ANIO - getAnioNacimiento());
    }
}
