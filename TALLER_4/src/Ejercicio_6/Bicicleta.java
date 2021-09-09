
package Ejercicio_6;


public class Bicicleta {
 private int acelera, acelera2, frena, frena2, velocidad, velocidad2, plato,plato2,  piñon, piñon2;

    
    // constructor por defecto
    public Bicicleta(){
      
    }
    
    // constructor sobrecragado 1

    public Bicicleta(int acelera, int acelera2, int frena, int frena2, int velocidad, int velocidad2, int plato, int plato2, int piñon, int piñon2) {
        this.acelera=acelera;
        this.velocidad = velocidad;
        this.velocidad2 = velocidad2;
        this.plato = plato;
        this.plato2 = plato2;
        this.piñon = piñon;
        this.piñon2 = piñon2;

    }

    public int getAcelera() {
        return acelera;
    }

    public int getAcelera2() {
        return acelera2;
    }

    public int getFrena() {
        return frena;
    }

    public int getFrena2() {
        return frena2;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVelocidad2() {
        return velocidad2;
    }

    public int getPlato() {
        return plato;
    }

    public int getPlato2() {
        return plato2;
    }

    public int getPiñon() {
        return piñon;
    }

    public int getPiñon2() {
        return piñon2;
    }

    public void setAcelera(int acelera) {
        this.acelera = acelera;
    }

    public void setAcelera2(int acelera2) {
        this.acelera2 = acelera2;
    }

    public void setFrena(int frena) {
        this.frena = frena;
    }

    public void setFrena2(int frena2) {
        this.frena2 = frena2;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVelocidad2(int velocidad2) {
        this.velocidad2 = velocidad2;
    }

    public void setPlato(int plato) {
        this.plato = plato;
    }

    public void setPlato2(int plato2) {
        this.plato2 = plato2;
    }

    public void setPiñon(int piñon) {
        this.piñon = piñon;
    }

    public void setPiñon2(int piñon2) {
        this.piñon2 = piñon2;
    }
    
    public int calculaAceleracion(){
    
        return this.velocidad * 2;

    }

    public int calculoFreno(){
        
        return this.velocidad / 2;
    
    
    }
    public int calculaAceleracion2(){
    
        return this.velocidad2 * 2;

    }
    
    public int calculoFreno2(){
        
        return this.velocidad2 / 2;
    
    
    }


}
    

