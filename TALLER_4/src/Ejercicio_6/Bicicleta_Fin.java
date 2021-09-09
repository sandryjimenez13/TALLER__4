
package Ejercicio_6;

import java.util.Scanner;


public class Bicicleta_Fin {
 
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Bicicleta b = new Bicicleta();
        b.setVelocidad(16);
        b.setPlato(15);
        b.setPiñon(5);
        imprimirInfoBicicleta(b);
        System.out.print("velocidad: ");
        int x = entrada.nextInt();
        System.out.print("plato: ");
        int z = entrada.nextInt();
        System.out.print("piñon: ");
        int s = entrada.nextInt();

        Bicicleta a = new Bicicleta();
        a.setVelocidad(16);
        a.setPlato(15);
        a.setPiñon(5);
        a.setVelocidad2(x);
        a.setPlato2(z);
        a.setPiñon2(s);
        imprimirInfoBicicleta2(a);
             
    }
    
        public static void imprimirInfoBicicleta(Bicicleta r){
        System.out.println("Velocidad: "+ r.getVelocidad());
        System.out.println("Plato: "+ r.getPlato());
        System.out.println("Piñon: "+ r.getPiñon());
        System.out.println("Aceleracion: "+ r.calculaAceleracion());
        System.out.println("Frenado: "+ r.calculoFreno());
        System.out.println("-----------------------------------");
    
        }
        
        public static void imprimirInfoBicicleta2(Bicicleta u){
        System.out.println("-----------------------------------");
        System.out.println("Nueva Velocidad: "+ u.getVelocidad2());
        System.out.println("Nuevo Plato: "+ u.getPlato2());
        System.out.println("Nuevo Piñon: "+ u.getPiñon2());
        System.out.println("Nueva Aceleracion: "+ u.calculaAceleracion2());
        System.out.println("Nuevo Frenado: "+ u.calculoFreno2());
        System.out.println("-----------------------------------");
    
        }
        
        
}


