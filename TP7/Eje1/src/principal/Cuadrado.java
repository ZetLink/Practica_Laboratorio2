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

    private void setLongLado() {
        Scanner sc = new Scanner(System.in);
        int iAux = -1;
        do{
            System.out.print("Longitud de lado: ");
            iAux = sc.nextInt();
            if(iAux <= 0){
                System.out.println("Error: Ingrese un numero mayor a 0.");
            }
        }while(iAux <= 0);
        this.longLado = iAux;
    }
    
    public void cargarCuadrado(){
        setLongLado();
    }
    
    public int calcularPerimetro(){
        return getLongLado() * 4;
    }
}
