package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double x){
        if(x > 0){
            setCantidad(getCantidad() + x);
        }
    }
    
    public void retirar(double x){
        setCantidad(getCantidad() - x);
        if(getCantidad() <= 0){
            setCantidad(0);
        }
    }
    
    public void mostrar(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //----- Cuenta 1 -----
        System.out.println("---Cuenta 1---");
        String sAux = "";
        do{
            System.out.print("Nombre del Titular: ");
            sAux = sc.nextLine();
        }while(sAux.equals(""));
        Cuenta c1 = new Cuenta(sAux);
        double dAux = -1;
        do{
            System.out.print("Cantidad de dinero inicial: ");
            dAux = Double.parseDouble(sc.nextLine());
        }while(dAux < 0);
        c1.setCantidad(dAux);
        c1.mostrar();
        System.out.print("Cantidad de dinero a ingresar: ");
        dAux = Double.parseDouble(sc.nextLine());
        c1.ingresar(dAux);
        c1.mostrar();
        System.out.print("Cantidad de dinero a retirar: ");
        dAux = Double.parseDouble(sc.nextLine());
        c1.retirar(dAux);
        c1.mostrar();
    }

}
