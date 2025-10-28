package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Principal {

    public static void main(String[] args) {
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        Perro p3 = new Perro();
        
        System.out.println("---Perro 1---");
        p1.cargar();
        p1.ladrar(15);
        p1.mostrar();
        
        System.out.println("---Perro 2---");
        p2.ladrar('Z');
        
        System.out.println("---Perro 3---");
        p3.ladrar(true);
    }

}
