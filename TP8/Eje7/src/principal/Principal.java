package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);
    boolean cargado = false;
    Jardin j1 = new Jardin();
    
    public void menu(){
        int op;
        do{
            System.out.println("--- Menu ---");
            System.out.println("1. Cargar plantas");
            System.out.println("2. Consultar planta");
            System.out.println("3. Eliminar planta");
            System.out.println("4. Mostrar plantas");
            System.out.println("0. Salir");
            System.out.print("-->");
            op = Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    if(!cargado){
                        j1.crearJardin();   
                        cargado = true;
                    } else {
                        System.out.println("Jardin Cargado");
                    }
                    break;
                case 2:
                    if(cargado){
                        j1.consultarPlanta();
                    } else {
                        System.out.println("Jardin NO cargado");
                    }
                    break;
                case 3:
                    if(cargado){
                        j1.eliminarPlanta();
                    } else {
                        System.out.println("Jardin NO cargado");
                    }
                    break;
                case 4:
                    if(cargado){
                        j1.mostrarPlantas();
                    } else {
                        System.out.println("Jardin NO cargado");
                    }
                    break;
            }
        }while(op != 0);
    }
    
    public static void main(String[] args) {
        Principal app = new Principal();
        app.menu();
    }

}
