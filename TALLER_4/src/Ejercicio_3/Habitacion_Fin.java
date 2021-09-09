
package Ejercicio_3;

public class Habitacion_Fin {

    public static void main(String[] args) {
        
        Habitacion A = new Habitacion();
        imprimirHabitacion(A);
        
        Habitacion B = new Habitacion(8,3,5);
        imprimirHabitacion(B);
    }
    
    public static void  imprimirHabitacion(Habitacion h){
        System.out.println("Largo: " + h.getLargo());
        System.out.println("Ancho: " +h.getAncho());
        System.out.println("Alto: " + h.getAlto());
        System.out.println("Tapizado: " + h.CantidadTapizado());
        System.out.println("Enchape: " + h.CantidadEnchape());
        System.out.println("-----------------------------");
    }
}
    

