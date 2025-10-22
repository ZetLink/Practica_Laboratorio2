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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void cargarRectangulo(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Base: ");
            setBase(sc.nextDouble());
        }while(getBase() <= 0);
        do{
            System.out.print("Altura: ");
            setAltura(sc.nextDouble());
        }while(getAltura() <= 0);
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
