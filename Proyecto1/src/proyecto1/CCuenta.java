/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Clase que permite crear objetos Cuenta Corriente, con los atributos ...
 * @author María Navarro Elbal
 * @version 1.0 28/02/2023
 * 
 * 
 *
 */
public class CCuenta {
    /**
     * nombre tipo String atributo que identifica el nombre del titular cuenta
     */
    private String nombre; 
    /**
     * cuenta tipo String atributo que identifica el numero cuenta de 20 dígitos
     */
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    /**
     * Constructor de la clase CCuenta sin argumentos
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom tipo String, parámetro que identifica el nombre del titular de la CCuenta
     * @param cue tipo String, parámetro que identifica el número de cuenta, 20 dígitos de la CCuenta
     * @param sal
     * @param tipo 
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom tipo String, para asignar nombre del titular de la cuenta
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    
    /**
     * Método que devuelve el nombre del titular de la Ccuenta
     * @return tipo String con el valor del atributo nombre, titular de la CCuenta
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return 
     */
    public double getEstado() {
        return getSaldo();
    }

    
    
    /**
     * Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad tipo double, ...
     * @throws Exception tipo Exception cuando el argumento cantidad sea inferior a 0
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    /**
     * 
     * @param cantidad 
     * @exception lanza Exception cuando cantidad sea inferior
     */
    public void retirar(double cantidad) throws Exception  {
        if (cantidad <= 0) {
             throw new Exception("No se puede retirar una cantidad negativa");
           
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    // Método que me devuelve el número de cuenta
     public String getCuenta() {
        return cuenta;
       
    }
     
     //encapsulated fields

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
     
     
}
