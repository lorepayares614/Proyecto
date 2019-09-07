/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento2;
import java.util.*;

/**
 *
 * @author s109e17
 */
public class Seguimiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjercicioUnoFor();
        //EjercicioDosFor();
        //EjercicioTresFor();
        //EjercicioCuatroFor(); 
        //EjercicioQuintoFor();
        //EjercicioSextoFor();
    }
    
    public static void EjercicioUnoFor() {
        
        int[] numUnoACien = new int[101];
        
                  
        for (int i = 1; i < numUnoACien.length; i++) {
            int num = numUnoACien[i];
            System.out.println(i);
                 
        }
        
    }
        
    public static void EjercicioDosFor() {
        
        int[] numCienAUno = new int[101];
        
                  
        for (int i = 100; i > 0; i--) {
            int num = numCienAUno[i];
            System.out.println(i);
                 
        }         
        
    }
    
    public static void EjercicioTresFor() {
        
        int[] numPares = new int[151];
        
                  
        for (int i = 1; i < numPares.length; i++) {
            if  (i % 2 == 0){
                System.out.println("El num es: "+ numPares);
        
        
        }else{
                i++;
                
                }
            //int num = numPares[i];
            System.out.println(i);
                 
        }       
        
        
    }
    
    public static void EjercicioCuatroFor() {
        
       int suma = 0;
        
                  
        for (int i = 1; i < 200; i++) {
            suma = suma + i ;
               
                 
        }     
         System.out.println(suma);    
        
    }
    
    public static void EjercicioQuintoFor() {
        
              
        //para ingresar los dias por texto
        Scanner scanner = new Scanner(System.in);
        
        //ingreso de numero
        System.out.print("Ingrese el numero: " );
        //Leer
        int num = scanner.nextInt();        
        System.out.println("número ingresado es: " + num);
        //Asignar el num ingresado al vector de numAsteriscos
            
        //impresión de datos
        for (int i = 0; i < num; i++) {
            System.out.println("*");
                 
        }     
        
        
        
    }
    
    public static void EjercicioSextoFor(){
        
        int[][] miMatriz = new int[10][10];
        
        int count = 0;
      
        
        for(int fila = 0; fila < count; fila++){ 
            for(int columna = 0; columna < count; columna++){
                for (int i = 1; i < fila; i++) {
                if  (i % 2 == 0){
                System.out.println("X");
        
        
                }else{
                i++;
                
                }
            //int num = numPares[i];
            System.out.println(i);
                 
        }           
            
            }
            System.out.println();
            
                
        
        }
        count = count+1;
        
    }
    
}
