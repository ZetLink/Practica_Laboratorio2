package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant = 0, cmt = 0, cmc = 0, cm = 0;
        
        do{
            System.out.print("Los N multiplos de 3 y 5: ");
            cant = sc.nextInt();            
        }while(cant < 0);
        
        int num = 1;
        while(cmt != cant){
            if(num % 3 == 0){
                System.out.println("Multiplo de 3: " + num);
                cmt++;
            }
            num++;
        }
        
        num = 1;
        while(cmc != cant){
            if(num % 5 == 0){
                System.out.println("Multiplo de 5: " + num);
                cmc++;
            }
            num++;
        }
        
    }

}
