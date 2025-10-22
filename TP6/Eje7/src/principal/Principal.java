package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float num1 = 0, num2 = 0;
        char operacion;
        
        System.out.print("Numero 1: ");
        num1 = sc.nextFloat();
        System.out.print("Numero 2: ");
        num2 = sc.nextFloat();
        
        do{
            System.out.print("Ingrese operacion (+, -, *, /): ");
            operacion = sc.next().charAt(0);
        }while(operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/');
        
        switch(operacion){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("No se puede dividir por 0");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }    
                break;
        }
        
    }

}
