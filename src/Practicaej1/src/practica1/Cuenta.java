package practica1;

import static practica1.Practica1.cuenta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lorena
 */
public class Cuenta {
    
    String nomTitular;
    double saldo;
    
    public Cuenta(String nomTitular, double saldo){
        this.nomTitular = nomTitular;
        this.saldo = saldo;
    
    }
    
    public Cuenta(String nomTitular){
        this.nomTitular = nomTitular;
        this.saldo = 0;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     public static void ingresar(double cantidad){
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        }
        
        public static void retirar(double cantidad){
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
        }
    
}
