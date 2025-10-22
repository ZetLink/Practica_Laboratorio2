package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero: ");
        int num = sc.nextInt();
        
        if(esCapicua(num)){
            System.out.println("El numero " + num + " es capicua");
        } else {
            System.out.println("El numero " + num + " no es capicua");
        }
        
    }
    
    public static boolean esCapicua(int num1){
        boolean resultado = true;
        String aux = Integer.toString(num1);
        int longitud = aux.length();
        int aux_longitud = longitud;
        int i = 0;
        while(i < aux_longitud && resultado == true){
            if(aux.charAt(i) != aux.charAt(longitud-1)){
                resultado = false;
            }
            longitud--;
            i++;
        }
        return resultado;
    }

}
