/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento1;

import java.util.Scanner;

/**
 *
 * @author s109e17
 */
public class Seguimiento1 {
   
    
    public static void main(String[] args){
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número para realizar la operación: ");
        int numero = miScanner.nextInt();
        System.out.println("El dato ingresado es: " + numero);
        
        
        switch(numero){
            case 1:
                System.out.println("El mes es: Enero");
                break;
            case 2:
                System.out.println("El mes es: Febrero");
                break;
            case 3:
                System.out.println("El mes es: Marzo");
                break;
            case 4:
                System.out.println("El mes es: Abril");
                break;
            case 5:
                System.out.println("El mes es: Mayo");
                break;
            case 6:
                System.out.println("El mes es: Junio");
                break;
            case 7:
                System.out.println("El mes es: Julio");
                break;
            case 8:
                System.out.println("El mes es: Agosto");
                break;
            case 9:
                System.out.println("El mes es: Septiembre");
                break;
            case 10:
                System.out.println("El mes es: Octubre");
                break;
            case 11:
                System.out.println("El mes es: Noviembre");
                break;
            case 12:
                System.out.println("El mes es: Diciembre");
                break;
            default:
            System.out.println("Caso por defecto");
            break;
        
        }
        
                
       
    }
    
}
