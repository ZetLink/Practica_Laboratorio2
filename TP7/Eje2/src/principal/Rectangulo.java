package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }
    
    Scanner sc = new Scanner(System.in);

    public double getBase() {
        return base;
    }

    private void setBase() {
        double dAux = -1;
        do{
            System.out.print("Base: ");
            dAux = sc.nextDouble();
            if(dAux <= 0){
                System.out.println("Error: Ingrese un numero mayor a 0.");
            }
        }while(dAux <= 0);
        this.base = dAux;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura() {
        double dAux = -1;
        do{
            System.out.print("Altura: ");
            dAux = sc.nextDouble();
            if(dAux <= 0){
                System.out.println("Error: Ingrese un numero mayor a 0.");
            }
        }while(dAux <= 0);
        this.altura = dAux;
    }
    
    public void cargarRectangulo(){
        setBase();
        setAltura();
    }
    
    public void mostrarRectangulo(){
        System.out.printf("Area: %.2f ... Perimetro %.2f\n", calcularArea(), calcularPerimetro());
    }
    
    public double calcularArea(){
        return getBase() * getAltura();
    }
    
    public double calcularPerimetro(){
        return 2 * getBase() + getAltura();
    }
}
