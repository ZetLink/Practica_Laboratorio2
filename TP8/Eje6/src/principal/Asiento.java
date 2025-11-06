package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Asiento {
    private int id;
    private boolean reservado;

    public Asiento(int id) {
        this.id = id;
        this.reservado = false;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public boolean isReservado() {
        return reservado;
    }

    private void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    
    public void reservarAsiento(){
        if(!isReservado()){
            setReservado(!isReservado());
            System.out.println("Asiento: N" + getId() + " reservado.");
        } else {
            System.out.println("Error: asiento ya reservado");
        }
    }
    
    public void cancelarReserva(){
        if(isReservado()){
            setReservado(!isReservado());
            System.out.println("Asiento: N" + getId() + " reserva cancelada.");
        } else {
            System.out.println("Error: asiento sin reserva");
        }
    }
    
    public void mostrarEstado(){
        System.out.printf("ID: %-3d | Estado: %s\n", getId(), (isReservado() ? "Ocupado" : "Libre"));
    }
}
