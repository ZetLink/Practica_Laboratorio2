package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);
    Televisor t1 = null;
    
    public void iniciarTelevisor(){
        t1 = new Televisor(cargarEntero("Indique la cantidad de canales del televisor: "));
        t1.mostrar();
        System.out.println("Encendiendo el televisor...");
        t1.cambiarEstado();
        t1.mostrar();
    }
    
    public void control(){
        int op;
        do{
            System.out.println("------ Control ------");
            System.out.println("1. Seleccionar canal");
            System.out.println("2. Subir canal");
            System.out.println("3. Bajar canal");
            System.out.println("4. Apagar televisor");
            System.out.print("-->");
            op = Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    t1.cambiarCanal(cargarEntero("Seleccione el canal: "));
                    t1.mostrar();
                    break;
                case 2:
                    t1.cambiarCanal(true);
                    t1.mostrar();
                    break;
                case 3:
                    t1.cambiarCanal(false);
                    t1.mostrar();
                    break;
                case 4:
                    System.out.println("Apagando el televisor...");
                    t1.cambiarEstado();
                    break;
            }
        }while(op != 4);
        System.out.println("Cantidad total de cambios de canal: " + t1.getContadorCambios());
    }
    
    private int cargarEntero(String msg){
        int iAux = -1;
        do{
            System.out.print(msg);
            iAux = Integer.parseInt(sc.nextLine());
        }while(iAux <= 0);
        return iAux;
    }
    
    public static void main(String[] args) {
        
        Principal app = new Principal();
        app.iniciarTelevisor();
        app.control();
        
    }

}
