package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Cuadrado {
    private int longLado;

    public Cuadrado() {
    }

    public int getLongLado() {
        return longLado;
    }

    public void setLongLado(int longLado) {
        this.longLado = longLado;
    }
    
    public void cargarCuadrado(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Longitud de lado: ");
            setLongLado(sc.nextInt());
        }while(getLongLado() <= 0);
    }
    
    public int calcularPerimetro(){
        return getLongLado() * 4;
    }
}
