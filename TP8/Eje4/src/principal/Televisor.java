package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Televisor {

    // ===== Atributos privados =====
    private String marca;
    private int cantidadCanales;
    private boolean estado;
    private int pulgadas;
    private int canalActivo;
    private int contadorCambios;
    
    // ===== Constructor predeterminado =====
    public Televisor() {
        this.marca = "Samsung";
        this.cantidadCanales = 120;
        this.estado = false;
        this.pulgadas = 0;
        this.canalActivo = 1;
        this.contadorCambios = 0;
    }

    // ===== Constructor con parámetros (marca, pulgadas) =====
    public Televisor(String marca, int pulgadas) {
        this.marca = marca;
        this.cantidadCanales = 120;
        this.estado = false;
        this.pulgadas = pulgadas;
        this.canalActivo = 1;
        this.contadorCambios = 0;
    }

    // ===== Constructor con cantidad de canales =====
    public Televisor(int cantidadCanales) {
        this.cantidadCanales = cantidadCanales;
        this.estado = false;
        this.canalActivo = 1;
        this.contadorCambios = 0;
        this.marca = cargarCadena("Ingrese la marca del televisor: ");
        this.pulgadas = cargarEntero("Ingrese las pulgadas del televisor: ");
    }

    // ===== Getters y Setters =====

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadCanales() {
        return cantidadCanales;
    }

    public void setCantidadCanales(int cantidadCanales) {
        this.cantidadCanales = cantidadCanales;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getCanalActivo() {
        return canalActivo;
    }

    public void setCanalActivo(int canalActivo) {
        this.canalActivo = canalActivo;
    }
    
    public int getContadorCambios() {
        return contadorCambios;
    }

    public void setContadorCambios(int contadorCambios) {
        this.contadorCambios = contadorCambios;
    }

    // ===== Cargar datos =====
    private String cargarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        String sAux = "";
        do{
            System.out.print(msg);
            sAux = sc.nextLine();
        }while(sAux.equals(""));
        return sAux;
    }
    
    private int cargarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        int iAux = 0;
        do{
            System.out.print(msg);
            iAux = Integer.parseInt(sc.nextLine());
        }while(iAux <= 0);
        return iAux;
    }
    
    // ===== Cambiar estado =====
    public void cambiarEstado() {
        estado = !estado;
    }

    // ===== Mostrar información =====
    public void mostrar() {
        System.out.println("Marca: " + getMarca() + " | Pulgadas: " + getPulgadas() +
                " | Cantidad de canales: " + getCantidadCanales() +
                " | Estado: " + (isEstado() ? "Encendido" : "Apagado") +
                " | Canal activo: " + getCanalActivo());
    }

    // ===== Cambiar canal por número =====
    public void cambiarCanal(int nuevoCanal) {
        if(nuevoCanal > getCantidadCanales()){
            while(nuevoCanal > getCantidadCanales()){
                nuevoCanal-=getCantidadCanales();
            }
            setCanalActivo(nuevoCanal);
        } else {
            setCanalActivo(nuevoCanal);
        }
        setContadorCambios(getContadorCambios()+1);
    }

    // ===== Cambiar canal con booleano =====
    public void cambiarCanal(boolean subir) {
        if(subir){
            if((getCanalActivo() + 1) > getCantidadCanales()){
                setCanalActivo(1);
            } else {
                setCanalActivo(getCanalActivo() + 1);
            }            
        } else {
            if((getCanalActivo() - 1) < 1){
                setCanalActivo(getCantidadCanales());
            } else {
                setCanalActivo(getCanalActivo() - 1);
            }
        }
        setContadorCambios(getContadorCambios()+1);
    }
}
