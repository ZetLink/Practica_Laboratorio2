package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Jardin {
    private Planta[] plantas;

    Scanner sc = new Scanner(System.in);
    
    public Jardin() {
        this.plantas = null;
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    private void setPlantas(Planta[] plantas) {
        this.plantas = plantas;
    }
    
    public void crearJardin(){
        this.plantas = new Planta[cargarEntero("Ingrese la cantidad de Plantas: ")];
        cargarJardin();
    }
    
    private void cargarJardin(){
        for(int i = 0; i < getPlantas().length; i++){
            int existe;
            System.out.println("--- Cultivo N" + (i+1) + " ---");
            do{
                this.plantas[i] = new Planta();
                this.plantas[i].cargarPlanta();
                existe = buscarPlanta(this.plantas[i].getId(), i);
                if(existe != -1){
                    System.out.println("Cultivo Existente");
                }
            }while(existe != -1);
        }
        ordenarVector();
    }
    
    public void eliminarPlanta(){
        int buscado = cargarEntero("Ingrese el ID a eliminar: ");
        int pos = buscarPlanta(buscado, this.plantas.length);
        if(pos != -1){
            for (int i = pos; i < this.plantas.length - 1; i++) {
                this.plantas[i] = this.plantas[i + 1];
            }
            this.plantas[this.plantas.length - 1] = new Planta(0, "-", "-", false);
            System.out.println("Planta ID: " + buscado + " eliminado");
        } else {
            System.out.println("Planta no encontrada");
        }
    }
    
    public void consultarPlanta(){
        int buscado = cargarEntero("Ingrese el ID buscado: ");
        int pos = buscarPlanta(buscado, this.plantas.length);
        if(pos != -1){
            System.out.printf("%-4s%-20s%-20s%-8s\n", "ID", "Nombre", "Especie", "Estado");
            this.plantas[pos].motrarPlanta();
        } else {
            System.out.println("Planta no encontrada");
        }
    }
    
    public void mostrarPlantas(){
        System.out.printf("%-4s%-20s%-20s%-8s\n", "ID", "Nombre", "Especie", "Estado");
        for(Planta p : this.plantas){
            p.motrarPlanta();
        }
    }
    
    private int buscarPlanta(int x, int tam){
        int pos = -1;
        for(int i = 0; (i < tam) && (pos == -1); i++){
            if(this.plantas[i].getId() == x){
                pos = i;
            }
        }
        return pos;
    }
    
    private int cargarEntero(String msg){
        int iAux = -1;
        do{
            System.out.print(msg);
            iAux = Integer.parseInt(sc.nextLine());
        }while(iAux <= 0);
        return iAux;
    }
    
    private void ordenarVector(){
        boolean b;
        do{
            b = false;
            for(int i = 0; i < (this.plantas.length - 1); i++){
                if(this.plantas[i].getId() > this.plantas[(i+1)].getId()){
                    Planta aux = this.plantas[i];
                    this.plantas[i] = this.plantas[(i+1)];
                    this.plantas[(i+1)] = aux;
                    b = true;
                }
            }
        }while(b);
    }
}
