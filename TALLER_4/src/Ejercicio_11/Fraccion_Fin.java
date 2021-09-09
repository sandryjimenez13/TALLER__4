
package Ejercicio_11;


public class Fraccion_Fin {
     static public void main(String[] args) {
     Fraccion x=new Fraccion(8,2);
     Fraccion y=new Fraccion(4,7);
     Fraccion z=new Fraccion(2,8);
     System.out.println("x-->  "+x);
     System.out.println("y-->  "+y);
     System.out.println("z-->  "+z);
     System.out.println("Suma = "+Fraccion.sumarFraccion(x, y));
     System.out.println("resta = "+Fraccion.restarFraccion(x, y));
     System.out.println("Multiplicacion = "+Fraccion.multiplicarFraccion(x,y));

     Fraccion resultado=Fraccion.multiplicarFraccion(Fraccion.sumarFraccion(x,y),z);
     System.out.println("\nSimplificacion=  " + resultado);
     System.out.println(resultado.simplificarFraccion());
     try  {
            System.in.read();
        }catch (Exception e) {  }
    }
}

