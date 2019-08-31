/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author s109e17
 */
public class Operadores {
    
    private static int numeroA;
    private static int numeroB;
    

    
    public static void main(String[] args){
        numeroA=13;
        numeroB=10;
        
        //Operador modulo
        int resultadoModulo= numeroA % 2;
        System.out.println("El num es: "+ resultadoModulo);
       
       //operador de incremento
       int resultadoIncremento = numeroA++; //forma corta
       numeroA = numeroA + 1; //forma larga
       System.out.println("El res de incremento es: "+ resultadoIncremento);
       
       //operador decremento
        numeroB--; 
        numeroB=numeroB - 1;
        int resultadoDecremento = numeroB;
        System.out.println("El res de decremento es: "+ resultadoDecremento);
        
        //var boolean tiene dos opc true, false
        boolean estaVivo = true;
        estaVivo = !estaVivo;
        System.out.println("El valor de boolean es:" + estaVivo);
        
        if(estaVivo == true){
            System.out.println ("Esta vivo.");
              
        } else {
            
            System.out.println ("NO Esta vivo.");           
        
        }
            
        //sentencia condicional swicth
        String InicialNombre = "Z";
        switch(InicialNombre){
            case "A":
                System.out.println("Caso A");
                break;
            case "B":
                System.out.println("Caso B");
                break;
            default:
                System.out.println("Caso por defecto");
                break;
        
        }
    }
    
}
