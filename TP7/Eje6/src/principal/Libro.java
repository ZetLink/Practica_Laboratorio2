package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro() {
    }
    
    Scanner sc = new Scanner(System.in);

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo() {
        String sAux = "";
        do{
            System.out.print("Titulo: ");
            sAux = sc.nextLine();
            if(sAux.equals("")){
                System.out.println("Error: No se permite un String vacio.");
            }
        }while(sAux.equals(""));
        this.titulo = sAux;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor() {
        String sAux = "";
        do{
            System.out.print("Autor: ");
            sAux = sc.nextLine();
            if(sAux.equals("")){
                System.out.println("Error: No se permite un String vacio.");
            }
        }while(sAux.equals(""));
        this.autor = sAux;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    private void setAnioPublicacion() {
        int iAux = -1;
        do{
            System.out.print("Año de Publicacion: ");
            iAux = sc.nextInt();
            if(iAux <= 0){
                System.out.println("Error: Error: Ingrese un numero mayor a 0");
            }
        }while(iAux <= 0);
        this.anioPublicacion = iAux;
    }
    
    public void cargarLibro(){
            setTitulo();
            setAutor();
            setAnioPublicacion();
    }
    
    public void mostrarLibro(){
        System.out.printf("Titulo: %s | Autor: %s | Año: %d\n", getTitulo(), getAutor(), getAnioPublicacion());
        muestraAntiguo();
    }
    
    private boolean esAntiguo(){
        boolean antiguo = false;
        if(getAnioPublicacion() < 2000){
            antiguo = true;
        }
        return antiguo;
    }
    
    public void muestraAntiguo(){
        if(esAntiguo()){
            System.out.println("¿Es antiguo? Si, es antiguo");
        } else {
            System.out.println("¿Es antiguo? No, no es antiguo");
        }
    }
}
