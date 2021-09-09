
package Ejercicio_3;


public class Habitacion {


    
    private double largo, ancho, alto;
    
    public Habitacion(){
    }
    
    public Habitacion(double largo, double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
        this.largo = largo;
    }

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double CantidadEnchape(){
        return this.ancho*this.largo;
    }
    
    public double CantidadTapizado(){
        
        return 2*(this.alto*this.ancho) + 2 * (this.alto*this.largo);
    }
    
} 
