package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Principal {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
        r1.cargarRectangulo();
        r2.cargarRectangulo();
        
        r1.mostrarRectangulo();
        r2.mostrarRectangulo();
    }

}
