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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    public void cargarLibro(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Titulo: ");
            setTitulo(sc.nextLine());
        }while(getTitulo().equals(""));
        do{
            System.out.print("Autor: ");
            setAutor(sc.nextLine());
        }while(getAutor().equals(""));
        do{
            System.out.print("Año de Publicacion: ");
            setAnioPublicacion(sc.nextInt());
        }while(getAnioPublicacion() <= 0);
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
