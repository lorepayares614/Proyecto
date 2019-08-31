
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lorena;
import java.util.*;

/**
 *
 * @author s109e17
 */
public class Lorena {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamando al procedimiento de imprimir nombre
        imprimirNombre();
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número 1 para realizar las operaciones: ");
        double numeroUno = miScanner.nextDouble();
        System.out.println("El dato ingresado es: " + numeroUno);
        
        System.out.print("Ingrese el número 2 para realizar las operaciones: ");
        double numeroDos = miScanner.nextDouble();
        System.out.println("El dato ingresado es: " + numeroDos);
        
        //Llamo la funcion sumar e imprimir el resultado 
        
        double resultadoSuma = sumarNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoSuma, "SUMA");
        
        ////Llamo la funcion restar e imprimir el resultado
        
        double resultadoResta = restarNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoResta, "RESTA");
        
        
        //Llamo la funcion multiplicar e imprimir el resultado
        
        double resultadoMultiplicacion = multiplicarNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoMultiplicacion, "MULTIPLICACION");
        
        //Llamo la funcion dividir e imprimir el resultado
        
        double resultadoDivision = dividirNumeros(numeroUno,numeroDos);
        imprimirResultado(resultadoDivision, "DIVISION");
    }    
        //Procedimiento para imprimir nombre
              
    private static void imprimirNombre(){
        //Comando para imprimir en consola
            System.out.println("Mi nombre es Lorena ");
        }

    /**
     * Función para sumar dos números
     * @param numeroUno
     * @param numeroDos
     * @return 
     */
    
    
        // TODO code application logic here
    
    private static double sumarNumeros(double numeroUno, double numeroDos ){
        double resultadoSuma = numeroUno + numeroDos;
        return resultadoSuma;
    }
    
    private static double restarNumeros(double numeroUno, double numeroDos ){
        double resultadoResta = numeroUno - numeroDos;
        return resultadoResta;
        
    }
    
    private static double multiplicarNumeros(double numeroUno, double numeroDos ){
        double resultadoMultiplicacion = numeroUno * numeroDos;
        return resultadoMultiplicacion;
        
    }
    
    private static double dividirNumeros(double numeroUno, double numeroDos){
        double resultadoDivision = numeroUno / numeroDos;
        return resultadoDivision;
        
    }
    
    //
    
    /**
     * 
     * @param resultado
     * @param tipoOperacion 
     */
    
    private static void imprimirResultado(double resultado, String tipoOperacion){
        System.out.println("La operación realizada es: " + tipoOperacion);
        System.out.println("El resultado es: " + resultado);
    
    
    }
}
