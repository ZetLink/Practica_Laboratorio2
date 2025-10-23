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

    private void setValor() {
        Scanner sc = new Scanner(System.in);
        int iAux = -1;
        do{
            System.out.print("Valor del Numero: ");
            iAux = sc.nextInt();
            if(iAux <= 0){
                System.out.println("Error: Ingrese un numero mayor a 0.");
            }
        }while(iAux <= 0);
        this.valor = iAux;
    }
    
    public void cargarNumero(){
        setValor();
    }
    
    public int sumar(int num){
        return getValor() + num;
    }
    
    public int sumar(Numero num){
        return getValor() + num.getValor();
    }
}
