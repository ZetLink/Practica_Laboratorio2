package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Numero {
    private int valor;

    public Numero() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void cargarNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor del Numero: ");
        setValor(sc.nextInt());
    }
    
    public int sumar(int num){
        return getValor() + num;
    }
    
    public int sumar(Numero num){
        return getValor() + num.getValor();
    }
}
