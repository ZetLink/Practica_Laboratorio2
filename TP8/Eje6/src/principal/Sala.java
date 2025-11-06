package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Sala {
    
    // ====== Atributo privado ======
    private Asiento[] vector;
    
    // ====== Constructor ======
    public Sala(int cantA) {
        this.vector = new Asiento[cantA];
        generarSala();
    }
    
    private void generarSala(){
        for(int i = 0; i < getVector().length; i++){
            Asiento oAux = new Asiento(i+1);
            vector[i] = oAux;
        }
    }
    
    public Asiento[] getVector() {
        return vector;
    }

    public void setVector(Asiento[] vector) {
        this.vector = vector;
    }
    
    // ====== Método para reservar un asiento ======
    public void reservarAsiento(int numero) {
        boolean b = false;
        int i = 0;
        while(i < getVector().length && !b){
            if(vector[i].getId() == numero){
                b = true;
                vector[i].reservarAsiento();
            }
            i++;
        }
    }
    
    // ====== Método para cancelar una reserva ======
    public void cancelarReserva(int numero) {
        boolean b = false;
        int i = 0;
        while(i < getVector().length && !b){
            if(vector[i].getId() == numero){
                b = true;
                vector[i].cancelarReserva();
            }
            i++;
        }
    }
    
    // ====== Método para consultar un asiento específico ======
    public void consultarAsiento(int numero) {
        boolean b = false;
        int i = 0;
        while(i < getVector().length && !b){
            if(vector[i].getId() == numero){
                b = true;
                vector[i].mostrarEstado();
            }
            i++;
        }
    }
    
    // ====== Método para mostrar el estado general ======
    public void mostrarSala(){
        for(int i = 0; i < getVector().length; i++){
            vector[i].mostrarEstado();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de asientos de la sala: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        Sala sala = new Sala(cantidad);
        System.out.println("\nEstado inicial de la sala:");
        sala.mostrarSala();

        System.out.print("\nIngrese el número de asiento a reservar: ");
        int numero = Integer.parseInt(sc.nextLine());
        sala.reservarAsiento(numero);

        System.out.println("\nEstado de la sala luego de la reserva:");
        sala.mostrarSala();

        System.out.print("\nIngrese el número de asiento a cancelar la reserva: ");
        numero = Integer.parseInt(sc.nextLine());
        sala.cancelarReserva(numero);

        System.out.println("\nEstado final de la sala:");
        sala.mostrarSala();
    }

}
