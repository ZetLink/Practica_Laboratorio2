package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Principal {

    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        l1.cargarLibro();
        l2.cargarLibro();
        l1.mostrarLibro();
        l2.mostrarLibro();
    }

}
