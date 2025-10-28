package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Cafetera {
    private int capMax;
    private int canAct;

    public Cafetera() {
        this.capMax = 1000;
        this.canAct = 0;
    }
    
    public Cafetera(int x) {
        this.capMax = x;
        this.canAct = x;
    }
    
    public Cafetera(int x, int y) {
        this.capMax = x;
        if(y < x){
            this.canAct = y;
        } else {
            this.canAct = x;
        }
    }
    
    Scanner sc = new Scanner(System.in);
    
    public int getCapMax() {
        return capMax;
    }

    private void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCanAct() {
        return canAct;
    }

    private void setCanAct(int canAct) {
        this.canAct = canAct;
    }
    
    public void llenarCafetera(){
        setCanAct(getCapMax());
    }
    
    public boolean servirTaza(int x){
        boolean b = false;
        if(getCanAct() >= x){
            System.out.println("Taza con " + x + "cc servida.");
            setCanAct(getCanAct() - x);
            b = true;
        } else {
            System.out.println("Taza con " + getCanAct() + "cc servida.");
            System.out.println("--- Cafetera Vacia ---");
            setCanAct(0);
        }
        return b;
    }
    
    public void vaciarCafetera(){
        setCanAct(0);
    }
    
    public void cargarCafetera(){
        cargarCantidad();
    }
    
    private void cargarCantidad(){
        int iAux = -1;
        do{
            System.out.print("Ingrese la cantidad de Cafe (Max 1000cc): ");
            iAux = Integer.parseInt(sc.nextLine());
        }while(iAux <= 0 || iAux >= 1000);
        setCanAct(iAux);
    }
    
    public void agregarCafe(int x){
        setCanAct(getCanAct() + x);
        if(getCanAct() > getCapMax()){
            setCanAct(getCapMax());
        }
    }
    
    public void mostrar(){
        System.out.printf("\n%-20s%-20s\n", "Capacidad Maxima", "Cantidad Actual");
        System.out.printf("%-20d%-20d\n\n", getCapMax(), getCanAct());
    }
}
