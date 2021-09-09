
package Ejercicio_5;

public class Triangulo_Fin {
    public static void main(String[] args) {

    Triangulo T = new Triangulo();
    T.setBase(40);
    T.setAltura(20);
    T.setladoA(18);
    T.setladoB(18);
    T.setladoC(9);
    T.setanguloA(20);
    T.setanguloB(30);

    imprimirInfoTriangulo(T); 
}

public static void imprimirInfoTriangulo(Triangulo r){
    System.out.println("El Area es: " + r.calcularArea());
    System.out.println("La Longitud lados iguales es: "+ r.calcularlongitud());
    System.out.println("El Perimetro es: " + r.calcularPerimetro());
    System.out.println("El angulo vertice es de: " + r.calcularAnguloVertice());
    System.out.println("-----------------------------------");
}
}

