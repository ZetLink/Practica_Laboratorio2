package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Principal {

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        c1.cargarCuadrado();
        
        Cuadrado c2 = new Cuadrado();
        c2.cargarCuadrado();
        
        Cuadrado c3 = new Cuadrado();
        c3.cargarCuadrado();
        
        System.out.println("Cálculo de los perímetros:");
        System.out.println(c1.calcularPerimetro());
        System.out.println(c2.calcularPerimetro());
        System.out.println(c3.calcularPerimetro());
    }

}
