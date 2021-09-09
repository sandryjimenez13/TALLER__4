
package Ejercicio_2;

import java.util.Scanner;


public class Ecuancion_Fin {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Favor escriba Valor de X: ");
        int x = entrada.nextInt();
        
        Ecuacion e = new Ecuacion();
        e.setA(10);
        e.setB(9);
        e.setC(5);
        
        System.out.printf("Y(%d)= %.2f%n",x, e.EvaluarEcuacion(x) );
        
        
        Ecuacion eSobrecargada = new Ecuacion(3,2,5);
        System.out.printf("* Y(%d)= %.2f%n",x, eSobrecargada.EvaluarEcuacion(x) );
        
        Ecuacion eSobrecargada2 = new Ecuacion(3,2);
        System.out.printf("* Y(%d)= %.2f%n",x, eSobrecargada2.EvaluarEcuacion(x) );
        
    }
}

