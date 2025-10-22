package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int ciclos = 0;
        System.out.print("Ingrese los N terminos a mostrar: ");
        ciclos = sc.nextInt();
        
        long num1 = 0, num2 = 1, suma = 0, i = 0;
        while(i <= ciclos){
            if(i == 0){
                System.out.print(num1 + " ");
            } else if(i == 1){
                System.out.print(num2 + " ");
            } else {
                long aux = num1 + num2;
                suma += aux;
                System.out.print(aux + " ");
                num1 = num2;
                num2 = aux;
            }
            i++;
        }
        System.out.println("");
        System.out.println("Suma total de serie: " + suma);
        
    }

}
