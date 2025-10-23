package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

public class Principal {
    
    public static void main(String[] args) {
        final int ANIO = 2025;
        Persona p = new Persona();
        Saludo s = new Saludo();
        
        p.cargarPersona();
        
        s.saludar();
        s.saludar(p.getNombre());
        s.saludar(p.getNombre(), ANIO - p.getAnioNacimiento());
    }

}
