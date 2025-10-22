package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

public class Principal {

    public static void main(String[] args) {
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        
        n1.cargarNumero();
        n2.cargarNumero();
        
        System.out.println("Suma enviando un entero: " + n1.sumar(n2.getValor()));
        System.out.println("Suma enviando un objeto de tipo Numero: " + n1.sumar(n2));
    }

}
