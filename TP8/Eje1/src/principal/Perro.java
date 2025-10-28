package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Perro {
    private String nombre;
    private String raza;
    private float peso;
    private String color;
    private int anion;
    
    Scanner sc = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    private void setNombre() {
        String sAux = "";
        do{
            System.out.print("Nombre: ");
            sAux = sc.nextLine();
        }while(sAux.equals(""));
        this.nombre = sAux;
    }

    public String getRaza() {
        return raza;
    }

    private void setRaza() {
        String sAux = "";
        do{
            System.out.print("Raza: ");
            sAux = sc.nextLine();
        }while(sAux.equals(""));
        this.raza = sAux;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso() {
        float fAux = -1;
        do{
            System.out.print("Peso: ");
            fAux = Float.parseFloat(sc.nextLine());
        }while(fAux <= 0);
        this.peso = fAux;
    }

    public String getColor() {
        return color;
    }

    private void setColor() {
        String sAux = "";
        do{
            System.out.print("Color: ");
            sAux = sc.nextLine();
        }while(sAux.equals(""));
        this.color = sAux;
    }

    public int getAnion() {
        return anion;
    }

    private void setAnion() {
        int iAux = -1;
        do{
            System.out.print("Año de Nacimiento: ");
            iAux = Integer.parseInt(sc.nextLine());
        }while(iAux <= 0);
        this.anion = iAux;
    }
    
    public void ladrar(int x){
        System.out.print("u u u");
        int i=0;
        while(i < x){
            System.out.print(" u");
            i++;
        }
        System.out.println("");
    }
    
    public void ladrar(char x){
        System.out.println("u u u " + x);
    }
    
    public void ladrar(boolean x){
        if(x){
            System.out.println("uuu");
        }
    }
    
    public void cargar(){
        setNombre();
        setRaza();
        setPeso();
        setColor();
        setAnion();
    }
    
    public void mostrar(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", color=" + color + ", año_nacimiento=" + anion + '}';
    }
    
}
