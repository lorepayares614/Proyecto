/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotores;

/**
 *
 * @author s109e17
 */
public class Carro {
    
    private String color;
    private int nroPuertas;
    private int modelo;
    private String Marca;
    
    public void acelerar(){
    
    }
    
    public void frenar(){
    
    }
    
    public double valorCarro(){
        //Primera condición
        if(this.modelo > 2010 && this.nroPuertas == 4){
        return 50000000;
        }
       //Segunda condición
        if(this.modelo > 2010 && this.nroPuertas == 2){
        return 40000000;
        }
        
        if(this.modelo <= 2010 && this.nroPuertas == 4){
        return 40000000;
        }
        
        if(this.modelo <= 2010 && this.nroPuertas == 2){
        return 40000000;
        }
        
        return 1000000;
        
            
    }
    
    
}
