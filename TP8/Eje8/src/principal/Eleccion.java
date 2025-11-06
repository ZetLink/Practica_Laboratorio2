package principal;

/**
 * Alumno: Rojas Ulises Martin
 */

import java.util.Scanner;

public class Eleccion {

    // ====== Atributos privados ======
    private Candidato[] candidatos;
    private int cantidad;

    // ====== Constructor ======
    public Eleccion(int maxCandidatos) {
        this.candidatos = new Candidato[maxCandidatos];
        this.cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // ====== Método para inscribir un candidato ======
    public void inscribirCandidato(int id, String nombre) {
        int i = 0;
        boolean b = false;
        while(i < candidatos.length && !b){
            if(candidatos[i] == null){
                b = true;
                Candidato oAux = new Candidato(id, nombre);
                candidatos[i] = oAux;
                setCantidad(getCantidad() + 1);
            }
            i++;
        }
        if(!b){
            System.out.println("No hay mas espacio en el vector");
        }
    }

    // ====== Método para eliminar un candidato ======
    public void eliminarCandidato(int id) {
        if(getCantidad() > 0){
            int i = 0;
            boolean b = false;
            while(i < candidatos.length && !b){
                if(candidatos[i].getId() == id){
                    b = true;
                    candidatos[i] = null;
                    setCantidad(getCantidad() - 1);
                }
                i++;
            }
            if(!b){
                System.out.println("Candidato No Encontrado");
            } else {
                System.out.println("Candidato Eliminado");
            }   
        } else {
            System.out.println("Vector sin candidatos");
        }
    }

    // ====== Método para registrar un voto ======
    public void registrarVoto(int id) {
        if(getCantidad() > 0){
            int i = 0;
            boolean b = false;
            while(i < candidatos.length && !b){
                if(candidatos[i].getId() == id){
                    b = true;
                    candidatos[i].setVotos(candidatos[i].getVotos()+1);
                }
                i++;
            }
            if(!b){
                System.out.println("Candidato No Encontrado");
            }   
        } else {
            System.out.println("Vector sin candidatos");
        }
    }

    // ====== Método para consultar votos de un candidato ======
    public void consultarVotos(int id) {
        if(getCantidad() > 0){
            int i = 0;
            boolean b = false;
            while(i < candidatos.length && !b){
                if(candidatos[i].getId() == id){
                    b = true;
                    candidatos[i].mostrarCandidato();

                }
                i++;
            }
            if(!b){
                System.out.println("Candidato No Encontrado");
            }   
        } else {
            System.out.println("Vector sin candidatos");
        }
    }

    // ====== Método para mostrar todos los candidatos ======
    public void mostrarCandidatos() {
        if(getCantidad() > 0){
            for(int i = 0; i < candidatos.length; i++){
                if(candidatos[i] != null){
                    candidatos[i].mostrarCandidato();
                }
            }
        } else {
            System.out.println("Vector sin candidatos");
        }
    }

    // ====== Método main ======
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        do{
            System.out.print("Ingrese la cantidad máxima de candidatos: ");
            max = Integer.parseInt(sc.nextLine());
        }while(max <= 0);

        Eleccion eleccion = new Eleccion(max);

        int op;
        do{
            int idBuscado = -1;
            System.out.println("--- Menu Elecciones ---");
            System.out.println("1. Inscribir candidatos");
            System.out.println("2. Registrar votos");
            System.out.println("3. Consultar votos");
            System.out.println("4. Eliminar candidato");
            System.out.println("5. Mostrar listado de candidatos");
            System.out.println("0. Salir");
            System.out.print("-->");
            op = Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    int iAux = -1;
                    do{
                        System.out.print("ID del Candidato: ");
                        iAux = Integer.parseInt(sc.nextLine());
                    }while(iAux <= 0);
                    String sAux = "";
                    do{
                        System.out.print("Nombre del candidato: ");
                        sAux = sc.nextLine();
                    }while(sAux.equals(""));
                    eleccion.inscribirCandidato(iAux, sAux);
                    break;
                case 2:
                    idBuscado = -1;
                    do{
                        System.out.print("ID del Candidato buscado para sumar votos: ");
                        idBuscado = Integer.parseInt(sc.nextLine());
                    }while(idBuscado <= 0);    
                    eleccion.registrarVoto(idBuscado);
                    break;
                case 3:
                    idBuscado = -1;
                    do{
                        System.out.print("ID del Candidato buscado para consultar votos: ");
                        idBuscado = Integer.parseInt(sc.nextLine());
                    }while(idBuscado <= 0);    
                    eleccion.consultarVotos(idBuscado);
                    break;
                case 4:
                    idBuscado = -1;
                    do{
                        System.out.print("ID del Candidato a eliminar: ");
                        idBuscado = Integer.parseInt(sc.nextLine());
                    }while(idBuscado <= 0);    
                    eleccion.eliminarCandidato(idBuscado);
                    break;
                case 5:
                    eleccion.mostrarCandidatos();
                    break;
            }
        }while(op != 0);
    }
}