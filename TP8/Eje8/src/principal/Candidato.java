package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Candidato {

    // ====== Atributos privados ======
    private int id;
    private String nombre;
    private int votos;

    // ====== Constructor ======
    public Candidato(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.votos = 0;
    }

    // ====== Métodos get ======
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }
    
    // ====== Métodos set ======

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    // ====== Métodos funcionales ======
    public void agregarVoto() {
        setVotos(getVotos()+1);
    }

    public void mostrarCandidato() {
        System.out.printf("ID: %-4d | Nombre: %-15s | Votos: %-4d\n", getId(), getNombre(), getVotos());
    }
}