package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Cafetera c1 = new Cafetera();
        
        c1.cargarCafetera();
        
        c1.mostrar();
        
        int cont = 0;
        boolean b = true;
        while(b){
            if(c1.servirTaza(240)){
                cont++;
            } else {
                b = false;
            }
        }
        System.out.println("Cantidad de tazas servidas con 240cc: " + cont);
        
        c1.mostrar();
    }

}
