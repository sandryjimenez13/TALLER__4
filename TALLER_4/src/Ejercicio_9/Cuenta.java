
package Ejercicio_9;

public class Cuenta {
  private String nombreCliente;
    private String numeroCuenta;
    private double saldo;

    //Constructor por defecto
    public Cuenta() {
    }

    //Constructor con parámetros
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {                         
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Constructor copia
    public Cuenta(final Cuenta c) {
        nombreCliente = c.nombreCliente;
        numeroCuenta = c.numeroCuenta;
        saldo = c.saldo;
    }

    //getters y setters
    public String getNombre() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setNombre(String nombre) {
        nombreCliente = nombre;
    }

    public void setNumeroCuenta(String cuenta) {
        numeroCuenta = cuenta;
    }

    public void setSaldo(double Saldo) {
        saldo = Saldo;
    }

    

    //método ingreso
    public boolean Consignar(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    //método retirar
    public boolean retirar(double n) {
        boolean retiroCorrecto = true;                                                                         
        if (n < 0) {
            retiroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            retiroCorrecto = false;
        }
        return retiroCorrecto;
    }

}  

