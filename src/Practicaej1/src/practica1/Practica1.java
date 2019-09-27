/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.*;

/**
 *
 * @author Lorena
 */
public class Practica1 {

    public static Cuenta cuenta = null;
    
    public static void main(String[] args) {        
        
        Scanner miScanner = new Scanner(System.in);
           
        boolean respuestaCliente = true;
        String opcionboosaldo;
        double opcingresaldo;  
     
        int opcion;
        String nomTitular;
        double monto = 0;      
                
        while (respuestaCliente) { 
            
            System.out.println();
            System.out.println("		Bienvenido al Banco		");
            System.out.println("Ingrese el número de opción");
            System.out.println("1.	Crear cuenta.");
            System.out.println("2.	Ver saldo.");
            System.out.println("3.	Ingresar monto.");
            System.out.println("4.	Realizar retiro.");
            System.out.println("5.	Salir");
            System.out.println("...");
        
            opcion = miScanner.nextInt();
        
            switch (opcion){
                
            case 1: System.out.println("Ingrese nombre del titular de la cuenta");
                    nomTitular = miScanner.next();
                    System.out.println("Desea ingresar saldo a su cuenta? Si o No");
                    opcionboosaldo = miScanner.next();
                    
                    if (opcionboosaldo.toUpperCase().equals("SI")){
                        System.out.println("Ingrese la cantidad de dinero");
                        monto = miScanner.nextDouble();
                        cuenta = new Cuenta(nomTitular,monto);
            
                    }else{
                        cuenta = new Cuenta(nomTitular);          
                    }
            
                    System.out.println("Cuenta creada con exito");
                    break;
            
            case 2: System.out.println("Su saldo actual es: " + cuenta.getSaldo());    
                    break; 
            
            case 3: System.out.println("Por favor ingrese la cantidad de dinero a guardar en su cuenta:" );
                    opcingresaldo = miScanner.nextDouble();
                    if (opcingresaldo<0){ 
                        System.out.println("La cantidad no puede ser negativa" );
                    }else{
                        Cuenta.ingresar(opcingresaldo);
                        System.out.println("Transacción realizada con exito");
                    }
                    break;

            case 4: System.out.println("Por favor ingrese la cantidad de dinero a retirar de su cuenta:" );
                    opcingresaldo = miScanner.nextDouble();
                    if (opcingresaldo<0){ 
                        System.out.println("La cantidad no puede ser negativa" );
                    }else{
                        if (cuenta.getSaldo() < opcingresaldo){
                            System.out.println("SALDO INSUFICIENTE" );
                        }else{
                            Cuenta.retirar(opcingresaldo);
                            System.out.println("Transacción realizada con exito");
                        }
                    }
                    break;

            
            case 5: respuestaCliente=false;
                    break;
        }
    }     
}
       
}


