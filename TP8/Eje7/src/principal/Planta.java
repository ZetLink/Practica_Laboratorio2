package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Planta {
    private int id;
    private String nombre;
    private String especie;
    private boolean estado;
    
    Scanner sc = new Scanner(System.in);

    public Planta() {
    }

    public Planta(int id, String nombre, String especie, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    private void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isEstado() {
        return estado;
    }

    private void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void cargarPlanta(){
        setId(cargarEntero("ID: "));
        setNombre(cargarCadena("Nombre: "));
        setEspecie(cargarCadena("Especie: "));
        setEstado(cargarEstado("Estado (B=Bueno | M=Malo): "));
    }
    
    private int cargarEntero(String msg){
        int iAux = -1;
        do{
            System.out.print(msg);
            iAux = Integer.parseInt(sc.nextLine());
        }while(iAux < 1);
        return iAux;
    }
    
    private String cargarCadena(String msg){
        String sAux = "";
        do{
            System.out.print(msg);
            sAux = sc.nextLine();
        }while(sAux.equals(""));
        return sAux;
    }
    
    private boolean cargarEstado(String msg){
        char cAux = ' ';
        do{
            System.out.print(msg);
            cAux = sc.nextLine().toUpperCase().charAt(0);
        }while(cAux != 'B' && cAux != 'M');
        return (cAux == 'B');
    }
    
    public void motrarPlanta(){
        System.out.printf("%-4d%-20s%-20s%-8s\n", getId(), getNombre(), getEspecie(), (isEstado() ? "Bueno" : "Malo"));
    }
}
