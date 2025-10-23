package principal;

/**
 * Alumno: Rojas Ulises Martin
 */
public class Saludo {
    
    public void saludar(){
        System.out.println("¡Hola! Bienvenido al programa");
    }
    
    public void saludar(String nombre){
        System.out.printf("¡Hola %s! Qué gusto verte.\n", nombre);
    }
    
    public void saludar(String nombre, int edad){
        if(edad >= 18){
            System.out.printf("Hola %s, eres mayor de edad.\n", nombre);
        } else {
            System.out.printf("Hola %s, eres menor de edad.\n", nombre);
        }
    }
}
