package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        p1.cargarPersona();
        p2.cargarPersona();
        p3.cargarPersona();
        p1.mostrarPersona();
        p2.mostrarPersona();
        p3.mostrarPersona();
    }

}
