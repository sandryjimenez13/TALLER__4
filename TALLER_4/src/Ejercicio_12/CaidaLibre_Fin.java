
package Ejercicio_12;

import java.util.Scanner;

public class CaidaLibre_Fin {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CaidaLibre caidaL = new CaidaLibre();
        System.out.println("Digite la velocidad inicial: ");
        int VelocidadInicial = entrada.nextInt();  
        System.out.println("Digite el Tiempo en segundos: ");
        int tiempo = entrada.nextInt();
        caidaL.setVelocidadInicial(VelocidadInicial);
        caidaL.setTiempo(tiempo);
        caidaL.setGravedad(9.8);
        imprimirInfoCaidaLibre(caidaL);
          
    }
    public static void imprimirInfoCaidaLibre(CaidaLibre r) {
        System.out.println("La distancia recorrida por es de: " + r.Calculardistancia()+ " metros");
        System.out.println("La velocidad final es: " + r.velocidadFinal() + " m/s");
        
    }
    
}

